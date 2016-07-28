package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by jlli on 7/27/16.
 */
public class Triangle {

    public void printSingleAsterisk() {
        System.out.println('*');
    }

    public void drawHorizontalLine(int n) {
        Stream.generate(()->'*')
                .limit(n)
                .forEach(System.out::print);
        System.out.println();
    }

    public void drawVerticalLine(int n) {
        Stream.generate(()->'*')
                .limit(n)
                .forEach(System.out::println);
    }

    public void drawRightTriangle(int n) {
        IntStream.range(0, n)
                .forEach( i -> drawHorizontalLine(i+1));
    }
}
