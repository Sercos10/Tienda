package Modelo;

import java.util.HashMap;
import java.util.Map;

public class Tienda {
    private HashMap<String, Producto> products;

    public Tienda(HashMap<String, Producto> products) {
        this.products = products;
    }

    public void AddPrd(Producto p){
        boolean metido=true;
        if (p!=null){
            for (Map.Entry<String, Producto> e : products.entrySet()) {
                if (p.getId().equals(e.getKey())){
                    //print.error;
                    metido=false;
                }
            }
        }
        if (metido)
        products.put(p.getId(),p);
    }

    public Producto ModPrd(String prdID){
        return null;
    }
}
