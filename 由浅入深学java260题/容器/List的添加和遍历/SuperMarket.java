package List����Ӻͱ���;


import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
	public static void main(String[] args){
		List<String> storage=new ArrayList<String>();           //���вֿ�
		storage.add("foods");
		storage.add("tools");
		storage.add("books");
		storage.add("cars");
		List<String> clothing=new ArrayList<String>();          //��������
		clothing.add("dress");
		clothing.add("costume");
		clothing.add("gown");
		storage.addAll(clothing);
		System.out.println("���е���Ʒ��");
		for(String p:storage){
			System.out.println(p);
		}
		System.out.println("\n������Ʒ�ṹ");
		storage.remove("cars");
		System.out.println("���º����Ʒ��");
		for(String p:storage){
			System.out.println(p);
		}
	}

}
