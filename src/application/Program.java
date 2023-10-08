package application;

import model.entities.Department;

/**
 * This is a simple Java program that demonstrates the usage of the Department class.
 */

public class Program {

  /**
   * The main entry point of the program.
   *
   * @param args The command-line arguments (not used in this program).
   */

  public static void main(String[] args) {

    Department obj = new Department(1, "Books");
    System.out.println(obj);

  }

}
