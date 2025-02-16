package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    private static final String[] ELEMENTS = {
            "GKFFD", "TNANA", "MPMSL", "PSWME", "LZMLF",
            "JYEBV", "YELNT", "JSNKR", "JFESF", "TMJLL"
    };

    public static List<String> createArrayList() {
        List<String> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, ELEMENTS);

        return arrayList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println(customList.get(i) + " " + i);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        // Siempre devuelve true porque permite duplicados
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> arrayList = createArrayList();

        String element = "AAAAA";
        addElementToList(arrayList, element);

        printElementsAndIndex(arrayList);
    }

}
