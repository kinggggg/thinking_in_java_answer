// generics/GenericSequence.java
// TIJ4 Chapter Generics, Exercise 4, page 624
// 'Generify' innerclasses/Sequence.java.
import java.util.*;

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class GenericSequence<E> {	
	private List<E> list = new ArrayList<E>();
	private int next = 0;
	public GenericSequence(List<E> list) { this.list = list; }
	public void add(E e) { list.add(e); }
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() { return i == list.size(); }
		public Object current() { return list.get(i); }
		public void next() { if(i < list.size()) i++; } 
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		GenericSequence<String> gs = new GenericSequence<String>(ls);
		for(int i = 0; i < 10; i++)
			gs.add(Integer.toString(i));
		Selector selector = gs.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}