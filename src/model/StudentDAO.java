package model;

import java.util.List;

public class StudentDAO extends DAO<Student> {

    private static final String INSERT_INTO = "";
    private static final String UPDATE_INTO = "";
    private static final String SELECT_ALL = "";
    private static final String SELECT_WHERE = "";

    @Override
    public void add(Student e) {
        // TODO add Student handle
    }

    @Override
    public void update(Student e) {
        // TODO update Student handle
    }

    public List<Student> getAllStudents() {
        // TODO get all student handle
        return null;
    }

    public Student findByCode(String code) {
        // TODO find Student by code
        return null;
    }

}
