package 字节输入输出流;

public class People {
		private String name;
		private int age;
		public int getAge(){
			return age;
		}
		public void setAge(int age){
			this.age=age;
		}
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name=name;
		}
		public People(String name,int age){
			super();
			this.age=age;
			this.name=name;
		}
}
