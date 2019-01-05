package TCP服务器;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args){
		try{
			@SuppressWarnings("unused")
			Server server=new Server(8083);        //传入端口号实例化对象
		}catch(Exception e){                         //捕获异常
			System.out.println("测试服务器端监听出错："+e.getMessage());
		}
	}

}
class Server{                           //Socket服务器端
	private int port;                             //端口
	public Server(int port) {                    //待参数的构造方法进行初始化
		// TODO Auto-generated constructor stub
		this.port=port;
		start();                                        //调用启动服务器端的方法
	}
	public String infoUpperCase(String line){           //处理信息
		return line.toUpperCase();                    //将字符串大写
	}
	@SuppressWarnings("resource")
	private void start() {                       //启动服务器端
		// TODO Auto-generated method stub
		try{
			ServerSocket serversocket = new ServerSocket(port);   //根据端口创建服务器端Socket对象
			System.out.println("服务器已启动，监听端口号："+port);    //显示连接信息
			System.out.println("正在等待客户端连接......");
			Socket socketAccept=serversocket.accept();        //挂起等待客户的请求
			BufferedReader in= new BufferedReader(new InputStreamReader(socketAccept.getInputStream()));//获取读取客户端的数据流
			       //获取写入客户端的数据输出流，参数true表示自动刷新输出缓冲区
			PrintWriter out = new PrintWriter(socketAccept.getOutputStream(),true);
			out.println("服务器端连接成功.......");                //向客户发送连接信息
			out.println("输入quit断开与服务器端的连接");
			boolean done=false;
			while(!done){
				String line=in.readLine();//读取客户端每行的内容
				if(line==null){             //没有写则不读取
					done=true;
				}else{
					System.out.print("来自客户端的信息："+line);   //显示客户端发送的内容
					String message=infoUpperCase(line);          //信息处理
					out.println("来自服务器端的信息："+message);//想客户端发送消息
					if(line.trim().equals("quit"))  //退出判断
						done=true;
				}
			}
			socketAccept.close();           //关闭通信资源
		}catch(Exception e){                    //捕获异常
			System.out.println("启动服务器端出现出错："+e.getMessage());
		}
	}
	
}
