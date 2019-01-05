package 由浅入深学Java_基础进阶必做260题;

public class maopaoTest {
	public static void main(String[] args){
		int[] intarray={33,5,34,1,2,67,213,8};
		int temp;
		System.out.println("未排序之前：");
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
		System.out.println("排好序之后：");
		for(int i=0;i<intarray.length;i++){
			System.out.print(intarray[i]+" ");
		}
		System.out.println();
	}

}
