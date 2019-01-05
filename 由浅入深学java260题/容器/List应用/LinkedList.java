package ListӦ��;

public class LinkedList extends AbsMyList implements impQueue,impStack{
	private static class InnerMyEntry{                          //��̬�ڲ���
		Object object;                                      //����
		InnerMyEntry next;                                    //��һ������
		InnerMyEntry previous;                              //��һ������
		InnerMyEntry(Object object,InnerMyEntry next,InnerMyEntry previous){   //�Դ������Ĺ��췽�����г�ʼ��
			this.object=object;
			this.next=next;
			this.previous=previous;
	}

}
	private InnerMyEntry header=new InnerMyEntry(null,null,null);         //����ʵ�����
	public LinkedList(){                                                  //Ĭ�Ϲ��췽�����г�ʼ��
		this.header.next=this.header.previous=this.header;
	}
	private InnerMyEntry addBefore(Object o,InnerMyEntry e){              //��Ӷ���֮ǰ�Ĳ�������
		InnerMyEntry newEntry=new InnerMyEntry(o,e,e.previous);            //����ʵ�����
		newEntry.next.previous=newEntry;
		newEntry.previous.next=newEntry;
		this.len++;
		return newEntry;
	}
	public boolean add(Object o){              //��Ӷ���
		this.addBefore(o, header);
		return true;
	}
	public void clear(){                       //��ն���
		InnerMyEntry e=this.header.next;
		while(e!=this.header){                 
			InnerMyEntry next=e.next;
			e.next=e.previous=null;                //��ն���
			e.object=null;
			e=next;
		}
		this.header.next=this.header.previous=this.header;
		this.len=0;
	}
	public boolean isElement(Object o){                        //�Ƿ��������
		return this.indexOf(o)!=-1;
	}
	public Object getElement(int index){                     //���ָ���Ķ���
		InnerMyEntry myEntry=this.entry(index);
		if(myEntry==null)
			return null;
		return myEntry.object;
	}
	public int indexOf(Object o){                        //��ö�����ջ������е�λ��
		int index=0;
		if(o==null){
			for(InnerMyEntry e=this.header.next;e!=this.header;e=e.next){        //ѭ�����Ԫ�ض���
				if(e.object==null)
					return index;
				index++;
			}
		}else{
			for(InnerMyEntry e=this.header.next;e!=this.header;e=e.next){       //ѭ�����Ԫ�ض���
				if(o.equals(e.object))
					return index;
				index++;
			}
		}
		return -1;
	}
	public boolean deleteElement(Object o){                                  //�Ƴ�����
		if(o==null){
			for(InnerMyEntry e=header.next;e!=header;e=e.next){        //ѭ�����Ԫ�ض���
				if(e.object==null){
					return this.deleteElement(e);                      //�Ƴ�����
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
	public Object outQueue(){                   //���ӷ���
		Object result=this.header.next.object;     //��ö���
		this.deleteElement(this.header.next);          //�Ƴ�����
		return result;
	}
	public void inQueue(String o){           //��ӷ���
		this.addBefore(o, header);           //��������Ӷ��� 
	}
	public Object pop(){                  //��ջ����
		Object result=this.header.previous.object;  //��ö���
		this.deleteElement(this.header.previous);    //�Ƴ�����
		return result;
	}
	public void push(Object o){              //��ջ
		this.addBefore(o, header);                   //��������Ӷ���
	}
	private boolean deleteElement(InnerMyEntry e){        //�Ƴ�����
		if(e==header){
			return false;
		}
		e.previous.next=e.next;                 //���¸�ֵ
		e.next.previous=e.previous;                  //���¸�ֵ
		e.next=e.previous=null;             //���
		e.object=null;
		this.len--;
		return true;
	}
	
	private InnerMyEntry entry(int index) {             //���ָ����Ԫ��
		if(index<0||index>=this.len){             //�ж�ָ��Ԫ�ص��±�
			return null;
		}
		InnerMyEntry e=header;
		if(index<(this.len>>1)){                          //�ж�ѭ�����ָ����ʵ��
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
/*���ȴ����ӿ���ͽӿ�ʵ����LinkedList��Ȼ��ʵ�ֽӿ�impQueue��impStack�����ӿڡ������ڴ����д���һ���ڲ���InnerMyEntry�࣬���ڸ��ڲ�����
 ��������������Ķ���Ȼ�����ô������Ĺ��췽��Ϊ�����Ķ���ֵ��ʹ��add������������addBefore����������������ֵ��clear�������������һ������
 ���ݶ����ǵ�ǰ�������ѭ�����������������һ�����󣬲�������������һ������һ�������ÿա�isElement������������indexOf���������ж϶�����
 ����ڣ���������ڣ��򷵻�false��getElement�����������ݱ�Ż��ָ���Ķ����������Ϊ�գ��򷵻ض����Ԫ�ء�outQueue����������ö����Ԫ�أ�
 ����deleteElement���������Ƴ��ö��󣬲����ظö���inQueue������������addBefore���������������Ԫ�ء�pop����������ö��󣬵���deleteElement
 �����Ƴ��ö��󣬲����ظö���*/
