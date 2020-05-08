package basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress - IP를 표현하기 위한 객체
public class InetAddresssTest {

	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName(args[0]);
			System.out.println("ia hostname : "+ ia.getHostName()+
					"\n ia address : "+ ia.getHostAddress()+
					"\n ia localhost : "+InetAddress.getLocalHost());
			
			InetAddress[] iaArr =InetAddress.getAllByName(args[0]);
			for(int i = 0; i<iaArr.length;i++) {
				System.out.println("ia hostname : "+ iaArr[i].getHostName()+
						"\n ia address : "+ iaArr[i].getHostAddress());
			}	// 2개가 실행됨
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
