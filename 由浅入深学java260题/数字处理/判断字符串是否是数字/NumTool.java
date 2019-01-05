package 判断字符串是否是数字;

import java.util.regex.Pattern;

public class NumTool {
	public static boolean isNum(String s){
		for(int i=s.length();--i>=0;){
			if(!Character.isDigit(s.charAt(i))){//通过java函数判断是否为数字
				return false;
			}
		}
		return true;
	}
	public static boolean isNumByRegex(String s){
		Pattern p=Pattern.compile("[0-9]*");      //编译正则表达式
		return p.matcher(s).matches();
	}
	public static boolean isNumByAscii(String s){
		for(int i=s.length();--i>=0;){
			int c=s.charAt(i);
			if(c<48||c>57){             //判断字符c是否在48-57之间
				return false;
			}
		}
		return true;
	}
	//不提倡使用，抛出异常会消耗非常大的资源，对效率影响较大，频繁出现异常，会非常致命。
	public static boolean isNumByException(String s){
		try{
			Integer.parseInt(s);
		}catch(NumberFormatException e){          //捕捉NumberFormatException
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		String s1="789";
		System.out.println(s1+"是数字吗："+isNum(s1));
		String s2="667";
		System.out.println(s2+"是数字吗："+isNumByRegex(s2));
		String s3="567";
		System.out.println(s3+"是数字吗："+isNumByAscii(s3));
		String s4="abc";
		System.out.println(s4+"是数字吗："+isNum(s4));
		String s5="555dd";
		System.out.println(s5+"是数字吗："+isNumByRegex(s5));
		String s6="gh567";
		System.out.println(s6+"是数字吗："+isNumByAscii(s6));
	}

}
