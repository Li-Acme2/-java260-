package 多重接口实现;

public class Operation {
	public static void main(String[] args){
		OTest o=new OTest();
		System.out.println(o.add(2, 3));
		System.out.println(o.sub(9, 6));
		System.out.println(o.mul(2, 3));
		System.out.println(o.umul(9, 3));
	}

}
interface Oadd{//加法
	int add(int a,int b);
}
interface Osub{//减法
	int sub(int a,int b);
}
interface Omul{//乘法
	int mul(int a,int b);
}
interface Oumul{//除法
	int umul(int a,int b);
}
class OTest implements Oadd,Osub,Omul,Oumul{
	public int add(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
	public int mul(int a,int b){
		return a*b;
	}
	public int umul(int a,int b){
		return a/b;
	}
}

