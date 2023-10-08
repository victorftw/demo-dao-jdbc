package model.dao;

import db.DataBase;
import model.dao.impl.SellerDaoJdbc;

/**
 * A factory class for creating DAO instances.
 */

public class DaoFactory {

  public static SellerDao createSellerDao() {
    return new SellerDaoJdbc(DataBase.getConnection());
  }
}
