package �̳��ڲ���;

public class Apple extends Plant.Fruit {
	Apple(String taste){                       //�Զ�����ι��췽��
		this.taste=taste;                      //���¸�taste��ֵ
	}
	Apple(){
		super();                           //���ø���Ĺ��췽��
	}
	public static void main(String[] args){
		Apple apple=new Apple();                 //����Apple����
		//���ø���ı���
		System.out.println("ƻ����ζ����"+apple.taste);
		System.out.print("ƻ���Ƿ��кˣ�");//+apple.iron
		if(apple.iron==true){
			System.out.print("��");
		}else{
			System.out.print("û��");
		}
	}

}
