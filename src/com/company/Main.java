package com.company;

import java.sql.Array;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	    Object[] o = {"text 1", 14132, 5753, "text 2", "----------- 3"};
	    MyArray<Object> itrO = new MyArray<Object>(o);

	    for (int i = 0; i<15; i++){
            System.out.println(itrO.next());
        }

    }
}

class MyArray <T> implements Iterator {

    private T[] array;
    private int index = 0;

    public MyArray(T[] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (index < array.length){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if (hasNext()){
            return array[index++];
        }
        index = 0;
        return array[index++];
    }

    @Override
    public void remove() {
        array[index] = null;
    }
}
