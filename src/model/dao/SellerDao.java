package model.dao;

import java.util.List;
import model.entities.Department;
import model.entities.Seller;

/**
 * An interface for Data Access Object (DAO) operations related to the Seller entity.
 */

public interface SellerDao {
  void insert(Seller obj);

  void update(Seller obj);

  void deleteById(Integer id);

  Seller findById(Integer id);

  List<Seller> findAll();

  List<Seller> findByDepartment(Department department);
}
