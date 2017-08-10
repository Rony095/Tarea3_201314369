
package tarea.pkg3;

import java.util.Scanner;

class Palindromo {
 
    public static boolean Palindromo(String Palabra) {
        for (int i = 0; i < Palabra.length(); i++) {
            if (Palabra.charAt(i) != Palabra.charAt(Palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void Correr() {
        String Palabra;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Palabras Palíndromas");
        System.out.println("");
        System.out.println("Ingrese La Palabra: ");
        System.out.println("");
        Palabra = Teclado.next();
        System.out.println("");

        if (Palindromo(Palabra) == true) {
            System.out.printf("La Palabra  \"%s\" Es Un Palíndromo%n", Palabra);
        } else {
            System.out.printf("La Palabra \"%s\" No Es Un Palíndromo%n", Palabra);
        }
    }
}
