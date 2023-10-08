package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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

    Seller seller = sellerDao.findById(3);

    System.out.println(seller);

  }

}
