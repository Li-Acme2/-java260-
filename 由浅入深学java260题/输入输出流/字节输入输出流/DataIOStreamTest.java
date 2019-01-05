package 字节输入输出流;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStreamTest {
	public static void main(String[] args){
		String filename="";            //创建并初始化文件名字符串
		People[] people={                 //创建，初始化People类型数组
				new People("赵子龙",23),
				new People("关云长",24),
				new People("曹操",25),
				new People("刘备",22)
		}; 
		try{
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(filename));//创建DataOutputStream对象
			for(People Employee:people){                     //使用for变量
				dos.writeUTF(Employee.getName());            //写入字符串
				dos.writeInt(Employee.getAge());             //写入数据
			}
			dos.flush();            //读出所有数据至目的地
			dos.close();             //关闭流
			DataInputStream dis=new DataInputStream(new FileInputStream(filename));
			//读出数据并还原为对象
			for(int i=0;i<people.length;i++){
				String name=dis.readUTF();              //读出utf字符串
				int score=dis.readInt();                  //读出int数据
				people[people.length-1-i]=new People(name,score);
			}
			dis.close();             //关闭流
			//输出还原后的数据
			for(People Employee:people){
				System.out.printf("%s\t%d\n",Employee.getName(),Employee.getAge());  //格式化输出
			}
		}catch(IOException e){       //捕获异常
			e.printStackTrace();       //异常信息输出
		}		
	}

}
