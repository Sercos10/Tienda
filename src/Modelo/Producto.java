package Modelo;

import java.util.Objects;

public class Producto {
    private String id;
    private String Description;
    private String talla;
    private Double price;

    public Producto() {
        this("","","",0.0);
    }

    public Producto(String id, String description, String talla, Double price) {
        this.id = id;
        this.Description = description;
        this.talla = talla;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id.equals(producto.id) && Description.equals(producto.Description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Description);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", Description='" + Description + '\'' +
                ", talla='" + talla + '\'' +
                ", price=" + price +
                '}';
    }
}
