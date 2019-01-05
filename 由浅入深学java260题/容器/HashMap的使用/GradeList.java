package HashMap的使用;

import java.util.HashMap;
import java.util.Map;

/*模拟班级学生的成绩库，每个学生对应一个成绩，实现动态删除和更改学生成绩，并且可以打印所有学生的成绩。*/
public class GradeList {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		HashMap<String,Integer> grades=new HashMap<String,Integer>();
		grades.put("Tom", 70);
		grades.put("Jack", 65);
		grades.put("Zim", 76);
		grades.put("Jone", 90);
		for(Map.Entry e:grades.entrySet()){
			System.out.println(e.getKey()+"的成绩是："+e.getValue());
		}
		System.out.println("\n修改后的成绩是：");
		grades.put("Jack", 80);
		grades.put("Jone", 87);
		for(Map.Entry e:grades.entrySet()){
			System.out.println(e.getKey()+"的成绩是："+e.getValue());
		}
	}

}
