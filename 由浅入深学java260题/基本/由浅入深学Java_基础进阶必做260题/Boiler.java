package ��ǳ����ѧJava_�������ױ���260��;

public class Boiler {//��ˮ����
	public static void main(String[] args){
		/*int i=0;
		while(true){
			i++;
			if(i<100){
				System.out.println("��ˮ");
			}else{
				System.out.println("���ǿ�ˮ");
				break;
			}
		}*/
		boolean Boil=true;
		int j=0;
		while(true){
			if(!Boil){
				continue;//��BoilΪfalseʱ����һֱִ��continue������ѭ�������Բ������"��ˮ"
			}
			j++;
			if(j<100){
				j++;
				System.out.println("��ˮ"+j);
			}else{
				Boil=false;
			}
		}
	}

}
