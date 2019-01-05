package Pattern和Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattMatTest {
	public static void main(String[] args){
		//定义一个正则表达式和被匹配的字符串
		String patternStr="(0?[1-9]|1[0-2]):([0-5]\\d)([a|p]m)";
		String matcherStr="现在的时间是11:15am，这里的营业时间是每天的8:30am至5:30pm";//标点符号的注意
		//生成Pattern和Matcher对象
		Pattern pa=Pattern.compile(patternStr);
		Matcher ma=pa.matcher(matcherStr);
		StringBuffer sb=new StringBuffer();         //创建一个目标字符串缓冲区
		int count=0;                              //定义一个计数器
		System.out.println("初始字符串是：");          //将初始字符串打印出来
		System.out.println(matcherStr);
		while(ma.find()){                             //使用while循环进行匹配检查
			StringBuffer temp=new StringBuffer();            //创建一个临时字符串的缓冲区
			if(ma.group(3).equals("am")){      //如果时间是am，则进行替换。  设置事件的格式
				temp.append(ma.group(1));
				temp.append("：");
				temp.append(ma.group(2));
			}
			else{                         //设置时间为pm的进行替换，对时间进行提取
				int time=Integer.parseInt(ma.group(1));
				time=time+12;
				temp.append(time+":"+ma.group(2));             //设置新的时间格式
			}
			ma.appendReplacement(sb, temp.toString());//进行替换并将结果放置到目标字符串缓冲区中
			System.out.println("["+(++count)+"]将"+ma.group(0)+"替换为"+temp.toString());  //打印每次的替换情况
		}
		ma.appendTail(sb);   //将最后一次替换后剩余的字符串添加到目标字符串缓冲区
		System.out.println("最后的结果是");       //打印最后结果
		System.out.println(sb.toString());
	}

}
/*首先要定义正则表达式和被匹配字符串，并创建Pattern，Matcher对象。使用while循环对字符串精心匹配检查，并将匹配字符串替换，然后打印*/

