package 重写;

public class School2 extends School1{
		String sadder;
		public School2(String name,int id,int number,String adder){
			super(name,id,number);
			sadder=adder;
		}
		void print(){
			System.out.println("学校名是："+sname+"，序号："+sid+"，人数："+snumber+"，学校地址："+"sadder");
	
		
	}

}
