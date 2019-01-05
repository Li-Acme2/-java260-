package 数组列表应用;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args){
		List <String> list=new ArrayList<String>(4);      //创建一个大小为4的集合  
		list.add("语文");                                  //向集合中添加元素，增加科目
		list.add("数学");
		list.add("生物");
		list.add("物理");
		System.out.println("第一次选课单中的科目：");
		for(Iterator<String> iter=list.iterator();iter.hasNext();){ 
			String s= iter.next();                         //获取每个元素
			System.out.println(s+"\t");
			if("数学".equals(s)){           //第一次选课的科目为数学
 				iter.remove();                         //将其从科目中删除
			}
		}
		System.out.println();
		System.out.println("第二次选课单中的科目：");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s+"\t");
			if("语文".equals(s)||"物理".equals(s)){                  //第二次选语文和物理
				it.remove();
			}
		}
		System.out.println();
		System.out.println("最后还没有选择的科目：");
		for(Iterator<String> iter=list.iterator();iter.hasNext();){            //打印剩余科目
			String s=iter.next();
			System.out.println(s+"\t");
		}
	}

}
