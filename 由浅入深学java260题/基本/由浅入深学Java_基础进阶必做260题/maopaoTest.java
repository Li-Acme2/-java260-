package ��ǳ����ѧJava_�������ױ���260��;

public class maopaoTest {
	public static void main(String[] args){
		int[] intarray={33,5,34,1,2,67,213,8};
		int temp;
		System.out.println("δ����֮ǰ��");
		for(int i=0;i<intarray.length;i++){
			System.out.print(intarray[i]+" ");
		}
		System.out.println();
		for(int i=0;i<intarray.length;i++){
			for(int j=i;j<intarray.length;j++){
				
				if(intarray[j]<intarray[i]){
					temp=intarray[i];
					intarray[i]=intarray[j];
					intarray[j]=temp;
				}
			}	
		}
		System.out.println("�ź���֮��");
		for(int i=0;i<intarray.length;i++){
			System.out.print(intarray[i]+" ");
		}
		System.out.println();
	}

}
