package 由浅入深学Java_基础进阶必做260题;

public class 数组_字符串 {
	public static void main(String[] args){
		String s="";
		String[] ss={
				"劝君莫惜金缕衣，",
				"劝君惜取少年时。",
				"花开堪折直须折，",
				"莫待无花空折枝。"
		};
		for(String a:ss){
			s+=a;
		}
		System.out.println(s);
	}

}
