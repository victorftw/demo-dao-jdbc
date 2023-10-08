package model.dao;

import java.util.List;
import model.entities.Department;

/**
 * An interface for Data Access Object (DAO) operations related to the Department entity.
 */

public interface DepartmentDao {
  void insert(Department obj);

  void update(Department obj);

  void deleteById(Integer id);

  Department findById(Integer id);

  List<Department> findAll();
}
