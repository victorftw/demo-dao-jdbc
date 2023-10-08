package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Represents a utility class for working with a database.
 */

public class DataBase {

  private static Connection conn = null;

  /**
   * Gets a connection to the database using the properties from the "db.properties" file.
   *
   * @return A database connection.
   * @throws DbException If an error occurs while establishing the database connection.
   */

  public static Connection getConnection() {
    if (conn == null) {
      try {
        Properties props = loadProperties();
        String url = props.getProperty("dburl");
        conn = DriverManager.getConnection(url, props);
      } catch (SQLException e) {
        throw new DbException(e.getMessage());
      }
    }
    return conn;
  }

  /**
   * Closes the database connection if it is open.
   *
   * @throws DbException If an error occurs while closing the database connection.
   */

  public static void closeConnection() {
    if (conn != null) {
      try {
        conn.close();
      } catch (SQLException e) {
        throw new DbException(e.getMessage());
      }
    }
  }

  private static Properties loadProperties() {
    try (FileInputStream fs = new FileInputStream("db.properties")) {
      Properties props = new Properties();
      props.load(fs);
      return props;
    } catch (IOException e) {
      throw new DbException(e.getMessage());
    }
  }

  /**
   * Closes a SQL Statement if it is open.
   *
   * @param st The SQL Statement to be closed.
   * @throws DbException If an error occurs while closing the SQL Statement.
   */

  public static void closeStatement(Statement st) {
    if (st != null) {
      try {
        st.close();
      } catch (SQLException e) {
        throw new DbException(e.getMessage());
      }
    }
  }

  /**
   * Closes a ResultSet if it is open.
   *
   * @param rs The ResultSet to be closed.
   * @throws DbException If an error occurs while closing the ResultSet.
   */

  public static void closeResultSet(ResultSet rs) {
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        throw new DbException(e.getMessage());
      }
    }
  }
}
