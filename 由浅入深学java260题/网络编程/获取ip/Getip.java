package ��ȡip;
/*��ȡ��ַʱ������ʹ��try-catch���Χ������������׳��쳣*/
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Getip {
	public static void main(String[] args){
		InetAddress baidu=null;               //����һ��InetAddress����Űٶȵĵ�ַ
		InetAddress []yahoo=null;            //����һ��InetAddress�����yahoo�ĵ�ַ����
		InetAddress myip=null;                     //����һ��InetAddress����ű�����ַ
		try{
			baidu=InetAddress.getByName("www.baidu.com"); //��getByName����ȡ�ٶȵ�ip��ַ
			myip=InetAddress.getLocalHost();       //��ñ�����ip��ַ
			yahoo=InetAddress.getAllByName("www.yahoo.com.cn");//��getAllByName����ȡyahoo��ip��ַ
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
		System.out.println(baidu);           //��ӡ�ٶȵĵ�ַ
		System.out.println(myip);            //��ӡ������ַ
		for(int i=0;i<yahoo.length;i++)             //��ӡ��yahoo�ĵ�ַ����
			System.out.println(yahoo[i]);
	}

}
