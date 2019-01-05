package �ֽ����������;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStreamTest {
	public static void main(String[] args){
		String filename="";            //��������ʼ���ļ����ַ���
		People[] people={                 //��������ʼ��People��������
				new People("������",23),
				new People("���Ƴ�",24),
				new People("�ܲ�",25),
				new People("����",22)
		}; 
		try{
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(filename));//����DataOutputStream����
			for(People Employee:people){                     //ʹ��for����
				dos.writeUTF(Employee.getName());            //д���ַ���
				dos.writeInt(Employee.getAge());             //д������
			}
			dos.flush();            //��������������Ŀ�ĵ�
			dos.close();             //�ر���
			DataInputStream dis=new DataInputStream(new FileInputStream(filename));
			//�������ݲ���ԭΪ����
			for(int i=0;i<people.length;i++){
				String name=dis.readUTF();              //����utf�ַ���
				int score=dis.readInt();                  //����int����
				people[people.length-1-i]=new People(name,score);
			}
			dis.close();             //�ر���
			//�����ԭ�������
			for(People Employee:people){
				System.out.printf("%s\t%d\n",Employee.getName(),Employee.getAge());  //��ʽ�����
			}
		}catch(IOException e){       //�����쳣
			e.printStackTrace();       //�쳣��Ϣ���
		}		
	}

}
