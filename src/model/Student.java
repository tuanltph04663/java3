package model;

public class Student {

    private String studentCode;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String gender;
    private String address;
    private Point point;

    public Student() {
    }

    public Student(String studentCode, String fullName, String email, String phoneNumber, String gender, String address, Point point) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
        this.point = point;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" + "studentCode=" + studentCode + ", fullName=" + fullName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", address=" + address + ", point=" + point + '}';
    }
    
}
