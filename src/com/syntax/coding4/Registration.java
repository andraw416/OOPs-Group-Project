package com.syntax.coding4;

public class Registration {
    private String email;
    private String userName;
    private String password;

    void setEmail(String email) {
        if (email.contains("yahoo")) {
            System.out.println("Your Email " + email + " is Valid");
            this.email = email;
        } else {
            System.out.println("Invalid Email, please use 'yahoo' email");
        }

    }

    void setUserName(String userName) {
        if (userName.length() > 6) {
            System.out.println("Your UserName " + userName + " is Valid");
            this.userName = userName;
        } else {
            System.out.println("Invalid UserName, UserName can not be empty and should be of length larger than 6 characters");
        }

    }

    void setPassword(String password) {
        if (password.length() < 6 || password.contains(userName)) {
            System.out.println("Invalid password. You have entered = " + password + " = password can not be empty and should be of length larger than 6 characters. Also we can not contain UserName");
        } else {
            System.out.println("Your password " + password + " is Valid (yes NOT good practice to show it)");
            this.password = password;
        }

    }

}

class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("john@wp.pl");
        registration.setEmail("john@yahoo.com");

        registration.setUserName("john");
        registration.setUserName("john12345678");

        registration.setPassword("");
        registration.setPassword("asd");
        registration.setPassword("john12345678");
        registration.setPassword("1234567891011");

    }
}

