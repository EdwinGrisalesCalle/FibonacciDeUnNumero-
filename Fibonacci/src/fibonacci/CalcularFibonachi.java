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
public class CalcularFibonachi {
    

    public static int fibonacci(int numero) {

        if (numero > 1) {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        } else if (numero == 1) {
            return 1;
        } else if (numero == 0) {
            return 0;
        } else {
            System.out.println("el numero debe ser mayor o igual a 1");
            return -1;
        }
    }
    
    
}
