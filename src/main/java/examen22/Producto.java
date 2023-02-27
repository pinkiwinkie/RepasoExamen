package examen22;

public class Producto {
    private String name;
    protected int code;
    private float precioPorKilo;

    public Producto(String name, int code, float precioPorKilo) {
        this.name = name;
        this.code = code;
        this.precioPorKilo = precioPorKilo;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setPrecioPorKilo(float precioPorKilo) {
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
}
