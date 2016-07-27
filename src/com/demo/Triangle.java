package com.demo;

import java.util.concurrent.SynchronousQueue;
import java.util.stream.IntStream;

/**
 * Created by jlli on 7/27/16.
 */
public class Triangle {

    public void printSingleAsterisk(){
        System.out.println('*');
    }

    public void drawHorizontalLine(int n){
        IntStream.range(0, n).forEach(
                i -> System.out.print('*')
        );
        System.out.println();
    }

    public void drawVerticalLine(int n){
        IntStream.range(0, n).forEach(
                i -> System.out.println('*')
        );
    }

    public void drawRightTriangle(int n){

    }
}
