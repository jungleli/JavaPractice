package com.test;
import com.demo.PrimeFactors;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by jlli on 7/31/16.
 */
public class PrimeFactorsTest {
    @Test
    public void should_return_primeFactors(){

        PrimeFactors primeFactors = new PrimeFactors();
        Integer[] expected = new Integer[]{2,3,5};
        Integer[] actual = primeFactors.primeFactors(30);
        assertArrayEquals("Result is not correct", expected, actual);
    }
}
