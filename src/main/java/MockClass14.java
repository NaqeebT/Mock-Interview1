// Create Registration Class in which you would have variables such as email,
//userName and password that have an access scope only within its own class.
//After creating an object of the class, the user should be able to call methods
//and in each method separately pass values to set users email, username and
//password.
//Requirements:
//● Valid email consider to be only yahoo
//● Valid userName and password cannot be empty and should be of
//length larger than 6 characters. Also, valid passwords cannot contain
//userName?
public class MockClass14 {
        private String email;
        private String userName;
        private String password;

        // Method to set user's email
        public void setEmail(String email) {
            // Check if the email is valid (considering only yahoo)
            if (email.toLowerCase().endsWith("@yahoo.com")) {
                this.email = email;
            } else {
                System.out.println("Invalid email format. Please use a Yahoo email.");
            }
        }

        // Method to set user's userName
        public void setUserName(String userName) {
            // Check if the userName is valid (non-empty and length larger than 6)
            if (userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("Invalid userName. It should be non-empty and have a length larger than 6.");
            }
        }

        // Method to set user's password
        public void setPassword(String password) {
            // Check if the password is valid (non-empty, length larger than 6, and doesn't contain userName)
            if (password.length() > 6 && !password.contains(userName)) {
                this.password = password;
            } else {
                System.out.println("Invalid password. It should be non-empty, have a length larger than 6, and not contain userName.");
            }
        }

        // Method to display registration details
        public void displayRegistrationDetails() {
            System.out.println("Registration Details:");
            System.out.println("Email: " + email);
            System.out.println("UserName: " + userName);
            System.out.println("Password: " + password);
        }

        public static void main(String[] args) {
            // Create an object of the Registration class
            MockClass14 userRegistration = new MockClass14();

            // Set user details using the provided methods
            userRegistration.setEmail("user@yahoo.com");
            userRegistration.setUserName("user123");
            userRegistration.setPassword("password123");

            // Display registration details
            userRegistration.displayRegistrationDetails();
        }
    }



