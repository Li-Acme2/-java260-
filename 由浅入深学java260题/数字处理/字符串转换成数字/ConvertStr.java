package �ַ���ת��������;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ConvertStr {
	public static int convInt(String s){            //���ַ���ת��Ϊ�����ַ�
		try{
			return Integer.parseInt(s);	
		}catch(NumberFormatException e){
			return 0;
		}
	}
	public static Long convLong(String s){          //���ַ���ת��Ϊ������
		try{
			return Long.parseLong(s);
		}catch(NumberFormatException e){
			return 0l;
		}
	}
	static String p="####000000000.00$";
	public static double convDouble(String s){        //���ַ���ת��Ϊ˫��������
		try{
			return Double.parseDouble(s);
		}catch(NumberFormatException e){
			return 0d;
		}
	}
	public static int[] convIntArray(String[] as){    //���ַ�������ת������������
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
		System.out.println(s1+"ת��Ϊ���Σ�"+convInt(s1));
		String s2="567";
		System.out.println(s2+"ת��Ϊ���Σ�"+convInt(s2));
		String s3="549847845654";
		System.out.println(s3+"ת��Ϊ���Σ�"+convInt(s3));
		System.out.println(s3+"ת��Ϊ�����ͣ�"+convLong(s3));
		String s4="132.5";
		System.out.println(s4+"ת��Ϊ���Σ�"+convInt(s4));
		System.out.println(s4+"ת��Ϊ˫���ȣ�"+convDouble(s4));
		System.out.println(s4+"����ʽ��Ϊ��"+NumberFormat.getNumberInstance().format(convDouble(s4)));//�淶��ʽ
		System.out.println(s4+"����ʽ��Ϊ��"+NumberFormat.getCurrencyInstance(Locale.CHINA).format(convDouble(s4)));//������ʽ
		System.out.println(s4+"����ʽ��Ϊ��"+NumberFormat.getPercentInstance(Locale.CHINA).format(convDouble(s4)));//�ٷֱ���ʽ
		DecimalFormat df=new DecimalFormat();
		df.applyPattern(p);
		System.out.println(s4+"����ʽ����"+df.format(convDouble(s4)));
		String[] as=null;
		convIntArray(as);
	}

}
