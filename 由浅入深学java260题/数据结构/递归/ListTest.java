package �ݹ�;

import java.io.File;
import java.util.Scanner;

public class ListTest {
	public static void list(File f){
		File[] fs=f.listFiles();
		for(File d:fs){
			if(d.isDirectory()){
				list(f);
			}else{
				System.out.println(f.getPath());
			}			
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("�����ļ�·����");
		String lt=s.next();
		list(new File(lt));
		s.close(); 
	}

}
