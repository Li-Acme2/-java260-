package �в������ڲ���;

public class SporterTest {//���������̳л�ʵ�ֵĽӿڣ�ֻ�д������Ĺ��췽����û���޲������췽��������������ʽ������
	                      //������ ������=new �������������У�
	                      //{����ʵ�ִ��룻
						  //}
	public void drink(Beverages drink){
		System.out.println("�˶�Ա������"+drink);
	}
	public static void main(String[] args){
		SporterTest sp=new SporterTest();
		Beverages be=new Beverages(){
			public String toString(){
				return "���ά����C";
		}
		};
	System.out.println(be.toString());
	    //Beverages be=new Beverages("��֭");	    
		sp.drink(new Beverages("��֭"){
			
		});
		sp.drink(new Beverages("����"){
			/*public void addVataminc(){
				System.out.println("��Ӷ�����̼");
			}*/
		});
		sp.drink(new Beverages("ѩ��"){
			/*public void addVataminc(){
				System.out.println("��Ӷ�����̼");
			}*/
		});
		sp.drink(new Beverages("�Ҵ�"){
		/*public void addVataminc(){
			System.out.println("���ɫ��");
		}*/
		});
		sp.drink(new Beverages("�̲�"){
			/*public void addVataminc(){
				System.out.println("���ɫ��");
			}*/
		});

	}

}
class Beverages{
	private String juicename;
	public Beverages(String name){
		this.juicename=name;
	}
	public Beverages() {
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return juicename;
	}
	
}
