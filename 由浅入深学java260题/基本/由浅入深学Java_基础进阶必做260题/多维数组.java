package 由浅入深学Java_基础进阶必做260题;

public class 多维数组 {
	public static void main(String[] args){
		int[][] two={
				{1,2,3,4,5},{6,7,8,9,10},
				{11,12,13,14,15},{16,17,18,19,20},
				{21,22,23,24,25}
		};
		for(int i=0;i<two.length;i++){
			for(int j=0;j<two[i].length;j++){
				System.out.print(two[i][j]+" ");
			}
			System.out.print("\n");
		}
	
		System.out.println();
		
		//第二种方法：
		int[][] Two=new int[5][5];
		int k=1;
		for(int i=0;i<Two.length;i++){
			for(int j=0;j<Two[i].length;j++){
				Two[i][j]=2*k++;
			}
		}
		for(int i=0;i<Two.length;i++){
			for(int j=0;j<Two[i].length;j++){
				System.out.print(Two[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println();
	}

}
