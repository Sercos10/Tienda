package Controlador;

import Modelo.Producto;
import Modelo.Tienda;
import Utils.pedir;
import Vista.print;

public class controlador {
    public static void Menu(){
        Tienda tienda=new Tienda();
        boolean salir=false;
        print.MenuPrin();
        int opcion= pedir.leeEntero();
        do {
            switch (opcion){
                case 1: String id=pedir.leeRespuesta("Introduce el identificador de tu prodicto");
                        String descipcion= pedir.leeRespuesta("Introduce la descripcion de tu producto");
                        String talla= pedir.leeRespuesta("Introduce la talla de tu producto");
                        Double precio= pedir.leeDouble("Introduce el precio de tu producto");
                        Producto nuevo= new Producto(id,descipcion,talla,precio);
                        tienda.AddPrd(nuevo);
                        break;
                case 2: id=pedir.leeRespuesta("Introduce el identificador de tu producto");
                    System.out.println(tienda.ModPrd(id));
                        break;
                case 3: tienda.seePrd();
                        break;
                case 0: print.salida();
                        salir=true;
                        break;
                default:print.errorSwitch();
                        break;
            }
            if (!salir){
                print.MenuPrin();
                opcion= pedir.leeEntero();
            }
        }while(opcion!=0||!salir);
    }
}
