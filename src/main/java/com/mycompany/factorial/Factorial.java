/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

/**
 *
 * @author Hp
 */
public class Factorial {

    public static int factorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else 
        return n *factorial(n-1);
    }
    public static void main(String[] args) {
        int n= 4;
        int result = factorial(n); 
        System.out.println("Reuslt is  " +result);
    }
}
