package Ê¹ÓÃLinkListÄ£Äâ¶ÑÕ»stack;

import java.util.LinkedList;

public class Stack {
	private LinkedList<String> stack=new LinkedList<String>();
	public void push(String s){
		stack.addFirst(s);
	}
	public String pop(){
		return stack.removeFirst();
	}
	public static void main(String[] args){
		Stack s=new Stack();
		s.push("car");
		s.push("bike");
		s.push("train");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
