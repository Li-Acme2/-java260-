package 哈希集和树集;

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
		hashSet.add("数学");                //Set不允许元素重复
		hashSet.add("语文");
		System.out.println("\n为hashSet加入数学，语文元素后->:");
		showElement(hashSet);           //调用方法显示元素
		hashSet.remove("物理");            //删除元素
		System.out.println("\nhashSet删除物理元素后——>：");
		showElement(hashSet);             
		List list=new ArrayList();
		list.add("数学");
		list.add("化学");
		list.add("生物");
		hashSet.addAll(list);                //将列表集合添加到Set中
		System.out.println("\nhashSet添加一个集合的所有元素后-->：");
		showElement(hashSet);
		hashSet.retainAll(list);               //删除除列表集合中的元素之外的元素
		System.out.println("\nhashSet删除除列表集合元素之外的元素后-->：");
		showElement(hashSet);
		hashSet.removeAll(list);
		System.out.println("\nhashSet删除集合中的元素之后-->：");
		showElement(hashSet);
		System.out.println("\thashSet中当前元素的个数："+hashSet.size());       //获取Set中元素的个数
		System.out.println("\thashSet中当前元素为0？"+hashSet.isEmpty());
		}

	@SuppressWarnings("rawtypes")
	private static void linkedHashSetResult() {                  //使用linkedHashSet操作元素
		// TODO Auto-generated method stub
		Set linkedSetResult=new LinkedHashSet();
		addSetElement(linkedSetResult);
		System.out.println("\n使用LinkedSetResult存储的数据元素如下——>:");
		showElement(linkedSetResult);                            //调用方法显示元素
	}

	@SuppressWarnings("rawtypes")
	private static void treeSetResult() {                          //使用treeSet操作元素
		// TODO Auto-generated method stub
		Set treeSet=new TreeSet();
		addSetElement(treeSet);
		System.out.println("\n使用treeSet存储的数据元素如下——>:");
		showElement(treeSet);
	}

	@SuppressWarnings("rawtypes")
	private static void hashSetResult() {                        //使用hashSet操作元素
		// TODO Auto-generated method stub
		Set hashSet=new HashSet();
		addSetElement(hashSet);
		System.out.println("使用HashSet存储的数据元素如下—>：");
		showElement(hashSet);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void addSetElement(Set set) {              
		// TODO Auto-generated method stub
		if(set!=null){
			set.add("数学");
			set.add("语文");
			set.add("生物");
			set.add("化学");
			set.add("政治");
		}
	}

	@SuppressWarnings("rawtypes")
	private static void showElement(Set set) {           //输出Set的元素
		// TODO Auto-generated method stub
		if(set!=null&&set.size()>0){
			Iterator it=set.iterator();    //获得迭代器iterator
			while(it.hasNext()){                     //循环获得Set中的每个元素
				System.out.print(it.next()+" ");
			}
		}else{
			System.out.println("没有元素！");
		}
		System.out.println();
	}

}
