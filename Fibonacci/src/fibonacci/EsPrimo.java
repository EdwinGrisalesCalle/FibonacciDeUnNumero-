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
public class EsPrimo {
    
    
     public static boolean esPrimo(int numero) {

        if (numero == 1) {
            return false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
    
}
