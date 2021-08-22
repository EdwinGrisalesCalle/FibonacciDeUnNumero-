/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Edwin Grisales Calle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //CalcularFibonachi calcular = new CalcularFibonachi();

        //System.out.println(calcular.fibonacci(4));

        //System.out.println("------------------");
        //System.out.println(calcular.esPrimo(257));

        
        int numeroFibonachi = CalcularFibonachi.fibonacci(8);
        
        //System.out.println(numeroFibonachi);
        
        EsPrimo.esPrimo(numeroFibonachi);
        
        
        
    }

}
