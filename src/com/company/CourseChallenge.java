package com.company;

class Course{
    static int maxCapacity = 100;
    String courseName;
    String enrolledStudents[];
    String studentName;
    boolean isEnrolled;
    int enrollments;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    public static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }
    public void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }
    public void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }
}
public class CourseChallenge {
    static void main(String[] args) {
        Course.setMaxCapacity(2);
        Course cr = new Course("Isha","Java");
        Course cr1 = new Course("Dev","Java");
        cr.enrollStudent("Isha");
        cr1.enrollStudent("Dev");
        System.out.println(cr.enrolledStudents);
    }
}
