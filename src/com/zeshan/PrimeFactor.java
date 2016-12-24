package com.zeshan;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public static void main(String[] args) {
    }


    public List<Integer> generate(int n) {
        int i = 2;
        List<Integer> generatedFactors = new ArrayList<Integer>();
        while (n > 1) {
            if (n % i == 0) {
                generatedFactors.add(i);
                n = n/i;
            } else {
                i++;
            }
        }
        return generatedFactors;
    }
}
