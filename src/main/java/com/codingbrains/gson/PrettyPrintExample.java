package com.codingbrains.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import lombok.SneakyThrows;

public class PrettyPrintExample {
  //SneakyThrows annotation will internally declare all checked exceptions.
  @SneakyThrows
  public static void main(String[] args) {
    List<String> cars= Arrays.asList("Fiat","BMW","Lamborghini");
    //Create new GSON object
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String prettyJson=gson.toJson(cars);
    System.out.println("pretty "+prettyJson);
  }
}
