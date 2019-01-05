package List应用;

public class LinkedList extends AbsMyList implements impQueue,impStack{
	private static class InnerMyEntry{                          //静态内部类
		Object object;                                      //对象
		InnerMyEntry next;                                    //下一个对象
		InnerMyEntry previous;                              //上一个对象
		InnerMyEntry(Object object,InnerMyEntry next,InnerMyEntry previous){   //对带参数的构造方法进行初始化
			this.object=object;
			this.next=next;
			this.previous=previous;
	}

}
	private InnerMyEntry header=new InnerMyEntry(null,null,null);         //创建实体对象
	public LinkedList(){                                                  //默认构造方法进行初始化
		this.header.next=this.header.previous=this.header;
	}
	private InnerMyEntry addBefore(Object o,InnerMyEntry e){              //添加对象之前的操作方法
		InnerMyEntry newEntry=new InnerMyEntry(o,e,e.previous);            //创建实体对象
		newEntry.next.previous=newEntry;
		newEntry.previous.next=newEntry;
		this.len++;
		return newEntry;
	}
	public boolean add(Object o){              //添加对象
		this.addBefore(o, header);
		return true;
	}
	public void clear(){                       //清空对象
		InnerMyEntry e=this.header.next;
		while(e!=this.header){                 
			InnerMyEntry next=e.next;
			e.next=e.previous=null;                //清空对象
			e.object=null;
			e=next;
		}
		this.header.next=this.header.previous=this.header;
		this.len=0;
	}
	public boolean isElement(Object o){                        //是否包含对象
		return this.indexOf(o)!=-1;
	}
	public Object getElement(int index){                     //获得指定的对象
		InnerMyEntry myEntry=this.entry(index);
		if(myEntry==null)
			return null;
		return myEntry.object;
	}
	public int indexOf(Object o){                        //获得对象在栈或队列中的位置
		int index=0;
		if(o==null){
			for(InnerMyEntry e=this.header.next;e!=this.header;e=e.next){        //循环获得元素对象
				if(e.object==null)
					return index;
				index++;
			}
		}else{
			for(InnerMyEntry e=this.header.next;e!=this.header;e=e.next){       //循环获得元素对象
				if(o.equals(e.object))
					return index;
				index++;
			}
		}
		return -1;
	}
	public boolean deleteElement(Object o){                                  //移除对象
		if(o==null){
			for(InnerMyEntry e=header.next;e!=header;e=e.next){        //循环获得元素对象
				if(e.object==null){
					return this.deleteElement(e);                      //移除对象
				}
			}
		}else{
			for(InnerMyEntry e=header.next;e!=header;e=e.next){
				if(o.equals(e.object)){
					return this.deleteElement(e);	
				}
			}
		}
		return false;
	}
	public Object outQueue(){                   //出队方法
		Object result=this.header.next.object;     //获得对象
		this.deleteElement(this.header.next);          //移除对象
		return result;
	}
	public void inQueue(String o){           //入队方法
		this.addBefore(o, header);           //调方法添加对象 
	}
	public Object pop(){                  //出栈方法
		Object result=this.header.previous.object;  //获得对象
		this.deleteElement(this.header.previous);    //移除对象
		return result;
	}
	public void push(Object o){              //入栈
		this.addBefore(o, header);                   //调方法添加对象
	}
	private boolean deleteElement(InnerMyEntry e){        //移除对象
		if(e==header){
			return false;
		}
		e.previous.next=e.next;                 //重新赋值
		e.next.previous=e.previous;                  //重新赋值
		e.next=e.previous=null;             //清空
		e.object=null;
		this.len--;
		return true;
	}
	
	private InnerMyEntry entry(int index) {             //获得指定的元素
		if(index<0||index>=this.len){             //判断指定元素的下标
			return null;
		}
		InnerMyEntry e=header;
		if(index<(this.len>>1)){                          //判断循环获得指定的实体
			for(int i=0;i<=index;i++)
				e=e.next;
		}else{
			for(int i=this.len;i>index;i--)
				e=e.previous;
		}
		return e;
		// TODO Auto-generated method stub
	}
}
/*首先创建接口类和接口实现类LinkedList，然后实现接口impQueue和impStack俩个接口。接着在此类中创建一个内部类InnerMyEntry类，并在该内部类中
 声明俩个自身类的对象，然后利用带参数的构造方法为声明的对象赋值。使用add（）方法调用addBefore（）方法并返回真值。clear（）方法获得下一个对象，
 根据对象不是当前对象进行循环，获得这个对象的下一个对象，并将这个对象的下一个和上一个对象置空。isElement（）方法调用indexOf（）方法判断对象是
 否存在，如果不存在，则返回false。getElement（）方法根据编号获得指定的对象，如果对象不为空，则返回对象的元素。outQueue（）方法获得对象的元素，
 调用deleteElement（）方法移除该对象，并返回该对象。inQueue（）方法调用addBefore（）往对象中添加元素。pop（）方法获得对象，调用deleteElement
 方法移除该对象，并返回该对象。*/
