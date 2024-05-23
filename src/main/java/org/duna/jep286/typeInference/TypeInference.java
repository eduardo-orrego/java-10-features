package org.duna.jep286.typeInference;

import java.util.ArrayList;

public class TypeInference {
  public static void main(String[] args) {

    // Local variable type inference allows Java
    // to automatically infer the type of a local
    // variable, using the var keyword, instead of
    // you needing to declare it explicitly
    var nameString = "Juan";
    var ageInt = 25;

    System.out.println("Nombre: " + nameString);
    System.out.println("Edad: " + ageInt);

    var numberList = new ArrayList<Integer>();
    numberList.add(1);
    numberList.add(2);
    numberList.add(3);

    for (var number : numberList) {
      System.out.println("Number : " + number);
    }
  }
}
