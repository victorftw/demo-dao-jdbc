package model.dao.impl;

import db.DataBase;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 * An implementation of the SellerDao interface that interacts with a JDBC data source.
 */

public class SellerDaoJdbc implements SellerDao {

  private Connection conn;

  public SellerDaoJdbc(Connection conn) {
    this.conn = conn;
  }

  @Override
  public void insert(Seller obj) {
    // TODO Auto-generated method stub

  }

  @Override
  public void update(Seller obj) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteById(Integer id) {
    // TODO Auto-generated method stub

  }

  @Override
  public Seller findById(Integer id) {
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      st = conn.prepareStatement(
          "SELECT seller.*, department.Name as DepName " + "FROM seller INNER JOIN department "
              + "ON seller.DepartmentId = department.Id " + "WHERE seller.Id = ?");
      st.setInt(1, id);
      rs = st.executeQuery();
      if (rs.next()) {
        Department dep = new Department();
        dep.setId(rs.getInt("DepartmentId"));
        dep.setName(rs.getString("DepName"));
        Seller obj = new Seller();
        obj.setId(rs.getInt("Id"));
        obj.setName(rs.getString("Name"));
        obj.setEmail(rs.getString("Email"));
        obj.setBaseSalary(rs.getDouble("BaseSalary"));
        obj.setBirthDate(rs.getDate("BirthDate"));
        obj.setDepartment(dep);
        return obj;
      }
      return null;
    } catch (SQLException e) {
      throw new DbException(e.getMessage());
    } finally {
      DataBase.closeStatement(st);
      DataBase.closeResultSet(rs);
    }

  }

  @Override
  public List<Seller> findAll() {
    // TODO Auto-generated method stub
    return null;
  }
}