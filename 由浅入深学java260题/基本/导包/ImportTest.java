package 导包;
import java.io.File;//使用import导包
public class ImportTest {
	public static void main(String[] args){
		File file=new File("D:\\eclipse\\由浅入深学java260题\\bin\\导包\\111.txt");
		System.out.println(file.length());
		java.util.Date date=new java.util.Date();//临时导包
		System.out.println("当前时间："+date);
		java.math.BigDecimal decimal=new java.math.BigDecimal(5);
		System.out.println("decimal:"+decimal);
	}

}
