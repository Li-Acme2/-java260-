package ���������;
//ͨ��java�ķ�����ƣ��������ɵĻ���������������Ϣ�����ҿ����޸ı�����ֵ�������Щ������protected��private
// �ģ����������setAccessible��true��������������׳�IllegalAccessException�쳣��
//�������java��ȫ���ƣ�����ܻ��׳�SecurityException�쳣



public class House {
	public String owner;
	protected int space;
	@SuppressWarnings("unused")
	private int price;
	public String address;
	@SuppressWarnings("unused")
	private static String name;
	public House(){}
	public House(String owner,int space,int price,String address,String n){
		this.owner=owner;
		this.space=space;
		this.price=price;
		this.address=address;
		name=n;
	}
	}
