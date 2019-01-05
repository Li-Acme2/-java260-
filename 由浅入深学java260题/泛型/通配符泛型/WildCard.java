package 通配符泛型;

import java.util.ArrayList;
import java.util.List;
/*在List中使用通配符泛型，用不同的类型作为泛型参数声明list，然后打印出这个list*/
public class WildCard {
	public static void print(List<?> store){//只要传过来的store是List类型的，不论<>里面的类型是啥，都执行下面的。
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
