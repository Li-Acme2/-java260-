package 目录下建新文件;

import java.io.File;
import java.io.IOException;

public class NewFile {
	public static boolean createFile(String destFileName){
		File file=new File(destFileName);   //根据指定的文件名创建file对象
		if(file.exists()){           //判断该文件是否存在
			System.out.println("创建单个文件"+destFileName+"失败，目标文件已存在！");
			return false;                               //如果存在，则不需创建则返回false
		}
		if(destFileName.endsWith(File.separator)){//如果传入的文件名是以文件分隔符结尾的，则说明此File对象是个目录而不是文件
			System.out.println("创建单个文件"+destFileName+"失败，目标文件不能为目录！");
			return false;               //因为不是文件，所以不可能创建成功，则返回false
		}
		  //判断目标文件所在的目录是否存在
		if(!file.getParentFile().exists()){
			//如果目标文件所在的文件夹不存在，则创建父文件夹
			System.out.println("创建"+file.getName()+"所在目录不存在，正在创建！");
			if(!file.getParentFile().mkdirs()){  //判断父文件夹是否存在，如果存在则表示创建成功否则不成功
				System.out.println("创建目标文件的所在目录失败！");
				return false;
			}
		}
		  //创建目标文件
		try{
			if(file.createNewFile()){   //调用createNewFile方法，判断创建指定文件是否成功
				System.out.println("创建单个文件"+destFileName+"成功!");
				return true;
			}else{
				System.out.println("创建单个文件"+destFileName+"失败！");
				return false;
			}
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("");
			return false;
		}
	}
	public static void main(String[] args){
		String filename="F:\\新建文件夹";	
		createFile(filename);
	}

}
