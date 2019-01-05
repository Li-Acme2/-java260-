package 接口的引用;

public class AlgorTest {//在java中，可以建立接口类型的引用变量。接口的引用变量可以存储一个指向对象的值引用，
	                         //而这个对象可以是任何的实现该接口的实例。对象的方法必须是类中的非抽象方法。
	public static void main(String[] args){
		Algor al=new Algor();
		ladd ad=al;
		lsub su=al;
		lmul mu=al;
		lumul um=al;
		System.out.println("这是使用对象引用来调用的方法：");
		System.out.println(al.add(1, 2));
		System.out.println(al.sub(3, 4));
		System.out.println(al.mul(5, 6));
		System.out.println(al.umul(7, 7));
		System.out.println("这是使用接口引用调用方法：");
		System.out.println(ad.add(8, 9));
		System.out.println(su.sub(9, 11));
		System.out.println(mu.mul(10, 11));
		System.out.println(um.umul(12, 6));
	}

}
interface ladd{
	int add(int a,int b);
}
interface lsub{
	int sub(int a,int b);
}
interface lmul{
	int mul(int a,int b);
}
interface lumul{
	int umul(int a,int b);
}
class Algor implements ladd,lsub,lmul,lumul{
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