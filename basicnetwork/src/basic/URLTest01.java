package basic;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

// URL클래스
// => 인터넷에서 확인할 수 있는 자원을 추출
public class URLTest01 {

	public static void main(String[] args) {
			URL url;
			FileOutputStream fos = null;
			try {
				url = new URL("http://cafefiles.naver.net/20120209_226/pododumok_13287752996753FNE4_jpg/%C0%E5%B5%BF%B0%C7_5_pododumok.jpg");
				
				/*File file = new File("C:/iot/work/network/basicnetwork/src/image/jang.jpg");
				
				BufferedImage bi = null;
		        
				bi = ImageIO.read(url);
				
				ImageIO.write(bi, "jpg", file);*/
				BufferedInputStream bis = new BufferedInputStream(url.openStream());
				fos = new FileOutputStream("src/image/jangIMG.jpg");
				
				while(true) {
					int databyte = bis.read();
					if(databyte==-1) {
						break;
					}
					fos.write(databyte);
				}
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(fos!=null) {
					try {
						fos.close();	// 안하면 write 안됨
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

	}

}
