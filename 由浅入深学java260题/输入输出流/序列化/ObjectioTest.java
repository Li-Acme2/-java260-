package 序列化;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;

public class ObjectioTest {
	//将对象序列化
	public static void serialize(String fileName)throws Exception{
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("序列化.txt"));//创建一个对象输出流，将对象输出到文件
		out.writeObject("今天的日期和时间如下：");   //序列化一个字符串对象到文件
		out.writeObject(Calendar.getInstance());      //序列化当前日期对象到文件
		        //序列化一个myclass对象
		TestClass tc=new TestClass(1,2,3,4);
		out.writeObject(tc);
		out.close();
 	}
	
	@SuppressWarnings("deprecation")
	   //将序列化的对象反序列化
	public static void deserialize(String fileName)throws Exception{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("序列化.txt"));//创建一个对象输入流，从文件读取对象
		            //读取字符串对象
		String today=(String)(in.readObject());
		System.out.println(today);
		      //读日历Calendar对象
		Calendar data=(Calendar)(in.readObject());
		System.out.println(data.get(Calendar.YEAR)+"年"+(data.get(Calendar.MONTH)+1)+"月"
		                  +data.get(Calendar.DAY_OF_MONTH)+"日"+data.getTime().toLocaleString());
		   //从输入流中读取Testclass对象
		TestClass tc=(TestClass)(in.readObject());
		System.out.println(tc.toString());
		in.close();
	}
	public static void main(String[] args){
		System.out.println("反序列化的结果如下：");
		String fileName="序列化.txt";
		try{
			ObjectioTest.serialize(fileName);
		}catch(Exception e){
			System.out.println("对象序列化失败"+e.getMessage());
		}
		try{
			ObjectioTest.deserialize(fileName);
		}catch(Exception e){
			System.out.println("对象反序列化失败"+e.getMessage());
		}
	}

}
@SuppressWarnings("serial")
     //一个类，用于被序列化和反序列化
      //一定要实现Serializable才能被序列化和反序列化
class TestClass implements Serializable{
	private int i,n;           //一般的实例变量会被序列化和反序列化
	private transient int x;      //用transient声明的变量不会被序列化和反序列化
	private static int y;           //类变量也不会被序列化和反序列化
	public TestClass(int i,int n,int x,int y){   //利用构造方法赋值
		this.i=i;
		this.n=n;
		this.x=x;
		TestClass.y=y;
	}
	public String toString(){
		return i+":"+n+":"+x+":"+y;
	}
}
