package examen22;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private String name;
    protected int code;
    private int precioPorKilo;

    public Producto(String name, int code, int precioPorKilo) {
        this.name = name;
        this.code = code;
        this.precioPorKilo = precioPorKilo;
    }

    public int getPrecioPorKilo() {
        return precioPorKilo;
    }

    public int getCode() {
        return code;
    }

    public void setPrecioPorKilo(int precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", precioPorKilo=" + precioPorKilo +
                '}';
    }

    @Override
    public int compareTo(Producto o) {
        return Integer.compare(this.getPrecioPorKilo(), o.getPrecioPorKilo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return precioPorKilo == producto.precioPorKilo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precioPorKilo);
    }
}
