/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author ADMIN
 */
public class MathUtil {
    public static long getFactorial(int n){
        int result = 1;
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid value");
        else if(n == 0 || n == 1)
            return result;
        else 
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
        return result;
    }
}
