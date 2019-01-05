package �ַ�����ȡ����;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadTest {
	public static void main(String[] args) throws BadInputException{
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);   //ɨ�������ı�
		System.out.println("�������ļ�·����");
		String name=reader.next();
		try{
			read(new File(name));
		}catch(IOException e){
			throw new BadInputException("��ȡ�ļ����ݴ���");   //����ʱ�쳣
		}
	}
	public static void read(File f)throws IOException{
		if(!f.exists()){
			System.out.println("�ļ������ڡ�");
			return;
		}
		if(!f.isDirectory()){
			System.out.println("����һ��Ŀ¼��");
			return;
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(f),"UTF-8"));   //������ı���UTF-8���뱣��
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
