package ArrayList;

/*
 *  ��һ���������������ӣ�����������ɫ���ڷ�����ס�Ų�ͬ�������ˣ�ÿ���˺Ȳ�ͬ�����ϣ��鲻ͬƷ�Ƶ����̣�����ͬ�ĳ����˭�����㣿       
 
  //���Ĵ���
 
public class lookUp {
	public void lookUp(){
		init();
		co_Array=new int[array.size()][5];       //������ɫ�Ķ�ά����
		pe_Array=co_Array;
		dr_Array=co_Array;
		sm_Array=co_Array;
		pet_Array=co_Array;
		for(int count=0;count<array.size();count++){   //ѭ�������ʼ��������ɫ����
			co_Array[count]=(int[])array.get(count);
		}
		for(int num1=0;num1<co_Array.length;num1++){
			if(!case4(num1))
			continue;
			if(!case14(num1))
			continue;
			for(int num2=0;num2<pe.Array.length;num2++;){
			if(!case1(num2,num1))
			continue;
			if(!case8(num2))
			continue;
			for(int num3=0;num3<dr_Array.length;num3++){
			if(!case3(num2,num3))
			continue;
			if(!case5(num1,num3))
			continue;
			if(!case9(num3))
			continue;
			for(int num4=0;num4<sm_Array;num4++){
			if(!case(num1,num4))
			continue;
			if(!case12(num4,num3))
			continue;
			if(!case13(num2,num4))
			continue;
			if(!case15(num4,num3))
			continue;
			for(int num5=0;num5<pet_Array.length;num5++){
			if(!case2(num2,num5))
			continue;
			if(!case6(num4,num5))
			continue;
			if(!case10(num4,num5))
			continue;
			if(!case11(num5,num4))
			continue;
			total++;
			answer(num1,num2,num3,num4,num5);
			}
			}
			}
			}
		}
	}

	private void init() {             //����һ�����ݵ���Ϸ�ʽ
		// TODO Auto-generated method stub 
		ArrayList array=new ArrayList();               //������������
		for(int num1=0;num1<5;num1++){
		for(int num2=0;num2<5;num2++){
		if(num2==num1)
		continue;
		for(int num3=0;num3<5;num3++){
		if(num3==num2||num3==num1)
		continue;
		for(int num4=0;num4<5;num4++){
		if(num4==num3||num4==num2||num4==num1)
		continue;
		for(int num5=0;num5<5;num5++){
		if(num5==num4||num5==num3||num5==num2||num5==num1)
		continue;
		int oneArray[]= {num1,num2,num3,num4,num5};
		array.add(oneArray);
		}
		}
		}
		}
		}
	}

}
*/