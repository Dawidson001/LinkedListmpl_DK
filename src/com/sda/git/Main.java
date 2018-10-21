package com.sda.git;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        //////Array

        CustomList<String> customList = new CustomLinkedList<>();
        customList.addTail("1");
        customList.addTail("2");
        customList.addTail("3");
        customList.addTail("4");
        customList.addTail("5");
        customList.addTail("6");

        List<String>list = new LinkedList<>();

        list.add("Jan");
        list.add("Marcin");
        list.add("Karol");

        for (String l:list)
        {
            System.out.println(l);
        }





    }
}
