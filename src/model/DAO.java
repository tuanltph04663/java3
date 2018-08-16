package model;

import java.sql.Connection;
import util.DBConn;

public abstract class DAO<E> {

    static final Connection CONN = DBConn.getconnection();

    abstract public void add(E e);
    
    abstract public void update(E e);
    
}
