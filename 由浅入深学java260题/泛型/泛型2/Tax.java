package ����2;

public class Tax<T extends Number> {
	private T value;
	public Tax(T v){
		value=v;
	}
	public static void main(String[] args){
		Tax<Float> shop=new Tax<Float>(366.5f);
		Tax<Double> superMarket=new Tax<Double>(5005.00);//5005d�Ľ��һ��
		Tax<Integer> chinaTele=new Tax<Integer>(4000000);
		Tax<Long> sinopetro=new Tax<Long>(300000000000l);
		
		System.out.println("С�̵������˰��"+shop.value);
		System.out.println("���н�����˰��"+superMarket.value);
		System.out.println("�й����Ž�����˰��"+chinaTele.value);
		System.out.println("�й�ʯ�ͽ�����˰��"+sinopetro.value);
	}

}
