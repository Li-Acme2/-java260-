package 由浅入深学Java_基础进阶必做260题;

public class thisTest {
	String eat="该吃饭了。";
	String tea="该喝下午茶了。";
	int i=16;
	
	public void eat(int i){//使用了方法中的参数
		if(i>11&&i<14){
			System.out.println("现在是"+i+"点,"+eat);
		}
		else if(i>15&&i<17){
			System.out.println("现在是"+i+"点，"+tea);
		}
	}
	public void tea(int i){//使用了成员变量
		if(this.i>11&&this.i<14){
			System.out.println("现在是"+this.i+"点,"+eat);
		}
		else if(this.i>15&&this.i<17){
			System.out.println("现在是"+this.i+"点，"+tea);
		}
	}
	
	public static void main(String[] args){
		thisTest tt=new thisTest();
		tt.eat(12);
		tt.tea(12);
	}

}
