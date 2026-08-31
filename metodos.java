import java.util.Scanner;
public class metodos {
    Scanner sc = new Scanner(System.in);
    public deportista[][] registrarDeportistas() {
         System.out.println("Ingrese el número de categorías: ");
        int numCate = sc.nextInt();
        System.out.println("Ingrese el número de deportistas por categoría: ");
        int numDeportistas = sc.nextInt();
        sc.nextLine();
        deportista[][] deportistasRegistrados = new deportista[numCate][numDeportistas];
        for (int i = 0; i < numCate; i++) {
            System.out.println("Ingrese el nombre de la categoría " + (i + 1) + ":");
            String categoria = sc.nextLine();
            for (int j = 0; j < numDeportistas; j++) {
                System.out.println("Ingrese el nombre del deportista " + (j + 1) + ":");
                String nombre = sc.nextLine();
                System.out.println("Ingrese la edad del deportista " + (j + 1) + ":");
                int edad = sc.nextInt();
                sc.nextLine(); 
                System.out.println("Ingrese en qué puesto quedó el deportista " + (j + 1) + ":");
                int resultado = sc.nextInt();
                sc.nextLine();
                deportistasRegistrados[i][j] = new deportista(nombre, edad, categoria, resultado);
                
            }
        }
        return deportistasRegistrados;
    }
    public void mostrarDeportistas(deportista[][] deportistasRegistrados) { 
            if(deportistasRegistrados != null) {
                for (int i = 0; i < deportistasRegistrados.length; i++) {
                System.out.println("Categoría: " + deportistasRegistrados[i][0].getCategoria());
                for (int j = 0; j < deportistasRegistrados.length; j++) {
                    System.out.println("Nombre: " + deportistasRegistrados[i][j].getNombre());
                    System.out.println("Edad: " + deportistasRegistrados[i][j].getEdad());
                    System.out.println("Resultado: " + deportistasRegistrados[i][j].getResultado());
                    System.out.println("---------------------------");
                }
            }
            }
            else {
                System.out.println("No hay deportistas registrados.");
            }
        }
    public void mostrarMejoresGeneral(deportista [][] deportistasRegistrados) {
        if(deportistasRegistrados != null) {
            System.out.println("Mejores 3 deportistas de todas las categorías:");
        for (int i = 0; i < deportistasRegistrados.length; i++) {
            deportista primero = null;
            deportista segundo = null;
            deportista tercero = null;
            System.out.println("Categoría: " + deportistasRegistrados[i][0].getCategoria());
            for (int j = 0; j < deportistasRegistrados[i].length; j++) {
                if (deportistasRegistrados[i][j].getResultado() <= 3) {
                    int puesto = deportistasRegistrados[i][j].getResultado();
                    if(puesto == 1) {
                        primero = deportistasRegistrados[i][j];
                    } else if (puesto == 2) {
                        segundo = deportistasRegistrados[i][j];
                    } else if (puesto == 3) {
                        tercero = deportistasRegistrados[i][j];
                    }
                }
            }
            System.out.println("Primer lugar: " + primero.getNombre());
            System.out.println("Segundo lugar: " + segundo.getNombre());
            System.out.println("Tercer lugar: " + tercero.getNombre());
        }
        }
        else {
            System.out.println("No hay deportistas registrados.");
        }
    }
    public void mostrarMejoresPorCategoria(deportista [][] deportistasRegistrados) {
        System.out.println("Ingrese la categoría que desea consultar: ");
        String categoriaConsulta = sc.nextLine();
        if(deportistasRegistrados != null) {
            boolean categoriaEncontrada = false;
            for (int i = 0; i < deportistasRegistrados.length; i++) {
                if (deportistasRegistrados[i][0].getCategoria().equalsIgnoreCase(categoriaConsulta)) {
                    categoriaEncontrada = true;
                    deportista primero = null;
                    deportista segundo = null;
                    deportista tercero = null;
                    System.out.println("Categoría: " + deportistasRegistrados[i][0].getCategoria());
                    for (int j = 0; j < deportistasRegistrados[i].length; j++) {
                        if (deportistasRegistrados[i][j].getResultado() <= 3) {
                            int puesto = deportistasRegistrados[i][j].getResultado();
                            if(puesto == 1) {
                                primero = deportistasRegistrados[i][j];
                            } else if (puesto == 2) {
                                segundo = deportistasRegistrados[i][j];
                            } else if (puesto == 3) {
                                tercero = deportistasRegistrados[i][j];
                            }
                        }
                    }
                    System.out.println("Primer lugar: " + primero.getNombre());
                    System.out.println("Segundo lugar: " + segundo.getNombre());
                    System.out.println("Tercer lugar: " + tercero.getNombre());
                }
            }
            if (!categoriaEncontrada) {
                System.out.println("No se encontró la categoría especificada.");
            }
        } else {
            System.out.println("No hay deportistas registrados.");
        }
    }
}
