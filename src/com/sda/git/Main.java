package com.sda.git;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        //////Array

        CustomList<String> customList = new CustomLinkedList<>();
        customList.add("1");
        customList.add("2");
        customList.add("3");
        customList.add("4");

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
