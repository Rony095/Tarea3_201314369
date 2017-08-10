package tarea.pkg3;

import java.util.Scanner;

public class Menu {
    
static String[] lista = new String[5];
    Scanner a;
    int hola;

    public Menu() {
        hola = 0;
        a = new Scanner(System.in);
        menuprincipal();
    }

    public void menuprincipal() {
        do {
            System.out.println("201314369");
            System.out.println("");
            System.out.println("1. Usuarios");
            System.out.println("2. Palabras Palíndromas");
            System.out.println("3. Salir");
            System.out.println("");
            System.out.println("Introduzca Una Opcion:");
            System.out.println("");
            hola = a.nextInt();
            switch (hola) {
                case 1:
//                Menu Usuarios
                   menuser p = new menuser();
                   p.user();
                    break;
               case 2:
                //Palabras Palindromas
                
                System.out.println("");
                Palindromo pal = new Palindromo();
                pal.Correr();
                    
                break;
            }
        } while (hola < 1 || hola > 3);
    }


}
