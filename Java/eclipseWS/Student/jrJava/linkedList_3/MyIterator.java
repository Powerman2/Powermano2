package jrJava.linkedList_3;

public class MyIterator<S> {

	Link current;
	LinkedList list;
	
	public boolean hasNext(){
		if(current == null) return list.first !=null;
		return current.next!=null;
	}
	public Link next(){
		if(current == null)current = list.first;
		else current = current.next;
		return current;
	}
	public void reset(){
		current = null;
	}

	
}
