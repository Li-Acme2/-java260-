package Class��;

class Father{
	public int memberFather;  //����Ĺ�����Ա����
	public void methodFather(){   //��������
		System.out.println("���ǴӸ���̳ж����ķ���methodFather");
	}
}
class Son extends Father{
	public int memberSonPublic;  //����Ĺ�����Ա����
	@SuppressWarnings("unused")
	private int memberSonPrivate;  //�����˽�г�Ա����
	public void methodSonPublic(){  //��������
		System.out.println("���������Լ��ķ���methodSonPublic");
	}
	public void methodSonProtected(){
		System.out.println("���������Լ��ķ���methodSonProtected");
	}
}
public class ClassText {
	
	public static void main(String[] args){
		try{
			//����ָ����
			@SuppressWarnings("rawtypes")
			Class cs=Class.forName("����.ClassText.Son");
			Son mySon=(Son)cs.newInstance();
			//���ô�������ķ���
			System.out.println("���ô�������ķ�����");
			mySon.methodSonProtected();
			mySon.methodSonPublic();
			mySon.methodFather();
			//���������ϸ��Ϣ
			System.out.println("���������Ϣ��");
			System.out.println(cs.getName()+"�Լ�������"+cs.getDeclaredFields().length+"����Ա����");
			System.out.println(cs.getName()+"����⹫���ķ�����"+cs.getMethods().length+"��");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
