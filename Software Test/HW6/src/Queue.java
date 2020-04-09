public class Queue {

	private int bound;
	private int size;
	private int[] queueArray;
    
	public Queue(int b) throws IllegalBoundException {
		// TODO Auto-generated constructor stub
		if(b < 0) 
			throw new IllegalBoundException("Illegal Bound Exception!\n");
		
		bound = b;
		size = 0;
		queueArray = new int [b];
	}

	public int getBound() {
		// TODO Auto-generated method stub
		return bound;
	}
    
	public String toString() {
		// TODO Auto-generated method stub
		String s= "[";
		int n;
		for(n = 0; n < size-1; n++)
			s = s + queueArray[n] + ',';
		s = size > 0 ? s + queueArray[n] : s;
		return s+']';
	}
    
	public void insert(int i) throws QueueFullException {
		// TODO Auto-generated method stub
		if(size >= bound) 
			throw new QueueFullException("Queue Full Exception!\n");
		
		queueArray[size++] = i;
		return ;
	}

	public void delete() throws QueueEmptyException {
//		 TODO Auto-generated method stub
		int num;
		if(size <= 0)
			throw new QueueEmptyException("Queue Empty Exception!\n");
		
		for(num = 0; num < size-1; num++)
		    queueArray[num] = queueArray[num+1];
		size--;
		return ;
	}
	
	public int getSize() {
		return this.size;
	}

	public int first() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(size <= 0)
			throw new QueueEmptyException("Queue Empty Exception!\n");
		
		return queueArray[0];
	}

	public int last() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(size <= 0)
			throw new QueueEmptyException("Queue Empty Exception!\n");
		
		return queueArray[size-1];
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean x=(size==0)?true:false;
		return x;
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		boolean x=(size==bound)?true:false;
		return x;
	}
}
