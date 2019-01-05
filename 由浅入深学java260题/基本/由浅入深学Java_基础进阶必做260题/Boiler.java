package 由浅入深学Java_基础进阶必做260题;

public class Boiler {//开水问题
	public static void main(String[] args){
		/*int i=0;
		while(true){
			i++;
			if(i<100){
				System.out.println("开水");
			}else{
				System.out.println("不是开水");
				break;
			}
		}*/
		boolean Boil=true;
		int j=0;
		while(true){
			if(!Boil){
				continue;//当Boil为false时，将一直执行continue，跳出循环，所以不会输出"开水"
			}
			j++;
			if(j<100){
				j++;
				System.out.println("开水"+j);
			}else{
				Boil=false;
			}
		}
	}

}
