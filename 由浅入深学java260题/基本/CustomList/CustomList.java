package CustomList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public  class CustomList<T> extends AbstractList<T> {//����ʵ�ֳ��ࣨ���ࣩ��ȫ�����󷽷�����Ȼ���ǳ����࣬����ʾ�ı�Ϊ�����ࣨ��abstract����
	private List<T> list=new ArrayList<T>();
	public T get(int index){
		return list.get(index);
	}
	public boolean add(T o){
		return list.add(o);
	}
	public int size(){
		return list.size();
	}
	public static void main(String[] args){
		CustomList<String> l=new CustomList<String>();
		l.add("test1");
		l.add("test2");
		for(String s:l){     //foreach����ʽ��ȡ����l��ÿ��Ԫ�أ�ѭ��һ�ξ�����ȡ��һ��Ԫ�ظ�ֵ��s��ֱ��ȡ�ꡣ
			System.out.println(s);
		}
		/*�ڶ���foreach�ķ�������������ɵ�������
		 *Map<String,String>map=new HashMap<String,String>();
		 *for(Entry<String,String>item:map.entrySet()){
		 *System.out.println("ѭ��Ԫ��key��"+item.getKey()+"value��"+item.getValue());
		 *}
	   */
	}

}
