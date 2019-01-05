package List应用;

abstract class AbsMyList {
	protected int len=0;         //长度
	protected AbsMyList(){         //默认构造方法
		
	}
	abstract public boolean add(Object o);                  //向列表末尾添加一个元素
	abstract public Object getElement(int index);     //获得指定元素  //element:元素   index:指针，指标
	abstract public boolean isElement(Object o);              //判断是否包含元素
	abstract int indexOf(Object o);                          //判断元素位置
	abstract public boolean deleteElement(Object o);                 //移除元素
	abstract public void clear();                     //清空
	public int len(){                     //获得长度大小
		return this.len;
	}
	public boolean isEmpty(){         //判断是否为空
		return this.len==0;
	}
}
interface impQueue{                    //队列接口
	void inQueue(String o);            //入队
	Object outQueue();                 //出队
	boolean isEmpty();             //判断是否为空
}
interface impStack{                  //栈接口
	void push(Object o);               //元素入栈
	Object pop();                  //元素出栈
	boolean isEmpty();             //是否为空
}
/*首先创建内部类AbsMyList，然后创建接口impQueue和impStack，并在接口中定义一系列方法*/