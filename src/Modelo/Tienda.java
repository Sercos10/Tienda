package Modelo;

import Utils.pedir;

import java.util.HashMap;
import java.util.Map;

public class Tienda {
    private HashMap<String, Producto> products;

    public Tienda(HashMap<String, Producto> products) {
        this.products = products;
    }

    public void AddPrd(Producto p) {
        boolean metido = true;
        if (p != null) {
            for (Map.Entry<String, Producto> e : products.entrySet()) {
                if (p.getId().equals(e.getKey())) {
                    //print.error;
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
        p.setId(prdID);

        for (Map.Entry<String, Producto> e : products.entrySet()) {
            if (p.getId().equals(e.getKey())) {
                mod = true;
                p = (Producto) e;
                //print.menuMod;
                int opcion = pedir.leeEntero();
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
                    case 0: //print.salida;
                        break;
                    default://print.errorSwitch;
                        break;
                }
            }
        }

        if (!mod) {
            //print.noMod;
        }

        return p;
    }
}
