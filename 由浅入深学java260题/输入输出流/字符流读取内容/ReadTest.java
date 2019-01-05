package 字符流读取内容;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadTest {
	public static void main(String[] args) throws BadInputException{
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);   //扫描输入文本
		System.out.println("请输入文件路径：");
		String name=reader.next();
		try{
			read(new File(name));
		}catch(IOException e){
			throw new BadInputException("读取文件内容错误");   //运行时异常
		}
	}
	public static void read(File f)throws IOException{
		if(!f.exists()){
			System.out.println("文件不存在。");
			return;
		}
		if(!f.isDirectory()){
			System.out.println("这是一个目录。");
			return;
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(f),"UTF-8"));   //假设此文本以UTF-8编码保存
		String s;
		while((s=br.readLine())!=null){
			System.out.println(s);
		}
		br.close();
	}
	@SuppressWarnings("serial")
	public static class BadInputException extends IOException{
		public BadInputException(String message){
			super(message);
		}
		public BadInputException(Throwable cause){
			initCause(cause);
		}
	}

}
