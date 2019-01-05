package ���л�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;

public class ObjectioTest {
	//���������л�
	public static void serialize(String fileName)throws Exception{
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("���л�.txt"));//����һ�������������������������ļ�
		out.writeObject("��������ں�ʱ�����£�");   //���л�һ���ַ��������ļ�
		out.writeObject(Calendar.getInstance());      //���л���ǰ���ڶ����ļ�
		        //���л�һ��myclass����
		TestClass tc=new TestClass(1,2,3,4);
		out.writeObject(tc);
		out.close();
 	}
	
	@SuppressWarnings("deprecation")
	   //�����л��Ķ������л�
	public static void deserialize(String fileName)throws Exception{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("���л�.txt"));//����һ�����������������ļ���ȡ����
		            //��ȡ�ַ�������
		String today=(String)(in.readObject());
		System.out.println(today);
		      //������Calendar����
		Calendar data=(Calendar)(in.readObject());
		System.out.println(data.get(Calendar.YEAR)+"��"+(data.get(Calendar.MONTH)+1)+"��"
		                  +data.get(Calendar.DAY_OF_MONTH)+"��"+data.getTime().toLocaleString());
		   //���������ж�ȡTestclass����
		TestClass tc=(TestClass)(in.readObject());
		System.out.println(tc.toString());
		in.close();
	}
	public static void main(String[] args){
		System.out.println("�����л��Ľ�����£�");
		String fileName="���л�.txt";
		try{
			ObjectioTest.serialize(fileName);
		}catch(Exception e){
			System.out.println("�������л�ʧ��"+e.getMessage());
		}
		try{
			ObjectioTest.deserialize(fileName);
		}catch(Exception e){
			System.out.println("�������л�ʧ��"+e.getMessage());
		}
	}

}
@SuppressWarnings("serial")
     //һ���࣬���ڱ����л��ͷ����л�
      //һ��Ҫʵ��Serializable���ܱ����л��ͷ����л�
class TestClass implements Serializable{
	private int i,n;           //һ���ʵ�������ᱻ���л��ͷ����л�
	private transient int x;      //��transient�����ı������ᱻ���л��ͷ����л�
	private static int y;           //�����Ҳ���ᱻ���л��ͷ����л�
	public TestClass(int i,int n,int x,int y){   //���ù��췽����ֵ
		this.i=i;
		this.n=n;
		this.x=x;
		TestClass.y=y;
	}
	public String toString(){
		return i+":"+n+":"+x+":"+y;
	}
}
