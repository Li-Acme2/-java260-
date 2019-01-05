package end文件停止接受内容;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileTest {
	//从由键盘中输入的内容保存在指定的文件中
	public static boolean saveMessageToFile(String fileName){
		File file=new File(fileName);
		//将数据按照文本输出到文件
		PrintWriter pw=null;
		BufferedReader in=null;
		try{
			//为输出文件建立一个写入器
			pw=new PrintWriter(new FileWriter(file));
			System.out.println("请输入文件的内容并输入end结束");
			//用BufferedReader包装标准输入流
			in=new BufferedReader(new InputStreamReader(System.in));
			String inputLine=null;
			while(((inputLine=in.readLine())!=null)&&(!inputLine.equals("end"))){
				pw.print(inputLine);
			}
			pw.flush();
			pw.close();
			return true;
		}catch(IOException e){
			System.out.println(e.getMessage());
			return false;
		}finally{
			if(in!=null){
				try{
					in.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	 //按照文件中格式将文件内容显示出来
	public static void readFileMessage(String fileName){
		File file=new File(fileName);
		BufferedReader reader=null;
		try{
			System.out.println("按顺序读取文件的内容如下：");
			reader=new BufferedReader(new FileReader(file));
			String string=null;
			int line=1;
			//按行读取内容，直到读入null则表示读取文件结束
			while ((string=reader.readLine())!=null){
				System.out.println("line"+line+":"+string);
				line++;
			}
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(reader!=null){
				try{
					reader.close();
				}catch(IOException e1){}
			}
		}
	}
public static void main(String[] args){
	
}
}
