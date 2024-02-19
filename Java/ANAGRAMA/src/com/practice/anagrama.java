package com.practice;

import java.util.Arrays;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class anagrama {

    public static void  main(String[] args)
    {
        System.out.println(AnagramDetector("roma", "amor"));
    }

    static boolean AnagramDetector(String valor1, String valor2){
        if (valor1.toLowerCase().equals(valor2.toLowerCase())){
            System.out.println("No se permiten las mismas palabras");
            return false;
        }
        char[] valor1array = valor1.toLowerCase().toCharArray();
        char[] valor2array = valor2.toLowerCase().toCharArray();
        Arrays.sort(valor1array);
        Arrays.sort(valor2array);
        return Arrays.equals(valor1array, valor2array);
    }
}
