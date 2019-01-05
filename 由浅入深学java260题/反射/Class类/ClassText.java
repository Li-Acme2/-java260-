package Class类;

class Father{
	public int memberFather;  //父类的公共成员变量
	public void methodFather(){   //公共方法
		System.out.println("这是从父类继承而来的方法methodFather");
	}
}
class Son extends Father{
	public int memberSonPublic;  //子类的公共成员变量
	@SuppressWarnings("unused")
	private int memberSonPrivate;  //子类的私有成员变量
	public void methodSonPublic(){  //公共方法
		System.out.println("这是子类自己的方法methodSonPublic");
	}
	public void methodSonProtected(){
		System.out.println("这是子类自己的方法methodSonProtected");
	}
}
public class ClassText {
	
	public static void main(String[] args){
		try{
			//加载指定类
			@SuppressWarnings("rawtypes")
			Class cs=Class.forName("反射.ClassText.Son");
			Son mySon=(Son)cs.newInstance();
			//调用创建对象的方法
			System.out.println("调用创建对象的方法：");
			mySon.methodSonProtected();
			mySon.methodSonPublic();
			mySon.methodFather();
			//加载类的详细信息
			System.out.println("加载类的信息：");
			System.out.println(cs.getName()+"自己声明了"+cs.getDeclaredFields().length+"个成员变量");
			System.out.println(cs.getName()+"类对外公布的方法有"+cs.getMethods().length+"个");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
