package ListIterator���ɾ���ͱ���Ԫ��;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*
 * ʹ��Lģ�⾯����ȹ�·�ϵĳ������Բ鿴���ķ����ȡ�÷����Ƿ��г������ҿ�������Ľ�ĳ�����뵽����λ�û������¹�·
 * */
public class Road {
	public static void main(String[] args){
		List<String> cars=new ArrayList<String>();
		cars.add("Ford");
		cars.add("Dodge");
		cars.add("citroen");
		cars.add("Honda");
		cars.add("Hummer");
		cars.add("Jeep");
		cars.add("Mazda");
		ListIterator<String>  li=cars.listIterator();   //ȡ�á����족����
		System.out.println("���У�"+li.next());
		System.out.println("Υ�£�����ͣ����"+li.next());
		li.remove();
		for(String c:cars){
			System.out.println(c);
		}
		String cc=li.next();
		System.out.println("��"+cc+"��ǰ��ȥ");
		li.remove();
		for(String c:cars){
			System.out.println(c);
		}
		li.next();
		li.next();
		li.next();
		li.next();
		li.set(cc);
		System.out.println("\n���ڵ�·��ͨ��");
		for(String c:cars){
			System.out.println(c);
		}
	}

}
