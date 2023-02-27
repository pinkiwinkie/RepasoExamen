package examen22;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Lacteo lacteo = new Lacteo("leche", 1, 6, 2);
        Lacteo lacteo1 = new Lacteo("yogur", 4, 15, 1 / 2);
        Lacteo lacteo2 = new Lacteo("queso", 5, 1, 1);

        Carnico carnico = new Carnico("alitas", 2, 5, Tipo.POLLO, 1.2f);
        Carnico carnico1 = new Carnico("entrcot", 3, 4, Tipo.TERNERA, 7f);
        Carnico carnico2 = new Carnico("ternera", 7, 15, Tipo.TERNERA, 18f);
        Carnico carnico3 = new Carnico("sanjacobo", 6, 8, Tipo.CORDERO, 1f);

        MyList<Producto> productoMyList = new MyList<>();
        productoMyList.addHead(carnico);
        productoMyList.addHead(carnico1);
        productoMyList.addHead(carnico2);
        productoMyList.addHead(carnico3);

        productoMyList.addTail(lacteo);
        productoMyList.addTail(lacteo1);
        productoMyList.addTail(lacteo2);

        Map<Integer, Producto> listaFinal = new LinkedHashMap<>();
        listaFinal = convert(productoMyList);
        System.out.println(listaFinal);


    }

    public static Map<Integer, Producto> convert(MyList<Producto> productoMyList){
//        List<Producto> list = new ArrayList<>();
        Map<Integer, Producto> resultsMap = new LinkedHashMap<>();
//        list.stream().collect(Collectors.toMap(Producto::getCode,Producto::getName));
        for (int i = 0; i < productoMyList.size(); i++) {
            resultsMap.put(productoMyList.get(i).getCode(), productoMyList.get(i));
        }
        return resultsMap;
    }
}
