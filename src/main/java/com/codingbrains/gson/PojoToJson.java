package com.codingbrains.gson;

import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;

/**
 * Creates an object and then converts it to a JSON.
 * Uses GSON library
 */
public class PojoToJson {

  public static void main(String[] args) {
    //Create a Person object
    Person person = initializePerson();
    //Create a GSON object
    Gson gson = new Gson();
    //Convert Object to JSON string
    String strVirat = gson.toJson(person);
    //Print the result
    System.out.println(strVirat);

  }

  private static Person initializePerson() {
    Person virat = new Person();
    virat.setName("Virat Kohli");
    virat.setAge("30");
    virat.setPlace("Bangalore");
    virat.setTitle("Mr");
    List<String> hobbies = Arrays.asList("cricket", "Running", "travelling", "Sledging");
    virat.setMyHobbies(hobbies);
    return virat;

  }
}
