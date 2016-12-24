package com.zeshan;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zeshanrasul on 24/12/2016.
 */
public class PrimeFactorTest {

    private PrimeFactor primeFactor = new PrimeFactor();

    @Test
    public void generateShouldReturnALiftOfIntegerFactorsInIncreasingOrder() {
        List<Integer> factors = Arrays.asList(2, 3, 5);
        List<Integer> generatedFactors = primeFactor.generate(30);
        assertEquals(factors, generatedFactors);
    }
}