package 泛型2;

public class Tax<T extends Number> {
	private T value;
	public Tax(T v){
		value=v;
	}
	public static void main(String[] args){
		Tax<Float> shop=new Tax<Float>(366.5f);
		Tax<Double> superMarket=new Tax<Double>(5005.00);//5005d的结果一样
		Tax<Integer> chinaTele=new Tax<Integer>(4000000);
		Tax<Long> sinopetro=new Tax<Long>(300000000000l);
		
		System.out.println("小商店今年纳税："+shop.value);
		System.out.println("大超市今年纳税："+superMarket.value);
		System.out.println("中国电信今年纳税："+chinaTele.value);
		System.out.println("中国石油今年纳税："+sinopetro.value);
	}

}
