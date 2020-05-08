package chat.step08;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ClientChatView extends JFrame {

	 JPanel contentPane;
	 JTextField txtinput;
	 JTextArea taChat;
	 JButton btnsend;
	 JList lstconnect;

	 String ip;
	 int port;
	 String nickname;
	 Socket socket;
	 
	 InputStream is;
	 InputStreamReader ir;
	 BufferedReader br;
	 
	 OutputStream os;
	 PrintWriter pw;
	 
	 
	 //2. ================ 채팅하는 사용자들의 목록을 JList에 추가(nickname)하기 위한 변수=========
	 Vector<String> nicknamelist = new Vector<String>();
	 StringTokenizer st;
	 
	 //=============================================================================
	public ClientChatView(String ip,int port, String nickname) {
		this.ip = ip;
		this.port = port;
		this.nickname = nickname;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		taChat = new JTextArea();
		taChat.setBounds(12, 10, 501, 375);
		
		//contentPane.add(taChat);
		
		JScrollPane scroll = new JScrollPane(taChat);
		scroll.setBounds(12,10,501,375);
		contentPane.add(scroll);
		//taChat.add(scroll);
		
		txtinput = new JTextField();
		txtinput.setBounds(12, 395, 378, 35);
		contentPane.add(txtinput);
		txtinput.setColumns(10);
		
		btnsend = new JButton("\uC11C\uBC84\uB85C\uC804\uC1A1");
		btnsend.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnsend.setBounds(402, 395, 109, 35);
		contentPane.add(btnsend);
		
		JLabel lblNewLabel = new JLabel("\uC811\uC18D\uC790:");
		lblNewLabel.setFont(new Font("HY견고딕", Font.BOLD, 14));
		lblNewLabel.setBounds(519, 10, 120, 35);
		contentPane.add(lblNewLabel);
		
		lstconnect = new JList();
		lstconnect.setBounds(525, 47, 205, 108);
		contentPane.add(lstconnect);
		//접속한 사용자의 정보가 nicknamelist에 저장되어있고 그 벡터를 JList에 출력
		lstconnect.setListData(nicknamelist);
		//===================여기까지 화면 만듬=====================
		
		
		setVisible(true);//화면에 JFramedmf을 보이도록 설정
		
		//이벤트 연결하기
		ClientChatListener listener = new ClientChatListener(this);
		txtinput.addActionListener(listener);
		btnsend.addActionListener(listener);
		
		
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				//run
			}
			
		});
		
		connectServer();//서버에 접속
		
	}
	
		
	public void connectServer() {
		try {
			socket = new Socket(ip,port);
			if(socket!=null) {
				ioWork();
			}
			
			
			
			//서버한테 nickname보내기
			sendMsg(nickname);
			nicknamelist.add(nickname);
			
			Thread receiveThread = new Thread(new Runnable() {
				private boolean run = true;
				@Override
				public void run() {
					while(true) {
						String msg;
						try {
							msg = br.readLine();
							System.out.println("서버가 전달한 메시지>>"+msg);
							//10. 서버에서 전달된 메시지를 분석하는 메소드-------
							filteringMsg(msg);
							//====================================
						} catch (IOException e) {
							
							//e.printStackTrace();
							
							//interrupt로 종료
							try {
								is.close();
								ir.close();
								br.close();
								os.close();
								pw.close();
								socket.close();
								JOptionPane.showMessageDialog(null, "서버와 접속이 끊어짐", "알림", JOptionPane.ERROR_MESSAGE);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							break;
						}
					}
				}
				/*public void setStatus() {
					
				}*/
			});
			receiveThread.start();
			
			//taChat.append(msg+"\n");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	//9. 서버가 보내오는 데이터를 분석해서 처리하는 메소드를 정의
	private void filteringMsg(String msg) {
		st =new StringTokenizer(msg, "/");
		String protocol = st.nextToken();	// 어떤 작업을 했는지를 알 수 있는 키워드 (new, old, chatting...)
		String message = st.nextToken();
		/*
		st.nextToken();
		if(st.nextToken() != null) {
			nickname = st.nextToken();
		}*/
		System.out.println("프로토콜: "+protocol+", 메시지: "+message);
		
		if(protocol.equals("new")) {
			//새로운 사용자가 접속하면 실행되는 부분
			//nicknamelist에 추가
			nicknamelist.add(message);
			//벡터의 데이터를 새로고침
			lstconnect.setListData(nicknamelist);
			//클라이언트 창에 메세지 출력
			taChat.append("**********"+message+"**********\n");
		}else if(protocol.equals("old")) {
			nicknamelist.add(message);	//nickname을 vector에 저장
			lstconnect.setListData(nicknamelist);
			taChat.append("**********"+message+"**********\n");
		}//5. 서버가 보내는 메시지의 protocol이 chatting이면 클라이언트의 textArea에 출력
		else if(protocol.equals("chatting")) {
			String nickname = st.nextToken();
			taChat.append(nickname+" : "+message+"\n");
			
		}
		// 1. 서버가 전달한 메시지의 프로토콜이 out이면 nickname리스트에서 해당 nickname을 제거
		else if(protocol.equals("out")) {
			nicknamelist.remove(message);
			lstconnect.setListData(nicknamelist);

			taChat.append("***"+nickname+"님이 퇴장하셨습니다\n"+"***");
		}
		
	}
	//-------------------------------------------------
	public void ioWork() {
		try {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			pw = new PrintWriter(os,true);
			
		} catch (IOException e) {

			e.printStackTrace();
		
		}
	}
	
	public void sendMsg(String message) {
		System.out.println("클라이언트가 서버에게 메시지 전송하기:"+message);
		pw.println(message);
	}
	
	
	
}





