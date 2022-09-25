/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_20_Factorial {
    public static void main(String[]args){
        System.out.println("La factorial es: "+factorial(5));

    }
    //5 + 4 + 3 + 2 + 1
    public static int factorial(int valor){
        //factorial(0) --> 1
        if(valor == 0)
            return 1;
        else
            return valor * factorial(valor - 1);
    }
    
}
