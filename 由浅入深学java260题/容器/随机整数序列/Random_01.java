package �����������;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 *����һ������������У�Ҫ���ܹ������ظ��������
 *���������ʹ��Random�࣬������������������У����ǲ��ܱ�֤�����ɵ��������������û���ظ����ݵĲ�����ʹ��list�����������ظ���������У�
 *����ʹ��ɾ�������ų��������ɵ�������������Ǹ��ж� 
 */
public class Random_01 {
	int minValue = 0;
	int maxValue = 3;
	
//	public Random_01(int minValue,int maxValue){        //���������췽����ʼ������
//	this();
//	if(maxValue>=minValue){
//	this.minValue=minValue;
//	this.maxValue=maxValue;
//	}else{
//	System.out.println("���ֵС����Сֵ����Ĭ��ֵ���и�ֵ��");
//	}
//	}
public Random_01() {
		// TODO Auto-generated constructor stub
	}
@SuppressWarnings({ "rawtypes", "unchecked" })
public List esclusionSort(int len){            //�����ų������ɲ��ظ������������,lenΪ������ĳ���
	if(len<=0){        //�жϴ������ֵ
	return null;
	}else if(len>(this.maxValue-this.minValue)){
	System.out.println("���Ȳ��ܴﵽ��"+len+"����ֻ���ǣ�"+(this.maxValue-this.minValue));
	len=this.maxValue-this.minValue;
	}
	Random random=new Random();              //���������������
	List result=new ArrayList();             //�����б����
	while(result.size()<len){
	int a=random.nextInt();
	if(!result.contains(a)){         //�ж��б����Ƿ��������
	result.add(a);           //������ζ���
	}
	}
//	return (Integer[]) result.toArray(new Integer[0]);//���б�ת��Ϊ�������鷵��
	return result;
}

public static void main(String[] args){
	Random_01 random_01 = new Random_01();
	System.out.println(random_01.esclusionSort(3));
}


//public Integer[] proceduresSort(int len){      //����ɸѡ�����ɲ��ظ������������
//	if(len<=0){
//	return new Integer[0];
//	}else if(len>(this.maxValue-this.minValue)){
//	System.out.println("���Ȳ��ܴﵽ��"+len+"����ֻ���ǣ�"+(this.maxValue-this.minValue));
//	len=this.maxValue-this.minValue;
//	}
//	int numLength=this.maxValue-this.minValue+1;        //��ʼ���б���
//	List list=new ArrayList();
//	for(i=this.minValue;i<=this.maxValue;i++){        //ѭ�����λ������
//	list.add(new Integer[i]);              //���б��������������
//	}
//	Random rd=new Random();                            //������������±�
//	List result=new ArrayList();                     //�����б����
//	while(result.size()<len){
//	int index=rd.nextInt(numLength);            //����[0��numLength)��Χ�ڵ��±�
//	result.add(list.get(index));                   //�±�Ϊindex�����ֶ�������б������
//	list.remove(index);                    //�Ƴ��±�Ϊindex���������
//	numLength--;                        //��ѡ���г��ȼ�ȥ1
//	}
//	return (Integer[])result.toArray(new Integer[0]);       //���б�ת�����������鷵��
//}
//public static void printArray(Integer[] data){            //��ʾ����Ԫ��
//	if(data!=null){                             //�ж������Ƿ�Ϊ��
//	for(int i=0;i<data.length;i++){                      //ѭ����ʾ��������
//	System.out.println(data[i]+"\t");
//	}
//	}
//	System.out.println();
//}
}
