package �ļ���д�ַ���;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void filereadertest(){
		String name="�ļ���д�ַ���.txt"; //newһ���ַ������͵�name��������ֵ
		try{
		FileReader fr=new FileReader(name);//����һ��ָ���ļ�����filereader������ֵname
		char[] c=new char[1];           //newһ��char���ͳ���Ϊ1������
		while(fr.read(c)!=-1){              //�ж�ѭ���Ƿ��ȡ���ļ��ײ�
			System.out.print(new String(c));  //���ļ������ݴ�ӡ����ʾ��
		}
		fr.close();  //�ر���
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		 filereadertest();
	}

}
