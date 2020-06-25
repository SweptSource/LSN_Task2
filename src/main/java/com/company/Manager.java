package com.company;

import javafx.util.Pair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Manager {

    public static void processData(String inputPath) {
        try {
            Stream<String> stream = Files.lines(Paths.get(inputPath));

            stream
                    .map(s -> Arrays.asList(s.split("(?<!\\G\\w+)\\s")))
                    .flatMap(Collection::stream)
                    .map(s -> {
                        return new Pair<Integer, Integer>(Integer.parseInt(s.split(" ")[0]), Integer.parseInt(s.split(" ")[1]));
                    })
                    .filter(pair -> pair.getKey() + pair.getValue() == 13)
                    .map(pair -> {
                        if (pair.getKey() > pair.getValue()) {
                            return pair = new Pair<Integer, Integer>(pair.getValue(), pair.getKey());
                        } else return pair;
                    })
                    .sorted((p1, p2) -> p1.getKey().compareTo(p2.getKey()))
                    .forEach(pair -> System.out.println(pair.getKey() + " " + pair.getValue()));

            } catch (IOException ioException) {
                ioException.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();
        }
    }
}
