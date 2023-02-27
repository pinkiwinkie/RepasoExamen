package examen22;

public class Lacteo extends Producto{
    private int capacity;

    public Lacteo(String name, int code, float precioPorKilo, int capacity) {
        super(name, code, precioPorKilo);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "\nLacteo{" +
                "capacity=" + capacity +
                "} " + super.toString();
    }
}
