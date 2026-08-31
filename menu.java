import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos met = new metodos();
        deportista[][] deportistas = null;
        int opcion;
        boolean salir = true;
        while (salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar deportistas");
            System.out.println("2. Mostrar todos los deportistas");
            System.out.println("3. Mostrar mejores 3 deportistas de todas las categorías");
            System.out.println("4. Mostrar los mejores 3 deportistas de una categoría específica");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    deportistas = met.registrarDeportistas();
                    break;
                case 2:
                    met.mostrarDeportistas(deportistas);
                    break;
                case 3:
                    met.mostrarMejoresGeneral(deportistas);
                    break;
                case 4:
                    met.mostrarMejoresPorCategoria(deportistas);
                    break;
                case 5:
                    salir = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        sc.close();
}
}
