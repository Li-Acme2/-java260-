package 查看子目录和子文件;

import java.io.File;
import java.util.Scanner;

public class ExploreFolder {
	//打印给定目录下的子目录和文件夹
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入目录路径：");
		String name=reader.next();
		explore(new File(name));
	}
	public static void explore(File f){
		if(!f.exists()){
			System.out.println(f.getPath()+"不存在");
			return;
		}
		if(!f.isDirectory()){
			System.out.println(f.getPath()+"不存在");
			return;
		}
		File[] fs=f.listFiles();
		for(File file:fs){
			System.out.println(file.getPath());
		}
	}

}
