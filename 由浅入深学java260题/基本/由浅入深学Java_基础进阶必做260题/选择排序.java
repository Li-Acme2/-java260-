package 由浅入深学Java_基础进阶必做260题;

public class 选择排序 {

	public static void  main(String[] args){
		int[] intarray={1,23,45,66,2,332,8,5};
		int keyvaule;//键值，即将用来被比较的值。
		int index;//
		int temp;//临时数，即将排定的最大（最小）的数据。
		System.out.println("未排序的数组：");
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
		System.out.println("排好序的数组：");
		for(int b: intarray){
			System.out.print(b+" ");
		}
	}
}
