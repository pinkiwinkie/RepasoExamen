package examen22;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Lacteo lacteo = new Lacteo("leche", 1, 6, 2);
        Lacteo lacteo1 = new Lacteo("yogur", 4, 1.5f, 1 / 2);
        Lacteo lacteo2 = new Lacteo("queso", 5, 1f, 1);

        Carnico carnico = new Carnico("alitas", 2, 5f, Tipo.POLLO, 1.2f);
        Carnico carnico1 = new Carnico("entrcot", 3, 4f, Tipo.TERNERA, 7f);
        Carnico carnico2 = new Carnico("ternera", 7, 15f, Tipo.TERNERA, 18f);
        Carnico carnico3 = new Carnico("sanjacobo", 6, 8f, Tipo.CORDERO, 1f);

        MyList<Producto> productoMyList = new MyList<>();
        productoMyList.addHead(carnico);
        productoMyList.addHead(carnico1);
        productoMyList.addHead(carnico2);
        productoMyList.addHead(carnico3);

        productoMyList.addTail(lacteo);
        productoMyList.addTail(lacteo1);
        productoMyList.addTail(lacteo2);

        System.out.println(productoMyList);


    }
    public Map<Integer, String> convert(MyList<Producto> productoMyList){
        Map<Integer, String> resultsMap =

    }

}
