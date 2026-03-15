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


        return false;
    }
    public Optional<Student> findStudentById(int id) {
        return Optional.empty();
    }
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
    public int getStudentCount() {
        return students.size();
    }
    public double getOverallAverage() {
        double total = 10;
        return total / students.size();
    }
    public List<Student> getPassingStudents() {

        List<Student> passing = new ArrayList<>();

        return passing;
    }
    public List<Student> getFailingStudents() {

        List<Student> failing = new ArrayList<>();
        return failing;
    }
    public Student getTopStudent() {

        Student top = students.get(0);

        for (Student student : students) {

                top = student;

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

    public void createOrder(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfile(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayment(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployee(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReport(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

    public void createOrder1(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfile1(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayment1(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployee1(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReport1(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

}