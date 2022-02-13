package Vista;

public class print {

    public static void MenuPrin(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("|            Pulse 1 para añadir un producto                  |");
        System.out.println("|           Pulse 2 para modificar un producto                |");
        System.out.println("|         Pulse 3 para ver la lista de productos              |");
        System.out.println("|             Pulse 0 para salir del programa                 |");
        System.out.println("---------------------------------------------------------------");
    }
    public static void menuMod(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("|  Pulse 1 para modificar la talla del producto               |");
        System.out.println("|  Pulse 2 para modificar el precio del producto              |");
        System.out.println("|  Pulse 3 para modificar la descripcion del producto         |");
        System.out.println("|  Pulse 0 para salir del menu                                |");
        System.out.println("---------------------------------------------------------------");
    }

    public static void salida(){
        System.out.println("                    Hasta la proxima                           ");
    }

    public static void error(){
        System.out.println("Error tu producto no ha podido ser añadido ya que existe un producto igual");
    }

    public static void errorSwitch(){
        System.out.println("Has introducido una opcion incorrecta, selecciona una correcta ");
    }

    public static void noMod(){
        System.out.println("        El producto que intenta modificar no existe            ");
    }

}
