package ��ǳ����ѧJava_�������ױ���260��;

public class ѡ������ {

	public static void  main(String[] args){
		int[] intarray={1,23,45,66,2,332,8,5};
		int keyvaule;//��ֵ�������������Ƚϵ�ֵ��
		int index;//
		int temp;//��ʱ���������Ŷ��������С�������ݡ�
		System.out.println("δ��������飺");
		for(int a : intarray){
			System.out.print(a+" ");
		}
		System.out.println();
		for(int i=0;i<intarray.length;i++){
			 index=i;
			 keyvaule=intarray[i];
			for(int j=i;j<intarray.length;j++){
				if(intarray[j]>keyvaule){
					index=j;
					keyvaule=intarray[j];
				}
			}
			temp=intarray[i];
			intarray[i]=intarray[index];
			intarray[index]=temp;
		}	
		System.out.println("�ź�������飺");
		for(int b: intarray){
			System.out.print(b+" ");
		}
	}
}
