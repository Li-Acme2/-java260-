package 由浅入深学Java_基础进阶必做260题;

import java.io.IOException;

public class 选课菜单 {
public static void main(String[] args) throws IOException{
	int i;
	do{
		System.out.println("1：数学");
		System.out.println("2：语文");
		System.out.println("3：英语");
		System.out.println("4：生物");
		System.out.println("5：化学");
		System.out.println("6：物理");
		System.out.println("请输入选择的课程号：");
		 i=System.in.read();
		switch(i){
		case'1':System.out.println("你选择的是数学");break;
		case'2':System.out.println("你选择的是语文");break;
		case'3':System.out.println("你选择的是英语");break;
		case'4':System.out.println("你选择的是生物");break;
		case'5':System.out.println("你选择的是化学");break;
		case'6':System.out.println("你选择的是物理");break;
		default:System.out.println("没有你输入的课程号，请输入0-5之间的数字");break;
		}
	}while(i<'1'||i>'5');
}
}
