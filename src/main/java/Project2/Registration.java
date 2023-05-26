package Project2;

class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Please provide a valid yahoo email.");
        }
    }

    public void setUserName(String userName) {
        if (isValidUserName(userName)) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username. Username cannot be empty and should have a length larger than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Password cannot be empty, should have a length larger than 6 characters, and should not contain the username.");
        }
    }

    private boolean isValidEmail(String email) {
        return email.endsWith("@yahoo.com");
    }

    private boolean isValidUserName(String userName) {
        return userName.length() > 6 && !userName.isEmpty();
    }

    private boolean isValidPassword(String password) {
        return password.length() > 6 && !password.isEmpty() && !password.contains(userName);
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}