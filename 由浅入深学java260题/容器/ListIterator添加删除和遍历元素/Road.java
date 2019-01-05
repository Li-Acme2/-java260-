package ListIterator添加删除和遍历元素;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*
 * 使用L模拟警察调度公路上的车，可以查看来的方向和取得方向是否有车，而且可以随意的将某车加入到任意位置或者移下公路
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
		ListIterator<String>  li=cars.listIterator();   //取得“警察”对象
		System.out.println("放行："+li.next());
		System.out.println("违章，靠边停车："+li.next());
		li.remove();
		for(String c:cars){
			System.out.println(c);
		}
		String cc=li.next();
		System.out.println("让"+cc+"到前面去");
		li.remove();
		for(String c:cars){
			System.out.println(c);
		}
		li.next();
		li.next();
		li.next();
		li.next();
		li.set(cc);
		System.out.println("\n现在道路畅通了");
		for(String c:cars){
			System.out.println(c);
		}
	}

}
