package ×Ö·û´®µÄ²éÕÒ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindALL {
	public static void main(String[] args){
		String s="If i were to fall in love.It would have to be with you.Your eyes,your smile.The way you laugh.The things you say"
				+ " and do.Take me to the places.My heart never knew.So,if i were to fall in love.It would have to be with you.";
		String r="([^\\.]*\\.)";
		Pattern p=Pattern.compile(r);
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.println(m.group(0).trim());
		}
	}

}
