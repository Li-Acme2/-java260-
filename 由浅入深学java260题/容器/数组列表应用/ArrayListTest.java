package �����б�Ӧ��;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args){
		List <String> list=new ArrayList<String>(4);      //����һ����СΪ4�ļ���  
		list.add("����");                                  //�򼯺������Ԫ�أ����ӿ�Ŀ
		list.add("��ѧ");
		list.add("����");
		list.add("����");
		System.out.println("��һ��ѡ�ε��еĿ�Ŀ��");
		for(Iterator<String> iter=list.iterator();iter.hasNext();){ 
			String s= iter.next();                         //��ȡÿ��Ԫ��
			System.out.println(s+"\t");
			if("��ѧ".equals(s)){           //��һ��ѡ�εĿ�ĿΪ��ѧ
 				iter.remove();                         //����ӿ�Ŀ��ɾ��
			}
		}
		System.out.println();
		System.out.println("�ڶ���ѡ�ε��еĿ�Ŀ��");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s+"\t");
			if("����".equals(s)||"����".equals(s)){                  //�ڶ���ѡ���ĺ�����
				it.remove();
			}
		}
		System.out.println();
		System.out.println("���û��ѡ��Ŀ�Ŀ��");
		for(Iterator<String> iter=list.iterator();iter.hasNext();){            //��ӡʣ���Ŀ
			String s=iter.next();
			System.out.println(s+"\t");
		}
	}

}
