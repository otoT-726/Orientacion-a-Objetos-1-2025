package OrientacionObjetos1.ejercicio18_EvenNumberSet;

import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class EvenNumberSet implements Set<Integer> {
	
	ArrayList<Integer> lista;
	
	public int size() {
		return lista.size();
	}
	
	public boolean add(Integer num) {
		if(num % 2 == 0 && !lista.contains(num)) {
			lista.add(num);
			return true;
		}
		return false;
	}
	
	public boolean remove(Integer num) {
		if(lista.contains(num)) {
			lista.remove(num);
			return true;
		}
		return false;
	}

	
	public boolean isEmpty() {
		if(lista.size() == 0)
			return true;
		return false;
	}

	
	public boolean contains(Object o) {
		if(lista.contains(o))
			return true;
		return false;
	}

	
	public Iterator<Integer> iterator() {
		return lista.iterator();
	}

	
	public Object[] toArray() {
		return lista.toArray();
	}

	
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean remove(Object o) {
		if(lista.contains(o)) {
			lista.remove(o);
			return true;
		}
		return false;
	}


	public boolean containsAll(Collection<?> c) {
		return lista.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		for(Integer o: c) {
			lista.add(o);
		}
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		lista.retainAll(c);
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
