package �ӿڵ�����;

public class AlgorTest {//��java�У����Խ����ӿ����͵����ñ������ӿڵ����ñ������Դ洢һ��ָ������ֵ���ã�
	                         //���������������κε�ʵ�ָýӿڵ�ʵ��������ķ������������еķǳ��󷽷���
	public static void main(String[] args){
		Algor al=new Algor();
		ladd ad=al;
		lsub su=al;
		lmul mu=al;
		lumul um=al;
		System.out.println("����ʹ�ö������������õķ�����");
		System.out.println(al.add(1, 2));
		System.out.println(al.sub(3, 4));
		System.out.println(al.mul(5, 6));
		System.out.println(al.umul(7, 7));
		System.out.println("����ʹ�ýӿ����õ��÷�����");
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