package 文件读写字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void filereadertest(){
		String name="文件读写字符流.txt"; //new一个字符串类型的name，并赋初值
		try{
		FileReader fr=new FileReader(name);//创建一个指定文件名的filereader，并传值name
		char[] c=new char[1];           //new一个char类型长度为1的数组
		while(fr.read(c)!=-1){              //判断循环是否读取到文件底部
			System.out.print(new String(c));  //将文件的内容打印到显示器
		}
		fr.close();  //关闭流
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		 filereadertest();
	}

}
