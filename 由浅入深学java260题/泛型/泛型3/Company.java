package 泛型3;

import java.util.ArrayList;
import java.util.List;
/*使用Company作为List的参数类型，并添加和遍历元素。*/
public class Company {
	private String name;
	private Number revenue;   //revenue：收入，收益   
	public Company(String name,Number revenue){
		this.name=name;
		this.revenue=revenue;
	}
	public static void main(String[] args){
		List<Company> cs=new ArrayList<Company>();
		cs.add(new Company("chinaTele",500000));
		cs.add(new Company("sinopetro",30000000000l));//用Number来自动适应数字的大小。
		cs.add(new Company("chinaMobile",6000000));
		for(Company s:cs){
			System.out.println(s.name+"总收入："+s.revenue);
		}
	}
}
