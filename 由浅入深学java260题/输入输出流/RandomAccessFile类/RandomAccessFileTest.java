package RandomAccessFile类;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void RandomToWrite(File file){
		Student[] student=new Student[4];//创建一个student数组并初始化
		student[0]=new Student("优秀","90");
		student[1]=new Student("优良","80");
		student[2]=new Student("良好","70");
		student[3]=new Student("及格","60");
		RandomAccessFile raf=null;        //创建一个RandomAccessFile对象
		try{
			raf=new RandomAccessFile(file,"rw");    //创建一个可以支持读写状态的RandomAccessFile对象
		}catch(FileNotFoundException e1){     //捕获异常
			System.out.println("文件没有找到"+e1.getMessage());  //输出异常信息
		}
		try{
			for(int i=0;i<student.length;i++){   //for遍历student数组
				raf.writeChars(student[i].getlevel());  //向文件中写入评分等级
				raf.writeChars(student[i].getscore());   //写入分数
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
	private static String readName(RandomAccessFile raf) throws IOException{
		char[] name=new char[5];
		for(int i=0;i<name.length;i++){
			name[i]=raf.readChar();   //读取字符
		}
		return new String(name);
	}
	public static void main(String[] args)throws Exception{
		String filename="RandomAccessFile文件.txt"; 
		File file=new File(filename);  //创建并初始化File对象file
		RandomToWrite(file);     //调用方法
		Student[] student=RandomToRead(file); //返回文件中保存的student数组
		System.out.println(filename+"的内容如下：");
		for(int i=0;i<student.length;i++){
			System.out.println("level="+student[i].getlevel()+"|score="+student[i].getscore());
		}
	}
	public static Student[] RandomToRead(File file) throws Exception{
		RandomAccessFile randomAccessFile;   //创建raf实例
		randomAccessFile=new RandomAccessFile(file,"r"); //初始化对象
		int num=(int)randomAccessFile.length()/Student.size();
		Student[] student=new Student[num];
		for(int i=0;i<num;i++){
			randomAccessFile.seek((i)*Student.size());
			  //使用对应的read方法读出数据
			student[i]=new Student(readName(randomAccessFile),readName(randomAccessFile));
		}
		randomAccessFile.close();
		return student;
	}
}
class Student{
	String level;
	String score;
	final static int SIZE=8;//创建并初始化静态域len
	public Student(String level,String score){
		if(level.length()>SIZE){
			level=level.substring(0, 8);   //截取字符串的子字符串
		}else{
			while(level.length()<SIZE){
				level=level+"\u0000";
			}
		}
		this.level=level;
		this.score=score;
	}
	//获取类占用的空间
	public static int size(){
		return 20;      //字符串长度是8，一个字符占用2个字节，一个整形是4个字节
	}
	public String getlevel(){
		return level;
	}
	public void setlevel(String level){
		this.level=level;
	}
	public String getscore(){
		return score;
	}
	public void setscore(String score){
		this.score=score;
	}
}
