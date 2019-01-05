package 特定内容输出到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args){
		FileWriter fw;
		try{
			fw=new FileWriter(args[0]);    //创建字符输出流对象
			BufferedWriter bf=new BufferedWriter(fw);     //创建缓冲字符输出流对象
			for(int i=0;i<10;i++){               //将字符串写入文件
				bf.write("Line"+i);
			}
			bf.close();          //关闭缓冲字符输出流；
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
