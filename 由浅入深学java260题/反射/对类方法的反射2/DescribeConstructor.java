package ���෽���ķ���2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import ʵ����.Product;

public class DescribeConstructor {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		Product p=new Product();
		Class c=p.getClass();
		Constructor[] cs=c.getDeclaredConstructors();  //�����ƶ��������͵����й�����������public�ͷ�public
		System.out.println("Product��Ĺ��캯�����£�");
		System.out.println("-----------------------");
		StringBuffer sb=new StringBuffer();
		for(Constructor ct:cs){
			sb.setLength(0);
			sb.append(Modifier.toString(ct.getModifiers())).append(" ").append(ct.getName()).append(" ");
			 //getModifiers����������int����ֵ��ʾ���ֶε����η�
			Class [] ps=ct.getParameterTypes();
			for(int i=0;i<ps.length;i++){
				sb.append(ps[i]);
				if(i<ps.length-1){
					sb.append(",");
				}
			}
		System.out.println(sb);
		}
			
	}

}
