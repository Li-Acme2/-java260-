package TCP�ͻ���;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		try{
			Server server=new Server(8080);
		}catch(Exception e){
			System.out.println("���Է������˼�������"+e.getMessage());
		}
	}

}
class Server{
	private int port;
	public Server(int port) {
		// TODO Auto-generated constructor stub
		this.port=port;
		start();
	}
	public String infoUpperCase(String line){
		return line.toUpperCase();
	}
	@SuppressWarnings("resource")
	private void start() {
		// TODO Auto-generated method stub
		try{
			ServerSocket serversocket = new ServerSocket(port);
			System.out.println("�������������������˿ںţ�"+port);
			System.out.println("���ڵȴ��ͻ�������......");
			Socket socketAccept=serversocket.accept();
			BufferedReader in= new BufferedReader(new InputStreamReader(socketAccept.getInputStream()));
			PrintWriter out = new PrintWriter(socketAccept.getOutputStream(),true);
			out.println("�����������ӳɹ�.......");
			out.println("����quit�Ͽ���������˵�����");
			boolean done=false;
			while(!done){
				String line=in.readLine();
				if(line==null){
					done=true;
				}else{
					System.out.print("���Կͻ��˵���Ϣ��"+line);
					String message=infoUpperCase(line);
					out.println("���Է������˵���Ϣ��"+message);
					if(line.trim().equals("quit")){
						done=true;
					}
				}
				socketAccept.close();
			}
		}catch(Exception e){
			System.out.println("�����������˳��ֳ���"+e.getMessage());
		}
	}
	
}
