package HashSet���ظ�Ԫ��;

import java.util.HashSet;
/*HashSet�������ظ���Ԫ��*/
public class Room{
	
	public static void main(String[] args){
		HashSet<String> seats=new HashSet<String>();
		seats.add("Mike");
		seats.add("Zoom");
		seats.add("Rose");
		seats.add("Jone");
		for(String seat:seats){
			System.out.println(seat);
		}
		seats.add("Zoom");
		System.out.println("        Zoom��Ҫ������λ");
		for(String seat:seats){
			System.out.println(seat);
		}
	}

}
