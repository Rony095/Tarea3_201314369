package tarea.pkg3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

class menuser {

    int b;
    String selusers;
    private static String[] lista = new String[5];
    private Scanner SS = new Scanner(System.in);

    public void user() {

        do {
            System.out.println("Menú De Usuarios");
            System.out.println("");
            System.out.println("1. Ingresar Usuarios");
            System.out.println("2. Mostrar Todos Los Usuarios");
            System.out.println("3. Mostrar Un Usuario Personalizado");
            System.out.println("4. Menú Principal");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Introduzca Una Opcion:");
            System.out.println("");
            b = SS.nextInt();
        } while (b < 1 || b > 5);

        switch (b) {
            case 1:
                //Ingresar Usuario

                ingresarusuario();
                menuser p = new menuser();
                p.user();
                break;

            case 2:
                //Todos los usuarios
                System.out.println("Mostrar Todos Los Usuarios");
                mostrarusuarios();
                System.out.println("");
                System.out.println("");

                break;

            case 3:
                //Usuario Personalizado
                buscar();
                break;

            case 4:
                //Volver Al Menu
                Menu ab = new Menu();
                break;

        }
    }

    public void ingresarusuario() {

        Scanner Users = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++) {
            System.out.println("");
            System.out.println("Ingresar Usuario:");
            System.out.println("");
            selusers = Users.nextLine();
            lista[i] = selusers;
        }

    }

    public void mostrarusuarios() {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);

        }
    }

    public void buscar() {
        System.out.println("Ingrese El Nombre Del Usuario");
        System.out.println("");
        selusers = SS.next();
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(selusers)) {
                System.out.println("");
                System.out.println("Usuario");
                System.out.println("");
                System.out.println(lista[i]);
                break;
            } else {
                System.out.println("ERROR! No Existe Ningun Usuario Con Esa Coincidencia");
                break;
            }

        }
    }

}
