package �ض�����������ļ�;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args){
		FileWriter fw;
		try{
			fw=new FileWriter(args[0]);    //�����ַ����������
			BufferedWriter bf=new BufferedWriter(fw);     //���������ַ����������
			for(int i=0;i<10;i++){               //���ַ���д���ļ�
				bf.write("Line"+i);
			}
			bf.close();          //�رջ����ַ��������
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
