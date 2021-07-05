package com.lisz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer n = iterator.next();
            System.out.println(n);
        }
    }

}
