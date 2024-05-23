package org.duna.jep322.javatimeversion;

public class JavaTimeVersionDemo01 {
  public static void main(String[] args){

    //A new format is defined for java versions
    //$FEATURE.$INTERIM.$UPDATE.$PATCH
    Runtime.Version version = Runtime.version();
    System.out.printf(" feature: %s%n interim: %s%n update: %s%n patch: %s%n",
      version.feature(),
      version.interim(),
      version.update(),
      version.patch());
  }
}
