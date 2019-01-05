
public class PowerOfFive implements Number {//5的倍数
	int start;
	int val;
	public static void main(String[] args){
		PowerOfFive pf=new PowerOfFive();
		pf.setMult(5);
		System.out.println(pf.start);
		System.out.println(pf.val);
		System.out.println(pf.getNextVal());
	}
	PowerOfFive(){
		start=1;
		val=1;
	}
	public int getNextVal(){    //5的倍数
		setMult(val);
			val*=5;
			System.out.println("getNextVal");
		return val;
	}
	public void setInitVal(){
		start =1;
		val=1;
		System.out.println("setInitVal");
	}
	public void setMult(int n){
		start=n;
		val=n;
		System.out.println("setMult");
	}

}
