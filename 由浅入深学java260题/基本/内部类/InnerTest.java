package �ڲ���;

public class InnerTest {
	public static void main(String[] args){
		Outer out=new Outer();
		out.useIner();
	} 

}
class Outer{
	String out_string="String in Outer";//�����ⲿ��ı���
	void useIner(){//�����ⲿ��ķ���
		Iner in=new Iner();//���ⲿ���ж��ڲ���Ķ�����ж���
		in.print();//�����ڲ���Ķ���
	}
	//�����ڲ���
	class Iner{
		void print(){
			System.out.println("Iner.print()");
			System.out.println("use\'"+out_string+"\'");
		}
	}
}
