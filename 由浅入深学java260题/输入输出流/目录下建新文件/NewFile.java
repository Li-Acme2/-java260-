package Ŀ¼�½����ļ�;

import java.io.File;
import java.io.IOException;

public class NewFile {
	public static boolean createFile(String destFileName){
		File file=new File(destFileName);   //����ָ�����ļ�������file����
		if(file.exists()){           //�жϸ��ļ��Ƿ����
			System.out.println("���������ļ�"+destFileName+"ʧ�ܣ�Ŀ���ļ��Ѵ��ڣ�");
			return false;                               //������ڣ����贴���򷵻�false
		}
		if(destFileName.endsWith(File.separator)){//���������ļ��������ļ��ָ�����β�ģ���˵����File�����Ǹ�Ŀ¼�������ļ�
			System.out.println("���������ļ�"+destFileName+"ʧ�ܣ�Ŀ���ļ�����ΪĿ¼��");
			return false;               //��Ϊ�����ļ������Բ����ܴ����ɹ����򷵻�false
		}
		  //�ж�Ŀ���ļ����ڵ�Ŀ¼�Ƿ����
		if(!file.getParentFile().exists()){
			//���Ŀ���ļ����ڵ��ļ��в����ڣ��򴴽����ļ���
			System.out.println("����"+file.getName()+"����Ŀ¼�����ڣ����ڴ�����");
			if(!file.getParentFile().mkdirs()){  //�жϸ��ļ����Ƿ���ڣ�����������ʾ�����ɹ����򲻳ɹ�
				System.out.println("����Ŀ���ļ�������Ŀ¼ʧ�ܣ�");
				return false;
			}
		}
		  //����Ŀ���ļ�
		try{
			if(file.createNewFile()){   //����createNewFile�������жϴ���ָ���ļ��Ƿ�ɹ�
				System.out.println("���������ļ�"+destFileName+"�ɹ�!");
				return true;
			}else{
				System.out.println("���������ļ�"+destFileName+"ʧ�ܣ�");
				return false;
			}
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("");
			return false;
		}
	}
	public static void main(String[] args){
		String filename="F:\\�½��ļ���";	
		createFile(filename);
	}

}
