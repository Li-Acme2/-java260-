package ����;
import java.io.File;//ʹ��import����
public class ImportTest {
	public static void main(String[] args){
		File file=new File("D:\\eclipse\\��ǳ����ѧjava260��\\bin\\����\\111.txt");
		System.out.println(file.length());
		java.util.Date date=new java.util.Date();//��ʱ����
		System.out.println("��ǰʱ�䣺"+date);
		java.math.BigDecimal decimal=new java.math.BigDecimal(5);
		System.out.println("decimal:"+decimal);
	}

}
