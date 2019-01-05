package �ļ����˶�ȡ;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class FileTest {
	public void ReadFileList(File file,Filter filter){
		if(file.isDirectory()){          //�ж�file�Ƿ�ΪĿ¼
			try{
				File[] files=file.listFiles(filter);//����Ŀ¼����
				ArrayList<File> fileList=new ArrayList<File>();//ͨ�����齨�������б�
				for(int i=0;i<files.length;i++){      //forѭ����������
					if(files[i].isDirectory()){        //�ж��Ƿ�ΪĿ¼
						System.out.println("["+files[i].getPath()+"]");  //���·��
					ReadFileList(files[i],filter);    //�ݹ����readfilelist
					}else{
						fileList.add(files[i]);     //�ļ��ȴ���fileList
					}
					//�г��ļ�
					for(File f:fileList){  //ʹ����ǿ��for����������
						ReadFileList(f,filter);
					}
					System.out.println();   //������з�
				}
			}catch(ArrayIndexOutOfBoundsException e){//�����쳣
				e.printStackTrace();           //��ӡ�쳣��Ϣ
			}
		}else if(file.isFile()){   //�ж��Ƿ�Ϊ�ļ�
			FileDesc(file);   
		}
	}
	public void FileDesc(File file){
		if(file.isFile()){//�ж��Ƿ�Ϊ�ļ� ���Բ���
			System.out.print(file.toString()+"\n���ļ�");  //����ַ�����Ϣ
			System.out.println(file.canRead()?"�ɶ�":"���ɶ�");//�ж��ļ��Ƿ�ɶ�
			System.out.println(file.canWrite()?"��д":"����д");//�ж��ļ��Ƿ��д
			System.out.println(file.length()+"�ֽ�");  //����ֽ���
		}
	}
	public static void main(String[] args){
		String filename="D:\\eclipse\\";   //�ɲ�����ȡ�ļ���
		File file=new File(filename);   //����������ʼ�����ļ��������ļ�����
		Filter filter=new Filter("java");  //��������ʼ���ʼ۹�����
		new FileTest().ReadFileList(file, filter);  //����filedemoʵ��
	}

}
class Filter implements FilenameFilter{
	String extent;//����ʵ��F�Ĺ��췽��
	Filter(String extent){
		this.extent=extent;   //��ʼ����Ա����
	}
	//���Ǹ����accept����
	public boolean accept(File dir,String name){
		return name.endsWith("."+extent);  //�����ļ��ĺ�׺��
	}
}