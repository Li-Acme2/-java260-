package ���кͷ����в���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeObject {
	public static void main(String[] args) throws Exception{
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		System.out.println("�������ļ�·����");
		String name=reader.next();
		File f=new File(name);
		if(f.exists()){
			System.out.println("�ļ��Ѵ��ڡ�");
			return;
		}
		if(f.isDirectory()){
			System.out.println("����һ��Ŀ¼��");
			return;
		}
		try{
			serialize(f);
			deserialize(f);
		}catch(IOException e){
			throw new Exception("���л��ļ����ִ���");
		}catch(ClassNotFoundException e){
			throw new Exception("�ļ�ת�ʹ���");
		}
		
	}
	public static void serialize(File f)throws IOException{
		Product p=new Product();
		p.setName("�ز�ʱ�а�Ь");
		p.SetPrice("200");
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(p);
		out.flush();
		out.close();
	}
	public static void deserialize(File f) throws IOException,ClassNotFoundException{
		@SuppressWarnings("resource")
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));
		Product p=(Product) in.readObject();
		System.out.println("��Ʒ����"+p.getName());
		System.out.println("��Ʒ�۸�"+p.getPrice());
	}

}
