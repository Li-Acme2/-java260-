package HashSet无重复元素;

import java.util.HashSet;
/*HashSet不能有重复的元素*/
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
		System.out.println("        Zoom想要俩个座位");
		for(String seat:seats){
			System.out.println(seat);
		}
	}

}
