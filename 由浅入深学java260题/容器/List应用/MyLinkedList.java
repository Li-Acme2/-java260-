package List应用;

public class MyLinkedList {
	public static void main(String[] args){
		//队列元素先进先出
		impQueue myQueue=new LinkedList();            //实例化队列Queue对象
		myQueue.inQueue("\tThankyou");                    //添加元素入队
		myQueue.inQueue("\tThanks");
		System.out.println("Queue队列中元素出队情况：");
		while(!myQueue.isEmpty()){                            //循环判断队列是否为空
			System.out.println(myQueue.outQueue());                     //不为空则输出队列中的元素
		}
		//栈元素先进后出
		impStack myStack=new LinkedList();                      //实例化Stack栈对象
		System.out.println("\nStack队列中元素出队情况：");
		myStack.push("\tabcdefg");                               //添加元素入栈
		myStack.push("\tgfedcba");
		while(!myStack.isEmpty()){                            //循环判断栈是否为空
			System.out.println(myStack.pop());                     //不为空则输出栈元素
		}
	}

}
