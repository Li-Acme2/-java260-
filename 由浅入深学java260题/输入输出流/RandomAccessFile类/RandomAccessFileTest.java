package RandomAccessFile��;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void RandomToWrite(File file){
		Student[] student=new Student[4];//����һ��student���鲢��ʼ��
		student[0]=new Student("����","90");
		student[1]=new Student("����","80");
		student[2]=new Student("����","70");
		student[3]=new Student("����","60");
		RandomAccessFile raf=null;        //����һ��RandomAccessFile����
		try{
			raf=new RandomAccessFile(file,"rw");    //����һ������֧�ֶ�д״̬��RandomAccessFile����
		}catch(FileNotFoundException e1){     //�����쳣
			System.out.println("�ļ�û���ҵ�"+e1.getMessage());  //����쳣��Ϣ
		}
		try{
			for(int i=0;i<student.length;i++){   //for����student����
				raf.writeChars(student[i].getlevel());  //���ļ���д�����ֵȼ�
				raf.writeChars(student[i].getscore());   //д�����
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
	private static String readName(RandomAccessFile raf) throws IOException{
		char[] name=new char[5];
		for(int i=0;i<name.length;i++){
			name[i]=raf.readChar();   //��ȡ�ַ�
		}
		return new String(name);
	}
	public static void main(String[] args)throws Exception{
		String filename="RandomAccessFile�ļ�.txt"; 
		File file=new File(filename);  //��������ʼ��File����file
		RandomToWrite(file);     //���÷���
		Student[] student=RandomToRead(file); //�����ļ��б����student����
		System.out.println(filename+"���������£�");
		for(int i=0;i<student.length;i++){
			System.out.println("level="+student[i].getlevel()+"|score="+student[i].getscore());
		}
	}
	public static Student[] RandomToRead(File file) throws Exception{
		RandomAccessFile randomAccessFile;   //����rafʵ��
		randomAccessFile=new RandomAccessFile(file,"r"); //��ʼ������
		int num=(int)randomAccessFile.length()/Student.size();
		Student[] student=new Student[num];
		for(int i=0;i<num;i++){
			randomAccessFile.seek((i)*Student.size());
			  //ʹ�ö�Ӧ��read������������
			student[i]=new Student(readName(randomAccessFile),readName(randomAccessFile));
		}
		randomAccessFile.close();
		return student;
	}
}
class Student{
	String level;
	String score;
	final static int SIZE=8;//��������ʼ����̬��len
	public Student(String level,String score){
		if(level.length()>SIZE){
			level=level.substring(0, 8);   //��ȡ�ַ��������ַ���
		}else{
			while(level.length()<SIZE){
				level=level+"\u0000";
			}
		}
		this.level=level;
		this.score=score;
	}
	//��ȡ��ռ�õĿռ�
	public static int size(){
		return 20;      //�ַ���������8��һ���ַ�ռ��2���ֽڣ�һ��������4���ֽ�
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
