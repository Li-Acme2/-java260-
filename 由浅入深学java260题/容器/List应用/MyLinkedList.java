package ListӦ��;

public class MyLinkedList {
	public static void main(String[] args){
		//����Ԫ���Ƚ��ȳ�
		impQueue myQueue=new LinkedList();            //ʵ��������Queue����
		myQueue.inQueue("\tThankyou");                    //���Ԫ�����
		myQueue.inQueue("\tThanks");
		System.out.println("Queue������Ԫ�س��������");
		while(!myQueue.isEmpty()){                            //ѭ���ж϶����Ƿ�Ϊ��
			System.out.println(myQueue.outQueue());                     //��Ϊ������������е�Ԫ��
		}
		//ջԪ���Ƚ����
		impStack myStack=new LinkedList();                      //ʵ����Stackջ����
		System.out.println("\nStack������Ԫ�س��������");
		myStack.push("\tabcdefg");                               //���Ԫ����ջ
		myStack.push("\tgfedcba");
		while(!myStack.isEmpty()){                            //ѭ���ж�ջ�Ƿ�Ϊ��
			System.out.println(myStack.pop());                     //��Ϊ�������ջԪ��
		}
	}

}
