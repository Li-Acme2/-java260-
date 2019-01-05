package 随机整数序列;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 *产生一个随机整数序列，要求不能够产生重复的随机数
 *分析：如果使用Random类，可以生成随机整数序列，但是不能保证所生成的随机整数序列中没有重复数据的产生，使用list来完成输出不重复的随机序列，
 *可以使用删除法和排除法对生成的随机数即你想那个判断 
 */
public class Random_01 {
	int minValue = 0;
	int maxValue = 3;
	
//	public Random_01(int minValue,int maxValue){        //带参数构造方法初始化变量
//	this();
//	if(maxValue>=minValue){
//	this.minValue=minValue;
//	this.maxValue=maxValue;
//	}else{
//	System.out.println("最大值小于最小值，按默认值进行赋值！");
//	}
//	}
public Random_01() {
		// TODO Auto-generated constructor stub
	}
@SuppressWarnings({ "rawtypes", "unchecked" })
public List esclusionSort(int len){            //运用排除法生成不重复的随机数序列,len为随机数的长度
	if(len<=0){        //判断传入的数值
	return null;
	}else if(len>(this.maxValue-this.minValue)){
	System.out.println("长度不能达到："+len+"长度只能是："+(this.maxValue-this.minValue));
	len=this.maxValue-this.minValue;
	}
	Random random=new Random();              //用于生成随机对象
	List result=new ArrayList();             //创建列表对象
	while(result.size()<len){
	int a=random.nextInt();
	if(!result.contains(a)){         //判断列表中是否包含对象
	result.add(a);           //添加整形对象
	}
	}
//	return (Integer[]) result.toArray(new Integer[0]);//将列表转换为整形数组返回
	return result;
}

public static void main(String[] args){
	Random_01 random_01 = new Random_01();
	System.out.println(random_01.esclusionSort(3));
}


//public Integer[] proceduresSort(int len){      //运用筛选法生成不重复的随机数序列
//	if(len<=0){
//	return new Integer[0];
//	}else if(len>(this.maxValue-this.minValue)){
//	System.out.println("长度不能达到："+len+"长度只能是："+(this.maxValue-this.minValue));
//	len=this.maxValue-this.minValue;
//	}
//	int numLength=this.maxValue-this.minValue+1;        //初始化列表长度
//	List list=new ArrayList();
//	for(i=this.minValue;i<=this.maxValue;i++){        //循环依次获得整数
//	list.add(new Integer[i]);              //在列表中添加整形数字
//	}
//	Random rd=new Random();                            //用于生成随机下标
//	List result=new ArrayList();                     //创建列表对象
//	while(result.size()<len){
//	int index=rd.nextInt(numLength);            //生成[0，numLength)范围内的下标
//	result.add(list.get(index));                   //下标为index的数字对象放入列表对象中
//	list.remove(index);                    //移除下标为index的数组对象
//	numLength--;                        //候选队列长度减去1
//	}
//	return (Integer[])result.toArray(new Integer[0]);       //将列表转换成整形数组返回
//}
//public static void printArray(Integer[] data){            //显示数组元素
//	if(data!=null){                             //判断数组是否为空
//	for(int i=0;i<data.length;i++){                      //循环显示数组数据
//	System.out.println(data[i]+"\t");
//	}
//	}
//	System.out.println();
//}
}
