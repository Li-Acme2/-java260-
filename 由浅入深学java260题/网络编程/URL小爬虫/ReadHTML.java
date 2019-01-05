package URL–°≈¿≥Ê;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ReadHTML {
	public static void main(String[] args) throws IOException{
		URL url = new URL("http://www.baidu.com");
		URLConnection uc=url.openConnection();
		BufferedReader r = new BufferedReader(new InputStreamReader(uc.getInputStream(),"GB2312"));
		String s;
		while((s=r.readLine())!=null){
			System.out.println(s);
		}
		r.close();
		}

}
