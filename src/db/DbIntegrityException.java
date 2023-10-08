package db;

/**
 * Custom exception class to represent database integrity-related errors.
 */

public class DbIntegrityException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public DbIntegrityException(String msg) {
    super(msg);
  }
}
