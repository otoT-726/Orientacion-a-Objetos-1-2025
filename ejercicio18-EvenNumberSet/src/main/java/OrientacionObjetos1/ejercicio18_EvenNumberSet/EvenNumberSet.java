package OrientacionObjetos1.ejercicio18_EvenNumberSet;

import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;



public class EvenNumberSet implements Set<Integer> {
	
	private Set<Integer> lista;
	
	public EvenNumberSet() {
		this.lista = new HashSet<Integer>();
	}
	
	public int size() {
		return lista.size();
	}
	
	public boolean add(Integer num) {
		if(num % 2 == 0) {
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
		for(Object n: c) {
			lista.remove(n);
		}
		return true;
	}

	@Override
	public void clear() {
		for(Integer n: lista) {
			lista.remove(n);
		}
	}
	
	public String toString() {
		return this.lista.toString();
	}
	
	public static void main(String[]args) {
		Set<Integer> set = new EvenNumberSet();
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(4);
		set.add(6);
		System.out.println(set);
		Set<Integer> set2 = new HashSet<>();
		set2.add(4);
		set2.add(6);
		System.out.println(set2);
	}
}
