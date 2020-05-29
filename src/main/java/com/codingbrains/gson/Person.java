package com.codingbrains.gson;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
private String name;
private String age;
private String place;
private String title;
private List<String> myHobbies;
}
