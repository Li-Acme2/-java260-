package ���෽���ķ���;


//����Product��ķ���
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import ���кͷ����в���.Product;

public class DescribeMethod {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		Product p=new Product();
		Class c=p.getClass();
		Method[] ms=c.getDeclaredMethods();  //�����ƶ��������͵����з���������public�ͷ�public
		System.out.println("Product�෽�����£�");
		System.out.println("----------------");
		StringBuffer sb=new StringBuffer();
		for(Method m:ms){
			sb.setLength(0);
			sb.append(Modifier.toString(m.getModifiers())).append(" ").append(m.getReturnType().getName()).append(" ").append(m.getName()).append(" ");
			Class[] ps=m.getParameterTypes();
			for(int i=0;i<ps.length;i++){
				sb.append(ps[i]);
//				if(i>ps.length-1){
//					sb.append(", ");
//				}
			}
			//sb.append("->");
			System.out.println(sb);
		}
	}

}
