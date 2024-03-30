package com.kishore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumbers {

    public static void main(String[] args) {


        List<Integer> bigList = List.of(1, 2, 3, 4, 5);
        List<Integer> smallList = List.of(1, 2, 5);

        List<Integer> missing = bigList.stream()
                .filter(i -> !smallList.contains(i))
                .toList();

        missing.forEach(System.out::println);
    }


}
