package db;

/**
 * Custom exception class to represent database-related errors.
 */

public class DbException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public DbException(String msg) {
    super(msg);
  }
}
