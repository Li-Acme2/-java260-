package ListӦ��;

abstract class AbsMyList {
	protected int len=0;         //����
	protected AbsMyList(){         //Ĭ�Ϲ��췽��
		
	}
	abstract public boolean add(Object o);                  //���б�ĩβ���һ��Ԫ��
	abstract public Object getElement(int index);     //���ָ��Ԫ��  //element:Ԫ��   index:ָ�룬ָ��
	abstract public boolean isElement(Object o);              //�ж��Ƿ����Ԫ��
	abstract int indexOf(Object o);                          //�ж�Ԫ��λ��
	abstract public boolean deleteElement(Object o);                 //�Ƴ�Ԫ��
	abstract public void clear();                     //���
	public int len(){                     //��ó��ȴ�С
		return this.len;
	}
	public boolean isEmpty(){         //�ж��Ƿ�Ϊ��
		return this.len==0;
	}
}
interface impQueue{                    //���нӿ�
	void inQueue(String o);            //���
	Object outQueue();                 //����
	boolean isEmpty();             //�ж��Ƿ�Ϊ��
}
interface impStack{                  //ջ�ӿ�
	void push(Object o);               //Ԫ����ջ
	Object pop();                  //Ԫ�س�ջ
	boolean isEmpty();             //�Ƿ�Ϊ��
}
/*���ȴ����ڲ���AbsMyList��Ȼ�󴴽��ӿ�impQueue��impStack�����ڽӿ��ж���һϵ�з���*/