package ��ǳ����ѧJava_�������ױ���260��;

public class �����׻÷� {
	public static void main(String[] args){
//�׻÷��γɵķ�����
		int n=3;
		int[][] a=new int[3][3];
		int i=n-1 ,j=n/2;
		for(int k=1;k<=n*n;k++){
			a[i++][j++]=k;
			if(k%n==0){
				i-=2;
				j--;
			}
			else{
				i=i%n;
				j=j%n;
			}			
		}
		int[][] arr={{1,2,3},{4,5,6}};
		for(int l=0;l<arr.length;l++){
			for(int o=0;o<arr[l].length;o++){
				System.out.print(arr[l][o]+" ");
			}
			System.out.println("\n");//�γɸ�ֵķ��ţ�ʹ�����γɽ����͡�
		}
		
		System.out.print("�����÷���\n");
		for(int k=0;k<a.length;k++){
			for(int b=0;b<a[k].length;b++){
				System.out.print(a[k][b]+" ");
			}
			System.out.println("\n");
		}
//�Խ��ߺ͵ļ���		
		int q=0,w=0,e=0;
		for(int x=0;x<a.length;x++){
			for(int y=0;y<a[x].length;y++){
				w=a[x][y];//w�Ǳ����鸳ֵ�Ķ���
				if(x==y){
					q+=w;//q�������Խ��ߵĺͣ���һ���߽����ֵ����
					if(x*2+1==n){
					e=w;//e�ǻý׷����м��ֵ��
				}
				}	
			}
		}
		System.out.println("���Խ���֮�ͣ�");
		System.out.println(2*q-e);//���Խ���֮��
		
		System.out.println();
	}

}
