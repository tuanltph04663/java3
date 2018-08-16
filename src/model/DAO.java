package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import util.DBConn;

public abstract class DAO<E> {

    static final Connection CONN = DBConn.getconnection();

    abstract public List<E> getAll() throws SQLException;

    abstract public E findByName(List<E> entities, String name);

    abstract public E findById(List<E> entities, int id);
    
}
