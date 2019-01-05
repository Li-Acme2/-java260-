package end�ļ�ֹͣ��������;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileTest {
	//���ɼ�������������ݱ�����ָ�����ļ���
	public static boolean saveMessageToFile(String fileName){
		File file=new File(fileName);
		//�����ݰ����ı�������ļ�
		PrintWriter pw=null;
		BufferedReader in=null;
		try{
			//Ϊ����ļ�����һ��д����
			pw=new PrintWriter(new FileWriter(file));
			System.out.println("�������ļ������ݲ�����end����");
			//��BufferedReader��װ��׼������
			in=new BufferedReader(new InputStreamReader(System.in));
			String inputLine=null;
			while(((inputLine=in.readLine())!=null)&&(!inputLine.equals("end"))){
				pw.print(inputLine);
			}
			pw.flush();
			pw.close();
			return true;
		}catch(IOException e){
			System.out.println(e.getMessage());
			return false;
		}finally{
			if(in!=null){
				try{
					in.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	 //�����ļ��и�ʽ���ļ�������ʾ����
	public static void readFileMessage(String fileName){
		File file=new File(fileName);
		BufferedReader reader=null;
		try{
			System.out.println("��˳���ȡ�ļ����������£�");
			reader=new BufferedReader(new FileReader(file));
			String string=null;
			int line=1;
			//���ж�ȡ���ݣ�ֱ������null���ʾ��ȡ�ļ�����
			while ((string=reader.readLine())!=null){
				System.out.println("line"+line+":"+string);
				line++;
			}
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(reader!=null){
				try{
					reader.close();
				}catch(IOException e1){}
			}
		}
	}
public static void main(String[] args){
	
}
}
