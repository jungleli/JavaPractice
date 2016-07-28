package com.demo;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.printSingleAsterisk();
        triangle.drawHorizontalLine(8);
        triangle.drawVerticalLine(3);
        triangle.drawRightTriangle(3);

        Diamond diamond = new Diamond();
        diamond.drawCenteredTriangle(5);
        diamond.drawCenteredDiamond(3);
        diamond.drawCenteredDiamondWithName(3);
    }
}
