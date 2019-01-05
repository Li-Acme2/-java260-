package List的添加和遍历;


import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
	public static void main(String[] args){
		List<String> storage=new ArrayList<String>();           //超市仓库
		storage.add("foods");
		storage.add("tools");
		storage.add("books");
		storage.add("cars");
		List<String> clothing=new ArrayList<String>();          //大量进货
		clothing.add("dress");
		clothing.add("costume");
		clothing.add("gown");
		storage.addAll(clothing);
		System.out.println("超市的商品：");
		for(String p:storage){
			System.out.println(p);
		}
		System.out.println("\n调整商品结构");
		storage.remove("cars");
		System.out.println("更新后的商品：");
		for(String p:storage){
			System.out.println(p);
		}
	}

}
