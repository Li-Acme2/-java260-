package TCP客户端;

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
			System.out.println("测试服务器端监听出错："+e.getMessage());
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
			System.out.println("服务器已启动，监听端口号："+port);
			System.out.println("正在等待客户端连接......");
			Socket socketAccept=serversocket.accept();
			BufferedReader in= new BufferedReader(new InputStreamReader(socketAccept.getInputStream()));
			PrintWriter out = new PrintWriter(socketAccept.getOutputStream(),true);
			out.println("服务器端连接成功.......");
			out.println("输入quit断开与服务器端的连接");
			boolean done=false;
			while(!done){
				String line=in.readLine();
				if(line==null){
					done=true;
				}else{
					System.out.print("来自客户端的信息："+line);
					String message=infoUpperCase(line);
					out.println("来自服务器端的信息："+message);
					if(line.trim().equals("quit")){
						done=true;
					}
				}
				socketAccept.close();
			}
		}catch(Exception e){
			System.out.println("启动服务器端出现出错："+e.getMessage());
		}
	}
	
}
