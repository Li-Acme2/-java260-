package 序列和反序列测试;

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
		System.out.println("请输入文件路径：");
		String name=reader.next();
		File f=new File(name);
		if(f.exists()){
			System.out.println("文件已存在。");
			return;
		}
		if(f.isDirectory()){
			System.out.println("这是一个目录。");
			return;
		}
		try{
			serialize(f);
			deserialize(f);
		}catch(IOException e){
			throw new Exception("序列化文件出现错误");
		}catch(ClassNotFoundException e){
			throw new Exception("文件转型错误");
		}
		
	}
	public static void serialize(File f)throws IOException{
		Product p=new Product();
		p.setName("特步时尚板鞋");
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
		System.out.println("商品名称"+p.getName());
		System.out.println("商品价格"+p.getPrice());
	}

}
