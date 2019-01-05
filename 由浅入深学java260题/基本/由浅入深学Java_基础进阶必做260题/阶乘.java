package 由浅入深学Java_基础进阶必做260题;

public class 阶乘 {//计算0,2,4,6,8的阶乘
	
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