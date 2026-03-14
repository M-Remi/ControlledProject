package org.example;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private final int id;
    private String name;
    private final List<Integer> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void addGrade(int grade) {
        validateGrade(grade);
        grades.add(grade);
    }
    public void addGrades(List<Integer> newGrades) {

    }
    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }
    public int getHighestGrade() {
        int max=0;
        return max;
    }
    public int getLowestGrade() {


        int min = grades.get(0);


        return min;
    }
    public boolean hasPassed() {
        return getAverageGrade() >= 50;
    }
    public String getGradeCategory() {

        return "Fail or Pass";
    }
    private void validateGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
    }
    @Override
    public String toString() {
        return "";

    }

    //10 Long parameter
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
