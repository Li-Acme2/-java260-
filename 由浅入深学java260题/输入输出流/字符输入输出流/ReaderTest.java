package �ַ����������;

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
		 * �ַ�������*/
		FileInputStream fis=new FileInputStream("�ַ���.txt");//����һ������·�����ֽ���
		InputStreamReader isd=new InputStreamReader(fis);//�ֽ���ת����InputStreamReader
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(isd);//InputStreamReaderת���ɴ������bufferedreader
		String ss=new String();
		String s;
		while((s=br.readLine())!=null){
			ss+=s;
		}
		
		FileOutputStream fos=new FileOutputStream("�ַ���2.txt");//����һ��ָ��������ֽ���
		OutputStreamWriter osw=new OutputStreamWriter(fos);//�ֽ���ת����outputstreamwriter
		BufferedWriter bw=new BufferedWriter(osw);//outputstreamwriterת���ɴ������bufferedwriter
		bw.write(ss);
		bw.close();
		osw.close();
		fos.close();
	}

}
