package CustomList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public  class CustomList<T> extends AbstractList<T> {//必须实现超类（父类）的全部抽象方法，不然还是抽象类，会提示改变为抽象类（加abstract）。
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
		for(String s:l){     //foreach的形式，取数组l的每个元素，循环一次就依次取出一个元素赋值给s，直到取完。
			System.out.println(s);
		}
		/*第二种foreach的方法，非数组类可迭代对象·
		 *Map<String,String>map=new HashMap<String,String>();
		 *for(Entry<String,String>item:map.entrySet()){
		 *System.out.println("循环元素key："+item.getKey()+"value："+item.getValue());
		 *}
	   */
	}

}
