package herencia;

public abstract class Arbol implements SerVivo{
    private TipoHoja hoja;
    private int altura;
    private boolean vivo;

    public Arbol(TipoHoja hoja, int altura) {
        this.hoja = hoja;
        this.altura = altura;
        this.vivo = true;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public void respirar() {
        System.out.println("respiro");
    }

    public void hacerFotosintesis(){
        System.out.println("hago la fotosintesis.");
    }

    public abstract String florecer();


}
