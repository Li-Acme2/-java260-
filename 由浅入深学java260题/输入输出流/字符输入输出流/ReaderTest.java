package 字符输入输出流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderTest {
	public static void main(String[] args)throws IOException{
		reader();
	}
	public static void reader()throws IOException{
		/*
		 * 字符流测试*/
		FileInputStream fis=new FileInputStream("字符流.txt");//定义一个绝对路径的字节流
		InputStreamReader isd=new InputStreamReader(fis);//字节流转换成InputStreamReader
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(isd);//InputStreamReader转换成带缓存的bufferedreader
		String ss=new String();
		String s;
		while((s=br.readLine())!=null){
			ss+=s;
		}
		
		FileOutputStream fos=new FileOutputStream("字符流2.txt");//定义一个指向输出的字节流
		OutputStreamWriter osw=new OutputStreamWriter(fos);//字节流转换成outputstreamwriter
		BufferedWriter bw=new BufferedWriter(osw);//outputstreamwriter转换成带缓存的bufferedwriter
		bw.write(ss);
		bw.close();
		osw.close();
		fos.close();
	}

}
