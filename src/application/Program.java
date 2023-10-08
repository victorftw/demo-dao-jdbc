package application;

import java.util.Date;
import model.entities.Department;
import model.entities.Seller;

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

    Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

    System.out.println(seller);

  }

}
