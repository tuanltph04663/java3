package model;

public class Point {

    private String studentCode;
    private String fullName;
    private double english;
    private double math;
    private double informatics;
    private double physicalEducation;

    public Point() {
    }

    public Point(String studentCode, String fullName, double english, double math, double informatics, double physicalEducation) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.english = english;
        this.math = math;
        this.informatics = informatics;
        this.physicalEducation = physicalEducation;
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

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getInformatics() {
        return informatics;
    }

    public void setInformatics(double informatics) {
        this.informatics = informatics;
    }

    public double getPhysicalEducation() {
        return physicalEducation;
    }

    public void setPhysicalEducation(double physicalEducation) {
        this.physicalEducation = physicalEducation;
    }

    public double getAverage() {
//        int e = 0;
//        int m = 0;
//        int i = 0;
//        int p = 0;
//        try {
//            e = Integer.parseInt(this.english);
//            m = Integer.parseInt(this.math);
//            i = Integer.parseInt(this.informatics);
//            p = Integer.parseInt(this.physicalEducation);
//        } catch (NumberFormatException ex) {
//            System.out.println(ex);
//        }
//        
//        double average = (e + m + i + p) / 4;
//        
//        return average;
        return 0;
    }

//    public static void main(String[] args) {
//        Point p = new Point("6", "7", "4", "8");
//        System.out.println(p.getAverage());
//    }
}
