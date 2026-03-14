package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentStatistics {

    private final StudentManager manager;

    public StudentStatistics(StudentManager manager) {
        if (manager == null) {
            throw new IllegalArgumentException("Manager cannot be null");
        }
        this.manager = manager;
    }

    public double calculateOverallAverage() {
        List<Student> students = manager.getAllStudents();

        if (students.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getAverageGrade();
        }

        return total / students.size();
    }

    public int countPassingStudents() {

        int count = 0;

        for (Student student : manager.getAllStudents()) {
            if (student.hasPassed()) {
                count++;
            }
        }

        return count;
    }

    public int countFailingStudents() {

        int count = 0;

        for (Student student : manager.getAllStudents()) {
            if (!student.hasPassed()) {
                count++;
            }
        }

        return count;
    }

    public Student findTopStudent() {

        List<Student> students = manager.getAllStudents();

        if (students.isEmpty()) {
            return null;
        }

        Student best = students.get(0);

        for (Student student : students) {
            if (student.getAverageGrade() > best.getAverageGrade()) {
                best = student;
            }
        }

        return best;
    }

    public Student findLowestStudent() {

        List<Student> students = manager.getAllStudents();

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

    public List<Student> getStudentsSortedByAverage() {

        List<Student> students = new ArrayList<>(manager.getAllStudents());

        students.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());

        return students;
    }

    public List<Student> getStudentsSortedByName() {

        List<Student> students = new ArrayList<>(manager.getAllStudents());

        students.sort(Comparator.comparing(Student::getName));

        return students;
    }

    public double calculateMedianAverage() {

        List<Student> sorted = getStudentsSortedByAverage();

        if (sorted.isEmpty()) {
            return 0;
        }

        int middle = sorted.size() / 2;

        if (sorted.size() % 2 == 0) {
            double a = sorted.get(middle - 1).getAverageGrade();
            double b = sorted.get(middle).getAverageGrade();
            return (a + b) / 2;
        }

        return sorted.get(middle).getAverageGrade();
    }

    public double calculateHighestAverage() {

        Student top = findTopStudent();

        if (top == null) {
            return 0;
        }

        return top.getAverageGrade();
    }

    public double calculateLowestAverage() {

        Student lowest = findLowestStudent();

        if (lowest == null) {
            return 0;
        }

        return lowest.getAverageGrade();
    }

    public List<Student> getFirstClassStudents() {

        List<Student> result = new ArrayList<>();

        for (Student student : manager.getAllStudents()) {
            if (student.getGradeCategory().equals("First")) {
                result.add(student);
            }
        }

        return result;
    }

    public List<Student> getUpperSecondStudents() {

        List<Student> result = new ArrayList<>();

        for (Student student : manager.getAllStudents()) {
            if (student.getGradeCategory().equals("Upper Second")) {
                result.add(student);
            }
        }

        return result;
    }

    public List<Student> getLowerSecondStudents() {

        List<Student> result = new ArrayList<>();

        for (Student student : manager.getAllStudents()) {
            if (student.getGradeCategory().equals("Lower Second")) {
                result.add(student);
            }
        }

        return result;
    }

    public List<Student> getThirdClassStudents() {

        List<Student> result = new ArrayList<>();

        for (Student student : manager.getAllStudents()) {
            if (student.getGradeCategory().equals("Third")) {
                result.add(student);
            }
        }

        return result;
    }

    public List<Student> getFailedStudents() {

        List<Student> result = new ArrayList<>();

        for (Student student : manager.getAllStudents()) {
            if (student.getGradeCategory().equals("Fail")) {
                result.add(student);
            }
        }

        return result;
    }

    public void printSummaryReport() {

        System.out.println("------ Statistics Report ------");

        System.out.println("Total students: " + manager.getStudentCount());
        System.out.println("Overall average: " + calculateOverallAverage());
        System.out.println("Median average: " + calculateMedianAverage());

        System.out.println("Passing students: " + countPassingStudents());
        System.out.println("Failing students: " + countFailingStudents());

        Student top = findTopStudent();
        Student lowest = findLowestStudent();

        if (top != null) {
            System.out.println("Top student: " + top.getName() + " (" + top.getAverageGrade() + ")");
        }

        if (lowest != null) {
            System.out.println("Lowest student: " + lowest.getName() + " (" + lowest.getAverageGrade() + ")");
        }

        System.out.println("First class students: " + getFirstClassStudents().size());
        System.out.println("Upper second students: " + getUpperSecondStudents().size());
        System.out.println("Lower second students: " + getLowerSecondStudents().size());
        System.out.println("Third class students: " + getThirdClassStudents().size());
        System.out.println("Failed students: " + getFailedStudents().size());

        System.out.println("-------------------------------");
    }

    public void printRankingTable() {

        System.out.println("------ Student Ranking ------");

        List<Student> ranking = getStudentsSortedByAverage();

        int position = 1;

        for (Student student : ranking) {

            System.out.println(
                    position +
                            ". " +
                            student.getName() +
                            " - Avg: " +
                            student.getAverageGrade() +
                            " - " +
                            student.getGradeCategory()
            );

            position++;
        }

        System.out.println("-----------------------------");
    }

}