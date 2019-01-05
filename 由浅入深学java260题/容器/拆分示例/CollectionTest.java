package ���ʾ��;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		Collection<String> collstr=new ArrayList<String>();  //����һ��Ԫ��ΪString���͵��б�
		collstr.add("����");                      //Ϊ�б����Ԫ��
		collstr.add("����");
		collstr.add("����");
		collstr.add("����");
		System.out.println(collstr);                       //�������Ԫ������
		//Object arrayo=collstr.toArray();                //���б�ת��Ϊ����
		Collection<String> coll=new ArrayList<String>();      //����һ��Ԫ��Ϊ�ַ������͵��б�
		coll.add("�Ը�");
		coll.add("����");
		coll.addAll(collstr);
		System.out.println(coll);                            //����ڶ������ϵ�����
		System.out.println("coll.contains(\"�Ը�\")="+coll.contains("�Ը�"));   //�鿴�б��Ƿ�����Ը�
		System.out.println("coll.contains(collstr)="+coll.containsAll(collstr)); //�鿴�ڶ��������Ƿ�����е�һ�����ϵ�Ԫ��
		coll.retainAll(collstr);//�ӵڶ���������ɾ����һ�������в�������Ԫ��
		System.out.println("�ӵڶ���������ɾ����һ�������в�������Ԫ�أ��ڶ�������Ԫ��Ϊ��");
		System.out.println(coll);    //����ڶ��������е�Ԫ��
		coll.add("�Ը�");              //Ϊ�б�c2���Ԫ��
		Iterator it=coll.iterator();    //�����б������
		System.out.print("(");	
		while(it.hasNext())                     //ͨ�������������б��е�Ԫ��
			System.out.print(it.next()+",");                //�������Ԫ��
		System.out.print(")");
		coll.removeAll(collstr);              //�ӵڶ���������ɾ����һ�������а�����Ԫ��
		System.out.println("�ӵڶ���������ɾ����һ�������а�����Ԫ�أ��ڶ�������Ԫ��Ϊ��");
		System.out.println(coll);
		coll.remove("�Ը�");
		System.out.println("coll.isEmpty()="+coll.isEmpty());    //�鿴����Ƿ�Ϊ���б�
		System.out.println(collstr);
		collstr.clear();           //�����һ�������е�Ԫ��
		System.out.println("ʹ��clear���������󣬵�һ�������е�Ԫ��\n"+collstr);
	}

}
/*���ȴ���������ʹ��ArrayList������collstr�����������Ԫ��ʹ��add���������������������ڶ�����������coll��ʹ��add�����������Ԫ�ء�Ȼ��ʹ��
 * coll��addAll������������һ�������е�Ԫ����ӵ��ڶ��������С����ʹ��retionAll������������һ�������е�Ԫ���޳�������ʹ��clear��������һ������
 * �е�Ԫ��ȫ�������*/
