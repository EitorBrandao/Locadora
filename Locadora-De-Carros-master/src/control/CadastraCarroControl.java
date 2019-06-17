package control;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.CarroDao;
import dao.iCarroDao;
import entities.Carro;

public class CadastraCarroControl {

	public void inserirCarro(Carro c) throws SQLException, ClassNotFoundException {
		iCarroDao cDao = new CarroDao();
		cDao.inserirCarro(c);
	}
}
