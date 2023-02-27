package examen22;

public class Carnico extends Producto{
    private Tipo carne;
    private float weight;

    public Carnico(String name, int code, int precioPorKilo, Tipo carne, float weight) {
        super(name, code, precioPorKilo);
        this.carne = carne;
        this.weight = weight;
    }

    public Tipo getCarne() {
        return carne;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\nCarnico{" +
                "carne=" + carne +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
