package RandomAccessFile��ʹ��;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomText {
	public static void mian(String[] args){
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);  //ɨ�������ı�
		System.out.println("�������ļ�·����");
		String name=reader.next();
		File f=new File(name);
		if(f.exists()){
			System.out.println("�ļ��Ѵ���.");
			return;
		}
		if(f.isDirectory()){
			System.out.println("����һ��Ŀ¼��");
			return;
		}
		try{
			write(f,"��ƽ��   ����ɽ\r\n");
			write(f,"����Ƶ��������Ϸ���");
			write(f,"�������ǷǺú�����ָ�г̶���");
			write(f," ����ɽ�ϸ߷壬������������");
			write(f,"���ճ�ӧ���֣���ʱ��ס����");
			read(f);
		}catch(IOException e){  //���Ӧ��������ʱ�쳣
			try{
				throw new Exception("RandomAccessFile����");
			}catch(IOException e1){
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}		
	}
	public static void write(File f,String s)throws IOException{
		RandomAccessFile ra=new RandomAccessFile(f,"rw");
		ra.seek(ra.length());
		ra.writeUTF(s);
		ra.close();
	}
	public static void read(File f)throws IOException{
		RandomAccessFile ra=new RandomAccessFile(f,"r");
		long sum=ra.length();
		while(ra.getFilePointer()<sum){
			System.out.println(ra.readUTF());
		}
		ra.close();
	}

}

