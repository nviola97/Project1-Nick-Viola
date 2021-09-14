package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        var product = new ArrayList<String>();
        var price = new ArrayList<Float>();
        var numAvailable = new ArrayList<Integer>();
        var fileName = "Product List";
        var filePath = Paths.get(fileName);
        var allLines = Files.readAllLines(filePath);
    }
}
