package 由浅入深学Java_基础进阶必做260题;

public class 奇数阶幻方 {
	public static void main(String[] args){
//阶幻方形成的方法。
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
			System.out.println("\n");//形成格局的符号，使数组形成阶梯型。
		}
		
		System.out.print("输出奇幻方：\n");
		for(int k=0;k<a.length;k++){
			for(int b=0;b<a[k].length;b++){
				System.out.print(a[k][b]+" ");
			}
			System.out.println("\n");
		}
//对角线和的计算		
		int q=0,w=0,e=0;
		for(int x=0;x<a.length;x++){
			for(int y=0;y<a[x].length;y++){
				w=a[x][y];//w是被数组赋值的对象。
				if(x==y){
					q+=w;//q是两条对角线的和（多一个线交叉的值）。
					if(x*2+1==n){
					e=w;//e是幻阶方最中间的值。
				}
				}	
			}
		}
		System.out.println("两对角线之和：");
		System.out.println(2*q-e);//两对角线之和
		
		System.out.println();
	}

}
