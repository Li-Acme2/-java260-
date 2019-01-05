package RandomAccessFile的使用;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomText {
	public static void mian(String[] args){
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);  //扫描输入文本
		System.out.println("请输入文件路径：");
		String name=reader.next();
		File f=new File(name);
		if(f.exists()){
			System.out.println("文件已存在.");
			return;
		}
		if(f.isDirectory()){
			System.out.println("这是一个目录。");
			return;
		}
		try{
			write(f,"清平乐   六盘山\r\n");
			write(f,"天高云淡，望断南飞雁");
			write(f,"不到长城非好汉，屈指行程二万");
			write(f," 六盘山上高峰，红旗漫卷西风");
			write(f,"今日长缨在手，何时缚住苍龙");
			read(f);
		}catch(IOException e){  //这块应该是运行时异常
			try{
				throw new Exception("RandomAccessFile错误");
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

