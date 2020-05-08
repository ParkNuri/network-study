package chat.step07;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ClientChatListener implements ActionListener{
	ClientChatView view;

	public ClientChatListener(ClientChatView view) {
		super();
		this.view = view;
	}
	
	//버튼을 누를때, 텍스트상자에서 엔터키를 입력할때 actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		//4.=========클라이언트가 메시지를 입력화고 엔터키나 전송버튼을 누르면 서버에 전송=====================
		//ActionEvent(안드로이드에서 click이벤트라고 생각)를 발생시킨 객체가 텍스트필드이거나 버튼이면 실행하라는 의미
		if(e.getSource() == view.txtinput | e.getSource()==view.btnsend) {
			view.sendMsg(view.txtinput.getText());
			view.txtinput.setText("");
			
		}
		
	}
	
	
}
