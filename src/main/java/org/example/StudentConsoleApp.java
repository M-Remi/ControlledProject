package org.example;
import java.util.List;
import java.util.Scanner;

public class StudentConsoleApp {

    private final StudentManager manager;
    private final StudentStatistics statistics;

    public StudentConsoleApp() {
        manager = new StudentManager();
        statistics = new StudentStatistics(manager);
    }

    public void start() {
        manager.generateSampleData();

    }

    private void printMenu() {

    }

    private void handleUserInput() {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.print("Select option: ");
            int option = scanner.nextInt();


        }

        scanner.close();
    }

    private void displayStudents() {

        List<Student> students = manager.getAllStudents();

        for (Student student : students) {
            System.out.println(
                    student.getId() + " - " +
                            student.getName() + " | Avg: " +
                            student.getAverageGrade()
            );
        }

        System.out.println("------------------");
    }

    public static void main(String[] args) {

        StudentConsoleApp app = new StudentConsoleApp();
        app.start();
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
