package 使用LinkList模拟队列queue;

import java.util.LinkedList;
/*队列就是先进去的元素先出来*/
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
