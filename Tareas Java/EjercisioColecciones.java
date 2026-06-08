import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercisioColecciones {

    //1.FUNCION AGREGAR FRUTA
    public static String ingresarFruta(List<String> productos, Scanner sc){
        System.out.println("Ingrese fruta que desea agregar");
        String fruta = sc.nextLine();
        productos.add(fruta);
        return fruta;
    }

    //2.-FUNCION LISTAR COLECCION
    public static List<String> obtenerLista(List<String> productos){
        return productos;
    }

    //3.-FUNCION MOSTRAR CANTIDAD DE ELEMENTOS
    public static int obtenerCantidad(List<String> productos){
        return productos.size();
    }

    //4.-FUNCION REEMPLAZAR FRUTA
    public static String reemplazarFruta(List<String>productos, int indice, String reemplazar){
        return productos.set(indice , reemplazar );
    }

    //5.-FUNCION ELIMINAR
    public static boolean eliminarFruta(List<String>productos, String producto){
        return productos.remove(producto);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> productos = new ArrayList<>();

        int opcion = 0;
        while (opcion != 6){
            System.out.println(
                    "1.-Agregar fruta\n"+
                    "2.-Mostrar frutas agregadas\n"+
                    "3.-Mostrar cantidad\n"+
                    "4.-Reemplazar fruta\n"+
                    "5.-Eliminar fruta\n"+
                    "6.-Salir");
                    opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    sc.nextLine();
                    ingresarFruta(productos,sc);
                    System.out.println("aqui" + productos);
                    break;

                case 2:
                    System.out.println("2.- " + obtenerLista(productos));
                    break;

                case 3:
                    System.out.println("3.-" + obtenerCantidad(productos));
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Ingrese fruta que desea reemplazar");
                    System.out.println("Lista: " + productos);
                    int indice = productos.indexOf(sc.nextLine());

                    if (indice == -1){
                        System.out.println("Fruta no encontrada");
                    }else {
                        sc.nextLine();
                        System.out.println("Ingrese fruta que desea Agregar");
                        String reemplazar = sc.nextLine();

                        reemplazarFruta(productos,indice,reemplazar);
                        System.out.println("aqui" + productos);
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.println("Ingrese fruta que desea eliminar");
                    String eliminar = sc.nextLine();

                    eliminarFruta(productos, eliminar);
                    System.out.println(productos);
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}