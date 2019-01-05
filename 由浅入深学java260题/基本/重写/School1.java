package 重写;

public class School1{
		String sname;
		int sid;
		int snumber;
		public School1(String name,int id,int number){
			sname=name;
			sid=id;
			snumber=number;
		}
		void print(){
			System.out.println("学校名是："+sname+"，序号："+sid+"，人数："+snumber);
		}
	}

