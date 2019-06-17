package dao;

import java.sql.SQLException;

import entities.Carro;

public interface iCarroDao {
public void inserirCarro(Carro c) throws SQLException;
public void atualizarCarro(Carro c) throws SQLException;
public void removerCarro(Carro c) throws SQLException;
public Carro pesquisarCarroPorMarca(Carro c) throws SQLException;
public Carro pesquisarCarroPorNome(Carro c) throws SQLException;
public Carro pesquisarCarroPorModelo(Carro c) throws SQLException;
public Carro pesquisarCarroPorAno(Carro c) throws SQLException;
public Carro pesquisarCarroPorCor(Carro c) throws SQLException;
}
