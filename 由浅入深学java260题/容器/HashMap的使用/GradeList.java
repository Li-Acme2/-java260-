package HashMap��ʹ��;

import java.util.HashMap;
import java.util.Map;

/*ģ��༶ѧ���ĳɼ��⣬ÿ��ѧ����Ӧһ���ɼ���ʵ�ֶ�̬ɾ���͸���ѧ���ɼ������ҿ��Դ�ӡ����ѧ���ĳɼ���*/
public class GradeList {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		HashMap<String,Integer> grades=new HashMap<String,Integer>();
		grades.put("Tom", 70);
		grades.put("Jack", 65);
		grades.put("Zim", 76);
		grades.put("Jone", 90);
		for(Map.Entry e:grades.entrySet()){
			System.out.println(e.getKey()+"�ĳɼ��ǣ�"+e.getValue());
		}
		System.out.println("\n�޸ĺ�ĳɼ��ǣ�");
		grades.put("Jack", 80);
		grades.put("Jone", 87);
		for(Map.Entry e:grades.entrySet()){
			System.out.println(e.getKey()+"�ĳɼ��ǣ�"+e.getValue());
		}
	}

}
