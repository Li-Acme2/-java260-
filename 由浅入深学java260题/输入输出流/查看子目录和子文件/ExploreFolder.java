package �鿴��Ŀ¼�����ļ�;

import java.io.File;
import java.util.Scanner;

public class ExploreFolder {
	//��ӡ����Ŀ¼�µ���Ŀ¼���ļ���
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		System.out.println("������Ŀ¼·����");
		String name=reader.next();
		explore(new File(name));
	}
	public static void explore(File f){
		if(!f.exists()){
			System.out.println(f.getPath()+"������");
			return;
		}
		if(!f.isDirectory()){
			System.out.println(f.getPath()+"������");
			return;
		}
		File[] fs=f.listFiles();
		for(File file:fs){
			System.out.println(file.getPath());
		}
	}

}
