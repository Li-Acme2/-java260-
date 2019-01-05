package 由浅入深学Java_基础进阶必做260题;

public class stringbuffer的使用 {
	//length()：返回字符串的长度。
	//insert（）：在字符串的中间插入，有几种不同的参数形式。
	//append()：在字符串的末尾追加字符串。
	//setCharAt（int index,char ch）:设置指定索引位置为制定的字符。
	//toString（）：返回字符串。
	//capacity():返回当前数据容量和缓存区的容量之和。
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		StringBuffer sb3=new StringBuffer("玲珑骰子安红豆，开不完春柳春花满画楼。");
		
		String s1="Hello ";
		String s2="World!";
		sb.append("张三，");
		sb.append("回家，");
		sb.append("吃饭。");
		
		sb2.append(s1);
		sb2.insert(sb2.length(), s2);
		System.out.println(sb2);
		
		System.out.println(sb.toString());
		int i=sb.length();
		System.out.println(i);
		
		sb3.replace(sb3.indexOf("，")+1,sb3.length(),"入骨相思知不知？");//第一个参数是要替代的起始位置，第二个参数是结束位置，第三个是替换的内容。
		System.out.println(sb3);
		}

}
