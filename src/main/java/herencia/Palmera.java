package herencia;

public class Palmera extends Arbol{

    private String name;
    private boolean podado;
    public Palmera(TipoHoja hoja, int altura, String name) {
        super(hoja, altura);
        this.name = name;
        this.podado = false;
    }

    public void siEsPodado(){
        this.podado = true;
    }

    @Override
    public String florecer() {
        return "He florecido";
    }

    @Override
    public void morir() {
        this.setVivo(false);
    }
}
