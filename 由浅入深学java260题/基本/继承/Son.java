package �̳�;

public class Son extends Father implements StepFather{
	private String ss;//���ӵ�����
	public void sets(String ss){
		this.ss=ss;
	}
	public String gets(){
		return ss;
	}
	public void hitChild(){//�ӿڷ�����ʵ��
		System.out.println("���Ǽ̸���");
	}
}
