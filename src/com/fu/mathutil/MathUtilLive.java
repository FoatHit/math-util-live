/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author ADMIN
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("expected: 5! = 120; actual: " + MathUtil.getFactorial(5));
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(0));
        System.out.println("expected: 1! = 1; actual: " + MathUtil.getFactorial(1));
        //System.out.println("expected: 21! = Invalid value; actual: " + MathUtil.getFactorial(21));
        
        
        //Thêm code sau lần đầu tiên làm chuyện ấy - code lên sever 6:15PM
         System.out.println("expected: 10! = 3628800; actual: " + MathUtil.getFactorial(10));
    }
    
}
