package 文字写入文本;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class WriteTest {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);  //扫描输入文本
		System.out.println("请输入文件路径：");
		String name=reader.next();
		try{
			write(new File(name));
		}catch(IOException e){
			try {
				throw new Exception("写如文件内容错误");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public static void write(File f)throws IOException, UnsupportedEncodingException{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f),"UTF-8"));
		bw.write("不到长城非好汉，屈指行程二万");
		bw.flush();
		bw.close();
	}

}
