package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jlli on 7/27/16.
 */
public class PrimeFactors {

    public void printPrimeFactors(int n){
        Integer[] primeList = primeFactors(n);
        System.out.println(Arrays.toString(primeList));
    }

    Integer[] primeFactors(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i=2;i <= n;i++){
            while(n != i){
                if(n%i != 0){
                    break;                }
                list.add(Integer.valueOf(i));
                n = n/i;
            }
        }
        list.add(Integer.valueOf(n));
        return list.toArray(new Integer[list.size()]);
    }
}
