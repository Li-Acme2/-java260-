package �����ȡ�ļ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamTest {
	public static void main(String[] args){
		testStream();
	}
	/*
	 * �ֽ�������
	 * */
	public static void testStream(){
		InputStream fis=null;                  //��������������
		OutputStream fos=null;                 //�������������
		try{
			fis=new FileInputStream("D:\\eclipse\\��ǳ����ѧjava260��\\���������\\�����ȡ�ļ�\\1.txt");//����Ŀ���ļ�
			fos=new FileOutputStream("D:\\eclipse\\��ǳ����ѧjava260��\\���������\\�����ȡ�ļ�\\1copy.txt");//�������Ŀ���ļ�
			long num=0;               //��ȡ�ֽڼ���
			int bt=0;                 //ÿ�ζ����ֽ�����
			//�������ļ�ĩβʱ���������ݵ�ֵΪ-1
			     //ÿ�ζ���һ���ֽڣ���ŵ�����bt�У�ֱ�����������ļ�
			while((bt=fis.read())!=-1){
				    //����ĸ����ʽ�������ļ���ÿ���ֽ�
				System.out.print((char)bt);
				fos.write(bt);          //���ֽ�д��������У�ʵ���ļ���copy����
				num++;
			}
			System.out.println("���Ƶ��ֽ���Ϊ"+num+"\n�ļ����Ƴɹ���");    //��ӡ���
			fis.close();                                                //�ر���
			fos.close();
		}catch(FileNotFoundException e){
			System.out.println("�Ҳ���ָ�����ļ���");             //��ӡ����쳣
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("�ļ���ȡʱ����IO�쳣��");
			e.printStackTrace();
		}
	}

}
