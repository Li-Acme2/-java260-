package ͨ�������;

import java.util.ArrayList;
import java.util.List;
/*��List��ʹ��ͨ������ͣ��ò�ͬ��������Ϊ���Ͳ�������list��Ȼ���ӡ�����list*/
public class WildCard {
	public static void print(List<?> store){//ֻҪ��������store��List���͵ģ�����<>�����������ɶ����ִ������ġ�
		System.out.println(store);
	}
	public static void main(String[] args){
		List<String> ss=new ArrayList<String>();
		ss.add("Jack");
		ss.add("Mike");
		ss.add("Jone");
		print(ss);
		for(String s:ss){
			System.out.println(s);
		}
		List<Integer> is=new ArrayList<Integer>();
		is.add(400);
		is.add(700);
		is.add(500);
		is.add(910);
		print(is);
	}

}
