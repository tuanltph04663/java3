/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author RZ09
 */
public class Test {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        for (Student student : studentDAO.getAll()) {
            System.out.println(student);
        }
    }
}
