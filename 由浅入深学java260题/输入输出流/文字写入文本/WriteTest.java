package ����д���ı�;

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
		Scanner reader=new Scanner(System.in);  //ɨ�������ı�
		System.out.println("�������ļ�·����");
		String name=reader.next();
		try{
			write(new File(name));
		}catch(IOException e){
			try {
				throw new Exception("д���ļ����ݴ���");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public static void write(File f)throws IOException, UnsupportedEncodingException{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f),"UTF-8"));
		bw.write("�������ǷǺú�����ָ�г̶���");
		bw.flush();
		bw.close();
	}

}
