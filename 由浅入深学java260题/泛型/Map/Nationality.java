package Map;

import java.util.HashMap;
import java.util.Map;
/*ʹ��String��ΪHashMap�����Ͳ���������һ��Map�������Ԫ�غͱ������е�Ԫ�ء�*/
public class Nationality {
	public static void main(String[] args){
		Map<String,String> map=new HashMap<String,String>();//         <>������
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
			System.out.println(s+"���ԣ�"+map.get(s));
		}
	}

}
