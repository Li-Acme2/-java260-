package ��̬�ڲ���;

public class StaticInnerClass {//һ���ڲ�������Գ���һ��ָ���ⲿ������ã��ɴ˾Ϳ���ֱ�ӷ����ⲿ���һЩ��Ա��
	                            //������ӵ�д����ԣ�����Ҫ���ڲ�������Ϊ��̬���ԡ�
	public static void main(String[] args){
		Painter p=new Painter();
		p.print();
		p.setName("����");
	}

}
class Painter{
	private Pen pen=new Pen();
	private String name="111";
	static class Pen{
		//private String lead="Ǧ��о";
		public void print(){
			System.out.println("ʹ��Ǧ�ʡ�����");
		}
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Pen getPen(){
		return pen;
	}
	public void setPen(Pen pen){
		this.pen=pen;
	}
	public void print(){
		pen.print();
	}
}
