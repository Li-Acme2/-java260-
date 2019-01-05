package ��ϣ��������;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LinkHashSet {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		hashSetResult();
		treeSetResult();
		linkedHashSetResult();
		Set hashSet=new HashSet();
		addSetElement(hashSet);
		hashSet.add("��ѧ");                //Set������Ԫ���ظ�
		hashSet.add("����");
		System.out.println("\nΪhashSet������ѧ������Ԫ�غ�->:");
		showElement(hashSet);           //���÷�����ʾԪ��
		hashSet.remove("����");            //ɾ��Ԫ��
		System.out.println("\nhashSetɾ������Ԫ�غ󡪡�>��");
		showElement(hashSet);             
		List list=new ArrayList();
		list.add("��ѧ");
		list.add("��ѧ");
		list.add("����");
		hashSet.addAll(list);                //���б�����ӵ�Set��
		System.out.println("\nhashSet���һ�����ϵ�����Ԫ�غ�-->��");
		showElement(hashSet);
		hashSet.retainAll(list);               //ɾ�����б����е�Ԫ��֮���Ԫ��
		System.out.println("\nhashSetɾ�����б���Ԫ��֮���Ԫ�غ�-->��");
		showElement(hashSet);
		hashSet.removeAll(list);
		System.out.println("\nhashSetɾ�������е�Ԫ��֮��-->��");
		showElement(hashSet);
		System.out.println("\thashSet�е�ǰԪ�صĸ�����"+hashSet.size());       //��ȡSet��Ԫ�صĸ���
		System.out.println("\thashSet�е�ǰԪ��Ϊ0��"+hashSet.isEmpty());
		}

	@SuppressWarnings("rawtypes")
	private static void linkedHashSetResult() {                  //ʹ��linkedHashSet����Ԫ��
		// TODO Auto-generated method stub
		Set linkedSetResult=new LinkedHashSet();
		addSetElement(linkedSetResult);
		System.out.println("\nʹ��LinkedSetResult�洢������Ԫ�����¡���>:");
		showElement(linkedSetResult);                            //���÷�����ʾԪ��
	}

	@SuppressWarnings("rawtypes")
	private static void treeSetResult() {                          //ʹ��treeSet����Ԫ��
		// TODO Auto-generated method stub
		Set treeSet=new TreeSet();
		addSetElement(treeSet);
		System.out.println("\nʹ��treeSet�洢������Ԫ�����¡���>:");
		showElement(treeSet);
	}

	@SuppressWarnings("rawtypes")
	private static void hashSetResult() {                        //ʹ��hashSet����Ԫ��
		// TODO Auto-generated method stub
		Set hashSet=new HashSet();
		addSetElement(hashSet);
		System.out.println("ʹ��HashSet�洢������Ԫ�����¡�>��");
		showElement(hashSet);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void addSetElement(Set set) {              
		// TODO Auto-generated method stub
		if(set!=null){
			set.add("��ѧ");
			set.add("����");
			set.add("����");
			set.add("��ѧ");
			set.add("����");
		}
	}

	@SuppressWarnings("rawtypes")
	private static void showElement(Set set) {           //���Set��Ԫ��
		// TODO Auto-generated method stub
		if(set!=null&&set.size()>0){
			Iterator it=set.iterator();    //��õ�����iterator
			while(it.hasNext()){                     //ѭ�����Set�е�ÿ��Ԫ��
				System.out.print(it.next()+" ");
			}
		}else{
			System.out.println("û��Ԫ�أ�");
		}
		System.out.println();
	}

}
