package model;

import java.sql.SQLException;
import java.util.List;

public class PointDAO extends DAO<Point>{

    @Override
    public List<Point> getAll() throws SQLException {
        return null;
    }

    @Override
    public Point findByName(List<Point> entities, String name) {
        return null;
    }

    @Override
    public Point findById(List<Point> entities, int id) {
        return null;
    }

}
