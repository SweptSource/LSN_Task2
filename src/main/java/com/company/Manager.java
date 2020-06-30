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

            final Integer[] elements = new Integer[14];

            stream
                    .map(s -> Arrays.asList(s.split(" ")))
                    .flatMap(Collection::stream)
                    .map(Integer::valueOf)
                    .filter(i -> i <= 13)
                    .sorted(Comparator.reverseOrder())
                    .peek(i -> elements[i] = i)
                    .sorted()
                    .forEach(
                            i -> {
                                if (elements[13 - i] != null) {
                                    System.out.println(i + " " + elements[13 - i]);
                                    elements[i] = null;
                                }
                            }
                    );

        } catch (IOException ioException) {
            ioException.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
