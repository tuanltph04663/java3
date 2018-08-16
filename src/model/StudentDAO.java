package model;

import java.sql.SQLException;
import java.util.List;

public class StudentDAO extends DAO<Student> {

    @Override
    public List<Student> getAll() throws SQLException {
        return null;
    }

    @Override
    public Student findByName(List<Student> entities, String name) {
        return null;
    }

    @Override
    public Student findById(List<Student> entities, int id) {
        return null;
    }

}
