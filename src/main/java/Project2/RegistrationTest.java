package Project2;

public class RegistrationTest {
    public static void main(String[] args) {
        Registration registration = new Registration();

        // Setting valid email, username, and password
        registration.setEmail("john@yahoo.com");
        registration.setUserName("john123");
        registration.setPassword("password123");

        // Setting invalid email, username, and password
        registration.setEmail("john@gmail.com");
        registration.setUserName("");
        registration.setPassword("john123password");

        // Displaying the values set in the Registration object
        System.out.println("Email: " + registration.getEmail());
        System.out.println("Username: " + registration.getUserName());
        System.out.println("Password: " + registration.getPassword());
    }
}
