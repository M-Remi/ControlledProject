package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentManager {

    private final List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        validateStudent(student);
        students.add(student);
    }

    public boolean removeStudent(int id) {
        Optional<Student> student = findStudentById(id);

        if (student.isPresent()) {
            students.remove(student.get());
            return true;
        }

        return false;
    }

    public Optional<Student> findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return Optional.of(student);
            }
        }

        return Optional.empty();
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public int getStudentCount() {
        return students.size();
    }

    public double getOverallAverage() {
        if (students.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getAverageGrade();
        }

        return total / students.size();
    }

    public List<Student> getPassingStudents() {

        List<Student> passing = new ArrayList<>();

        for (Student student : students) {
            if (student.hasPassed()) {
                passing.add(student);
            }
        }

        return passing;
    }

    public List<Student> getFailingStudents() {

        List<Student> failing = new ArrayList<>();

        for (Student student : students) {
            if (!student.hasPassed()) {
                failing.add(student);
            }
        }

        return failing;
    }

    public Student getTopStudent() {

        if (students.isEmpty()) {
            return null;
        }

        Student top = students.get(0);

        for (Student student : students) {
            if (student.getAverageGrade() > top.getAverageGrade()) {
                top = student;
            }
        }

        return top;
    }

    public Student getLowestStudent() {

        if (students.isEmpty()) {
            return null;
        }

        Student lowest = students.get(0);

        for (Student student : students) {
            if (student.getAverageGrade() < lowest.getAverageGrade()) {
                lowest = student;
            }
        }

        return lowest;
    }

    public void printReport() {

        System.out.println("---- Student Report ----");

        for (Student student : students) {

            System.out.println(student.getName());

        }


    }

    public void generateSampleData() {

        Student s1 = new Student(1, "Alice");
        s1.addGrades(List.of(80, 75, 90));

        Student s2 = new Student(2, "Bob");
        s2.addGrades(List.of(60, 58, 65));

        Student s3 = new Student(3, "Charlie");
        s3.addGrades(List.of(40, 42, 38));

        Student s4 = new Student(4, "Diana");
        s4.addGrades(List.of(72, 70, 68));

        addStudent(s1);
        addStudent(s2);
        addStudent(s3);
        addStudent(s4);
    }

    private void validateStudent(Student student) {

    }

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.generateSampleData();

        manager.printReport();

        Student top = manager.getTopStudent();

        if (top != null) {
            System.out.println("Top Student: " + top.getName());
        }

        Student lowest = manager.getLowestStudent();

        if (lowest != null) {
            System.out.println("Lowest Student: " + lowest.getName());
        }

        System.out.println("Passing Students: " + manager.getPassingStudents().size());
        System.out.println("Failing Students: " + manager.getFailingStudents().size());
    }
}