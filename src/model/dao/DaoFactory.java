package model.dao;

import model.dao.impl.SellerDaoJdbc;

/**
 * A factory class for creating DAO instances.
 */

public class DaoFactory {

  public static SellerDao createSellerDao() {
    return new SellerDaoJdbc();
  }
}
