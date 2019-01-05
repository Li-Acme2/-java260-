package TCP������;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args){
		try{
			@SuppressWarnings("unused")
			Server server=new Server(8083);        //����˿ں�ʵ��������
		}catch(Exception e){                         //�����쳣
			System.out.println("���Է������˼�������"+e.getMessage());
		}
	}

}
class Server{                           //Socket��������
	private int port;                             //�˿�
	public Server(int port) {                    //�������Ĺ��췽�����г�ʼ��
		// TODO Auto-generated constructor stub
		this.port=port;
		start();                                        //���������������˵ķ���
	}
	public String infoUpperCase(String line){           //������Ϣ
		return line.toUpperCase();                    //���ַ�����д
	}
	@SuppressWarnings("resource")
	private void start() {                       //������������
		// TODO Auto-generated method stub
		try{
			ServerSocket serversocket = new ServerSocket(port);   //���ݶ˿ڴ�����������Socket����
			System.out.println("�������������������˿ںţ�"+port);    //��ʾ������Ϣ
			System.out.println("���ڵȴ��ͻ�������......");
			Socket socketAccept=serversocket.accept();        //����ȴ��ͻ�������
			BufferedReader in= new BufferedReader(new InputStreamReader(socketAccept.getInputStream()));//��ȡ��ȡ�ͻ��˵�������
			       //��ȡд��ͻ��˵����������������true��ʾ�Զ�ˢ�����������
			PrintWriter out = new PrintWriter(socketAccept.getOutputStream(),true);
			out.println("�����������ӳɹ�.......");                //��ͻ�����������Ϣ
			out.println("����quit�Ͽ���������˵�����");
			boolean done=false;
			while(!done){
				String line=in.readLine();//��ȡ�ͻ���ÿ�е�����
				if(line==null){             //û��д�򲻶�ȡ
					done=true;
				}else{
					System.out.print("���Կͻ��˵���Ϣ��"+line);   //��ʾ�ͻ��˷��͵�����
					String message=infoUpperCase(line);          //��Ϣ����
					out.println("���Է������˵���Ϣ��"+message);//��ͻ��˷�����Ϣ
					if(line.trim().equals("quit"))  //�˳��ж�
						done=true;
				}
			}
			socketAccept.close();           //�ر�ͨ����Դ
		}catch(Exception e){                    //�����쳣
			System.out.println("�����������˳��ֳ���"+e.getMessage());
		}
	}
	
}
