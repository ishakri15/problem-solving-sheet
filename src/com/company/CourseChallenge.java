package com.company;

class Course{
    static int maxCapacity = 100;
    String courseName;
    String[] enrolledStudents;
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
        Course java = new Course("Java");
        Course spring = new Course("Spring");
        java.enrollStudent("Isha");
        spring.enrollStudent("Dev");
        java.enrollStudent("Ravina");
        java.unenrollStudent("Ravina");
    }
}
