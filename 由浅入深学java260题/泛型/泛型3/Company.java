package ����3;

import java.util.ArrayList;
import java.util.List;
/*ʹ��Company��ΪList�Ĳ������ͣ�����Ӻͱ���Ԫ�ء�*/
public class Company {
	private String name;
	private Number revenue;   //revenue�����룬����   
	public Company(String name,Number revenue){
		this.name=name;
		this.revenue=revenue;
	}
	public static void main(String[] args){
		List<Company> cs=new ArrayList<Company>();
		cs.add(new Company("chinaTele",500000));
		cs.add(new Company("sinopetro",30000000000l));//��Number���Զ���Ӧ���ֵĴ�С��
		cs.add(new Company("chinaMobile",6000000));
		for(Company s:cs){
			System.out.println(s.name+"�����룺"+s.revenue);
		}
	}
}
