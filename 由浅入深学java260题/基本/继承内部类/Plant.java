package �̳��ڲ���;

public class Plant {
	public String shape="��Բ��";                    //Ҷ�ӵ���״
	private static String color="��ɫ";              //������ɫ
	private String grow="������";                    //��������
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		Fruit f=new Fruit();                      //����Fruit��
		f.print();                                //����Fruit���print����
		new Apple().main(args);                   //����Apple���main����
	}
	static class Fruit{
		String taste;                        //ζ��
		boolean iron;                        //�Ƿ��к�
		Fruit(){                             //����������ֵ
			this.taste="��";
			this.iron=true;
		}
		public void print(){//�����ⲿ��ı���
			System.out.println("Ҷ�ӵ���״��"+new Plant().shape);
			System.out.println("������ɫ��"+color);
			System.out.println("����������"+new Plant().grow);
		}
	}

}
