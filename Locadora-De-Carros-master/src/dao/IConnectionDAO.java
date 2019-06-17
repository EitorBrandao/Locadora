package dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnectionDAO  {

	public Connection getConnection() throws ClassNotFoundException, SQLException;
}
