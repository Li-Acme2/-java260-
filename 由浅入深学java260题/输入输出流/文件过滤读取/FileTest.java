package 文件过滤读取;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class FileTest {
	public void ReadFileList(File file,Filter filter){
		if(file.isDirectory()){          //判断file是否为目录
			try{
				File[] files=file.listFiles(filter);//创建目录数组
				ArrayList<File> fileList=new ArrayList<File>();//通过数组建立数组列表
				for(int i=0;i<files.length;i++){      //for循环遍历数组
					if(files[i].isDirectory()){        //判断是否为目录
						System.out.println("["+files[i].getPath()+"]");  //输出路径
					ReadFileList(files[i],filter);    //递归调用readfilelist
					}else{
						fileList.add(files[i]);     //文件先存入fileList
					}
					//列出文件
					for(File f:fileList){  //使用增强型for语句遍历数组
						ReadFileList(f,filter);
					}
					System.out.println();   //输出换行符
				}
			}catch(ArrayIndexOutOfBoundsException e){//捕获异常
				e.printStackTrace();           //打印异常信息
			}
		}else if(file.isFile()){   //判断是否为文件
			FileDesc(file);   
		}
	}
	public void FileDesc(File file){
		if(file.isFile()){//判断是否为文件 可以不用
			System.out.print(file.toString()+"\n该文件");  //输出字符串信息
			System.out.println(file.canRead()?"可读":"不可读");//判断文件是否可读
			System.out.println(file.canWrite()?"可写":"不可写");//判断文件是否可写
			System.out.println(file.length()+"字节");  //输出字节数
		}
	}
	public static void main(String[] args){
		String filename="D:\\eclipse\\";   //由参数获取文件名
		File file=new File(filename);   //创建，并初始化由文件决定的文件对象
		Filter filter=new Filter("java");  //创建并初始化问价过滤器
		new FileTest().ReadFileList(file, filter);  //创建filedemo实例
	}

}
class Filter implements FilenameFilter{
	String extent;//声明实现F的构造方法
	Filter(String extent){
		this.extent=extent;   //初始化成员变量
	}
	//覆盖父类的accept方法
	public boolean accept(File dir,String name){
		return name.endsWith("."+extent);  //返回文件的后缀名
	}
}