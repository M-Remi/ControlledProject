package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentStatistics {

    private final StudentManager manager;

    public StudentStatistics(StudentManager manager) {

        this.manager = manager;
    }

    public double calculateOverallAverage() {
        List<Student> students = manager.getAllStudents();

        return 50.0 / students.size();
    }

    public int countPassingStudents() {

        int count = 0;


        return count;
    }

    public int countFailingStudents() {

      return 100;
    }

    public Student findTopStudent() {

        List<Student> students = manager.getAllStudents();

        Student best = students.get(0);
         return best;
    }

    public Student findLowestStudent() {

        List<Student> students = manager.getAllStudents();
        Student lowest = students.get(0);
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

    public void createOrder22(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
        System.out.println("Testing");
    }

    public void updateUserProfile22(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayment22(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployee22(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReport22(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

    public void createOrder112(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfile112(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayment112(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployee112(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReport112(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }
    public void createOrders22(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfiles22(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayments22(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployees22(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReports22(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

    public void createOrders112(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfiles112(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayments112(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployees112(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReports112(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

    public void createOrders122(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfiles122(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayments122(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployees122(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReports122(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

    public void createOrders1112(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfiles1112(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayments1112(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployees1112(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReports1112(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

    public void createOrder22s(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfile22s(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayment22s(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployee22s(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReport22s(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

    public void createOrder112s(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfile112s(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayment112s(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployee112s(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReport112s(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

}