package 拆分示例;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		Collection<String> collstr=new ArrayList<String>();  //创建一个元素为String类型的列表
		collstr.add("张三");                      //为列表添加元素
		collstr.add("李四");
		collstr.add("王五");
		collstr.add("赵六");
		System.out.println(collstr);                       //输出类表的元素内容
		//Object arrayo=collstr.toArray();                //将列表转换为数组
		Collection<String> coll=new ArrayList<String>();      //创建一个元素为字符串类型的列表
		coll.add("赵刚");
		coll.add("莉莉");
		coll.addAll(collstr);
		System.out.println(coll);                            //输出第二个集合的内容
		System.out.println("coll.contains(\"赵刚\")="+coll.contains("赵刚"));   //查看列表是否包含赵刚
		System.out.println("coll.contains(collstr)="+coll.containsAll(collstr)); //查看第二个集合是否包含有第一个集合的元素
		coll.retainAll(collstr);//从第二个集合中删除第一个集合中不包含的元素
		System.out.println("从第二个集合中删除第一个集合中不包含的元素，第二个集合元素为：");
		System.out.println(coll);    //输出第二个集合中的元素
		coll.add("赵刚");              //为列表c2添加元素
		Iterator it=coll.iterator();    //返回列表迭代器
		System.out.print("(");	
		while(it.hasNext())                     //通过迭代器遍历列表中的元素
			System.out.print(it.next()+",");                //输出容器元素
		System.out.print(")");
		coll.removeAll(collstr);              //从第二个集合中删除第一个集合中包含的元素
		System.out.println("从第二个集合中删除第一个集合中包含的元素，第二个集合元素为：");
		System.out.println(coll);
		coll.remove("赵刚");
		System.out.println("coll.isEmpty()="+coll.isEmpty());    //查看类表是否为空列表
		System.out.println(collstr);
		collstr.clear();           //清除第一个集合中的元素
		System.out.println("使用clear（）方法后，第一个集合中的元素\n"+collstr);
	}

}
/*首先创建对象是使用ArrayList创建的collstr容器对象，添加元素使用add（）方法。接下来创建第二个容器对象coll，使用add（）方法添加元素。然后使用
 * coll的addAll（）方法将第一个集合中的元素添加到第二个集合中。最后使用retionAll（）方法将第一个集合中的元素剔除，并且使用clear方法将第一个集合
 * 中的元素全部清除。*/
