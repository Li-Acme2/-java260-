package 字符串转换成数字;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ConvertStr {
	public static int convInt(String s){            //将字符串转换为整形字符
		try{
			return Integer.parseInt(s);	
		}catch(NumberFormatException e){
			return 0;
		}
	}
	public static Long convLong(String s){          //将字符串转换为长整型
		try{
			return Long.parseLong(s);
		}catch(NumberFormatException e){
			return 0l;
		}
	}
	static String p="####000000000.00$";
	public static double convDouble(String s){        //将字符串转换为双精度类型
		try{
			return Double.parseDouble(s);
		}catch(NumberFormatException e){
			return 0d;
		}
	}
	public static int[] convIntArray(String[] as){    //将字符串数组转换成整形数组
		if(as==null){
			return new int[0];
		}
		int[] ia=new int[as.length];
		for(int i=0;i<as.length;i++){
			ia[i]=convInt(as[i]);
		}
		return ia;
	}
	public static void main(String[] args){
		String s1=null;
		System.out.println(s1+"转换为整形："+convInt(s1));
		String s2="567";
		System.out.println(s2+"转换为整形："+convInt(s2));
		String s3="549847845654";
		System.out.println(s3+"转换为整形："+convInt(s3));
		System.out.println(s3+"转换为长整型："+convLong(s3));
		String s4="132.5";
		System.out.println(s4+"转换为整形："+convInt(s4));
		System.out.println(s4+"转换为双精度："+convDouble(s4));
		System.out.println(s4+"被格式化为："+NumberFormat.getNumberInstance().format(convDouble(s4)));//规范格式
		System.out.println(s4+"被格式化为："+NumberFormat.getCurrencyInstance(Locale.CHINA).format(convDouble(s4)));//货币形式
		System.out.println(s4+"被格式化为："+NumberFormat.getPercentInstance(Locale.CHINA).format(convDouble(s4)));//百分比形式
		DecimalFormat df=new DecimalFormat();
		df.applyPattern(p);
		System.out.println(s4+"被格式化："+df.format(convDouble(s4)));
		String[] as=null;
		convIntArray(as);
	}

}
