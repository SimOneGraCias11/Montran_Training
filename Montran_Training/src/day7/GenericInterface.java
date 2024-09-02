package day7;

import java.io.*;

interface MinMax<T extends Comparable<T>> {

	T min();

	T max();

}

class Generic<T extends Comparable<T>> implements MinMax<T> {
	T[] obj;

	Generic(T[] ob) {
		this.obj = ob;
	}

	@Override
	public T min() {
		T value = obj[0];

		for (int i = 1; i < obj.length; i++) {
			if (obj[i].compareTo(value) < 0) {
				value = obj[i];
			}

		}
		return value;
	}

	@Override
	public T max() {
		T value = obj[0];

		for (int i = 0; i < obj.length; i++) {
			if (obj[i].compareTo(value) > 0) {
				value = obj[i];
			}

		}
		return value;
	}

}

public class GenericInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = { 1, 2, 6, 3, 4 };
		Generic<Integer> gt = new Generic<Integer>(a);
		System.out.println("Max:" + gt.max());
		System.out.println("Min:" + gt.min());
	}

}
