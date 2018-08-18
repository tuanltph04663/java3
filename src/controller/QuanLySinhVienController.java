package controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Student;

/**
 *
 * @author RZ09
 */
public class QuanLySinhVienController {
    
    public void fillToTable(List<Student> list, JTable tb){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        for (Student s : list) {
            Object[] row = new Object[] { 
                s.getStudentCode(), 
                s.getFullName(), 
                s.getEmail(), 
                s.getPhoneNumber(), 
                s.getGender(),
                s.getAddress(), 
                s.getImage()
            };
            model.addRow(row);
        }
    }
    
}
