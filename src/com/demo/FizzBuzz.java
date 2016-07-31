package com.demo;

import java.util.stream.IntStream;

/**
 * Created by jlli on 7/27/16.
 */
public class FizzBuzz {

    private void printFizz(){
        System.out.println("Fizz");
    }
    private void printBuzz(){
        System.out.println("Fizz");
    }
    private void printFizzBuzz(){
        System.out.println("Fizz");
    }

    public void fizzBuzz(int start, int end){
        IntStream.range(start, end)
                .forEach( (i) -> {
                    if(i%3==0 && i%5==0)
                        printFizzBuzz();
                    else if(i%3==0)
                           printFizz();
                    else if(i%5==0)
                        printBuzz();
                    else System.out.println(i);
                });
    }
}
