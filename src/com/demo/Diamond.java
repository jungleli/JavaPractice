package com.demo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by jlli on 7/27/16.
 */
public class Diamond {
    private void drawSpace(int n){
        IntStream.rangeClosed(0, n)
                .forEach(i -> System.out.print(" "));
    }

    private void drawAsterisk(int n){
        Stream.generate(()->'*')
                .limit(n)
                .forEach(System.out::print);
    }

    private void drawNewline(){
        System.out.println();
    }

    private void drawName(){
        System.out.println("Junli");
    }

    private void drawInvertedCenteredTriangle(int n){
        IntStream.range(0, n)
                .forEach( (i) -> {
                    drawSpace(i);
                    drawAsterisk(2*(n-1-i)+1);
                    drawNewline();
                } );
    }

    public void drawCenteredTriangle(int n) {
        IntStream.range(0, n)
                 .forEach( (i) -> {
                     drawSpace(n-i);
                     drawAsterisk(2*i+1);
                     drawNewline();
                 } );
    }

    public void drawCenteredDiamond(int n) {
        drawCenteredTriangle(n-1);
        drawInvertedCenteredTriangle(n);
    }

    public void drawCenteredDiamondWithName(int n) {
        drawCenteredTriangle(n-1);
        drawName();
        drawInvertedCenteredTriangle(n-1);
    }
}

