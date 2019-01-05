package 获取ip;
/*获取地址时，必须使用try-catch块包围起来，否则会抛出异常*/
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Getip {
	public static void main(String[] args){
		InetAddress baidu=null;               //创建一个InetAddress来存放百度的地址
		InetAddress []yahoo=null;            //创建一个InetAddress来存放yahoo的地址数组
		InetAddress myip=null;                     //创建一个InetAddress来存放本机地址
		try{
			baidu=InetAddress.getByName("www.baidu.com"); //用getByName来获取百度的ip地址
			myip=InetAddress.getLocalHost();       //获得本机的ip地址
			yahoo=InetAddress.getAllByName("www.yahoo.com.cn");//用getAllByName来获取yahoo的ip地址
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
		System.out.println(baidu);           //打印百度的地址
		System.out.println(myip);            //打印本机地址
		for(int i=0;i<yahoo.length;i++)             //打印出yahoo的地址数组
			System.out.println(yahoo[i]);
	}

}
