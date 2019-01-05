package 缓存输入输出流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedTest {
	public static void bufferedtest(){
		FileInputStream fis=null;
		FileOutputStream fos=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		String name1="1.txt";
		String name2="2.txt";
		int i;
		try{
			fis=new FileInputStream(name1);
			bis=new BufferedInputStream(fis);
			
			fos=new FileOutputStream(name2);
			bos=new BufferedOutputStream(fos);
			
			i=bis.read();           //读取方法
			while(i!=-1){
				bos.write(i);         //写入方法
				i=bis.read();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		 bufferedtest();
	} 

}
