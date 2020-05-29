package com.codingbrains.gson;

import com.google.gson.Gson;
import java.nio.file.Files;
import java.nio.file.Paths;
import lombok.SneakyThrows;

/**
 * Reads JSON from file and parses it to a POJO
 */
public class jsonToPojo {

//SneakyThrows annotation will internally declare all checked exceptions.
  @SneakyThrows
  public static void main(String[] args) {
    //Read a Json from file and convert it to a string
    String strJson = new String(Files.readAllBytes(Paths.get("src/main/resources/json/Person.json")));
    //Create new GSON object
    Gson gson = new Gson();

    //Parse the JSON string to Person object
    Person person = gson.fromJson(strJson, Person.class);

    //Print required information from POJO
    System.out.println("Person Name is " + person.getName());
  }
}
