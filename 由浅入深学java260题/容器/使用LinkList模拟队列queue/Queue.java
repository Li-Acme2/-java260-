package ʹ��LinkListģ�����queue;

import java.util.LinkedList;
/*���о����Ƚ�ȥ��Ԫ���ȳ���*/
public class Queue {
	private LinkedList<String> queue=new LinkedList<String>();
	public void insert(String s){
		queue.addLast(s);
	}
	public String remove(){
		return queue.removeFirst();
	}
	public static void main(String[] args){
		Queue q=new Queue();
		q.insert("Mike");
		q.insert("Jhon");
		q.insert("Rose");
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

}
