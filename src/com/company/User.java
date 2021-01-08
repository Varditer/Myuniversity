package com.company;

public class  User {
    private String name;
    private String surname;
    private String password;
    private String username;
    private String email;

   public static boolean validate(String p) {
       int uppercasecount = 0;
       int numberscount = 0;
       char[] charArray = p.toCharArray();
       for (int i = 0; i < p.length(); i++) {
           if (Character.isUpperCase(charArray[i])) {
               uppercasecount++;

           }
           if (Character.isDigit(charArray[i])) {
               numberscount++;
           }
       }
       if (p.length() < 8 || uppercasecount < 2 || numberscount < 3) {
           System.out.println("incorrect password");
           return false;
       } else {
           return true;
       }

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
