package �ַ����Ĳ���;

public class SplitString {
	public static void main(String[] args){
		String s="��Ҷ��ʱ����������Ҷ��ʱ��޳ɡ���֪�����鳣�ڣ�������ͷ��ˮ����";
		String r="��|��";
		String[] ss=s.split(r);       //String[] ss=s.split(r,3);��ֳ�����
		for(String a:ss){
			System.out.println(a);
		}
	}

}
