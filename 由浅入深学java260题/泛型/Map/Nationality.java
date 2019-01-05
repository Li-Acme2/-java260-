package Map;

import java.util.HashMap;
import java.util.Map;
/*使用String作为HashMap的类型参数，声明一个Map，并添加元素和遍历所有的元素。*/
public class Nationality {
	public static void main(String[] args){
		Map<String,String> map=new HashMap<String,String>();//         <>：泛型
		map.put("Mike", "USA");
		map.put("Rose", "France");
		map.put("Jone", "UK");
		map.put("Jack", "China");
		
//		map.remove("Mike");
//		System.out.println(map.values());
		
//		String s1 ="1232";
//		int a1 =Integer.parseInt(s1);
//		System.out.println(s1.toString());
//		System.out.println(a1);
//		
//		int a2 = 123;
//		String s2 = String.valueOf(a2);
//		System.out.println(s2);
		
		System.out.println(map.keySet());
		for(String s:map.keySet()){
			System.out.println(s+"来自："+map.get(s));
		}
	}

}
