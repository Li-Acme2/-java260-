package �ַ�ͳ��;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class FileTest {
	//ͳ��ָ���ļ��е��ַ����������У�fileNameָ�����ļ���ȫ·��
	public static long xermote(String fileName){
		FileReader reader=null;
		try{
			reader =new FileReader(fileName);  //�������������ַ����ı��������
			StreamTokenizer stn=new StreamTokenizer(new BufferedReader(reader));//���ݸ������ַ����������������stn
			//����ָ�������ţ�˫���ź�ע�͵�ת���ַ��ڴ˱��������������ͨ�ַ�������������������ĺ���
			stn.ordinaryChar('\'');
			stn.ordinaryChar('\"');
			stn.ordinaryChar('/');
			//��������ͳ���ַ������ĸ�������
			String str;
			int num_sum=0;  //����ͳ�������ַ������ı���
			int word_sum=0; //����ͳ����ĸ�����ֵ��ַ������ı���
			int sym_sum=0;//����ͳ�Ʊ����ŵ��ַ������ı���
			int sum=0;    //���ڼ���ȫ�������ַ������ı���
			//������������һ����ǲ�����ĩβ�ĳ���
			while(stn.nextToken()!=StreamTokenizer.TT_EOF){
				switch(stn.ttype){//���жϵ�ǰ��ȡ�����ı������
				case StreamTokenizer.TT_EOL:   //TT_EOL��ʾ�Զ�����ĩβ�ĳ���
				break;
				case StreamTokenizer.TT_NUMBER://TT_NUMBERָʾ�Ѷ���һ�����ֱ�ǵĳ���
				str=String.valueOf((stn.nval));//stn.nval��ʾ�����ֱ�ǵ�ֵ   string.valueof������������������̬ת����string
				num_sum+=str.length();
				break;
				case StreamTokenizer.TT_WORD:  //TT_WORDָʾ�Ѷ���һ�����ֱ�ǵĳ���
					str=stn.sval;   //stn.sval��ʾ�����ֱ�ǵ�ֵ
					word_sum+=str.length();
					break;
				default:    //�������3�����Ͷ����ǣ���ΪӢ�ĵı�����
				str=String.valueOf((char)stn.ttype);
				sym_sum+=str.length();
				}
			}
			System.out.println("���ֱ�ǵĺ�Ϊ��"+num_sum);
			System.out.println("���ֱ�ǵĺ�Ϊ��"+word_sum);
			System.out.println("�����ű�ǵĺ�Ϊ��"+sym_sum);
			sum=num_sum+word_sum+sym_sum;
			System.out.println("���ļ��е��ַ�����Ϊ��"+sum);
			return sum;
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}finally{
			if(reader!=null){
				try{
					reader.close();
				}catch(IOException e1){}
			}
		}
	}
	public static void main(String[] args){
		
	}

}
