package �ڲ���;

public class �̳��ڲ��� {
	public class InnerClassTest{
		class Clothes{
			private String material;
			private int size;
			private String color;
			public String getColor(){
				return color;
			}
			public void setColor(String color){
				this.color=color;
			}
			public String getMaterial(){
				return material;
			}
			public void setMaterial(String material){
				this.material=material;
			}
			public int getSize(){
				return size;
			}
			public void setSize(int size){
				this.size=size;
			}
		}
	} 
	class Coat extends InnerClassTest.Clothes{
		public Coat(InnerClassTest o){
			o.super();                      //��ʼ���ⲿ���ʹ��
		}
	}

}
