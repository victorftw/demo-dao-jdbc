package application;

import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
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

    SellerDao sellerDao = DaoFactory.createSellerDao();

    System.out.println("===== TEST 1: seller findById =====");
    Seller seller = sellerDao.findById(3);
    System.out.println(seller);

    System.out.println("\n===== TEST 2: seller findByDepartment =====");
    Department department = new Department(2, null);
    List<Seller> list = sellerDao.findByDepartment(department);
    for (Seller obj : list) {
      System.out.println(obj);
    }

  }

}
