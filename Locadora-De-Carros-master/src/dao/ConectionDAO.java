package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionDAO implements IConnectionDAO {

	private Connection con;

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:jtds:sqlserver://127.0.0.1:1433;DataBaseName=BancodedadosCarx;namedPipes=true", "root", "root@localhost");

		System.out.println("Conexão obtida com sucesso");
		return con;
	}

}
