package ��ǳ����ѧJava_�������ױ���260��;

public class �׳� {//����0,2,4,6,8�Ľ׳�
	
	public static int Factorial(int n){
		if(n==0)return 1;
		return n*Factorial(n-1);
	}
	public static int setInitVal(int y) {
		// TODO Auto-generated method stub
		
		return 2*y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Factorial f=new Factorial();
for(int i=0;i<5;i++){
	System.out.println(Factorial(setInitVal(i)));
	System.out.println("\n");
}
	}

		

}