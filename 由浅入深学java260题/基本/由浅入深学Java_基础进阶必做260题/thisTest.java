package ��ǳ����ѧJava_�������ױ���260��;

public class thisTest {
	String eat="�óԷ��ˡ�";
	String tea="�ú�������ˡ�";
	int i=16;
	
	public void eat(int i){//ʹ���˷����еĲ���
		if(i>11&&i<14){
			System.out.println("������"+i+"��,"+eat);
		}
		else if(i>15&&i<17){
			System.out.println("������"+i+"�㣬"+tea);
		}
	}
	public void tea(int i){//ʹ���˳�Ա����
		if(this.i>11&&this.i<14){
			System.out.println("������"+this.i+"��,"+eat);
		}
		else if(this.i>15&&this.i<17){
			System.out.println("������"+this.i+"�㣬"+tea);
		}
	}
	
	public static void main(String[] args){
		thisTest tt=new thisTest();
		tt.eat(12);
		tt.tea(12);
	}

}
