package Modelo;

import Utils.pedir;
import Vista.print;

import java.util.HashMap;
import java.util.Map;

public class Tienda {
    private HashMap<String, Producto> products;

    public Tienda() {
        this.products = new HashMap<String, Producto>();
    }

    public void AddPrd(Producto p) {
        boolean metido = true;
        if (p != null) {
            for (Map.Entry<String, Producto> e : products.entrySet()) {
                if (p.getId().equals(e.getKey())) {
                    print.error();
                    metido = false;
                }
            }
        }
        if (metido)
            products.put(p.getId(), p);
    }

    public Producto ModPrd(String prdID) {
        Producto p = new Producto();
        boolean mod = false;
        boolean salir = false;
        p = products.get(prdID);
        if (p != null) {
            mod=true;
            print.menuMod();
            int opcion = pedir.leeEntero();
            do {
                switch (opcion) {
                    case 1:
                        String talla = pedir.leeRespuesta("Introduce la nueva talla");
                        p.setTalla(talla);
                        break;
                    case 2:
                        Double precio = pedir.leeDouble("Introduce el nuevo precio");
                        p.setPrice(precio);
                        break;
                    case 3:
                        String descripcion = pedir.leeRespuesta("Introduce la nueva descripcion del producto");
                        p.setDescription(descripcion);
                        break;
                    case 0:
                        print.salida();
                        salir = true;
                        break;
                    default:
                        print.errorSwitch();
                        break;
                }
                if (!salir) {
                    print.menuMod();
                    opcion = pedir.leeEntero();
                }
            } while (opcion != 0 || !salir);
        }
        if (!mod) {
            print.noMod();
        }
        return p;
    }

    public void seePrd() {
        for (Map.Entry<String, Producto> e : products.entrySet()) {
            System.out.println(e.getValue());
        }
    }
}
