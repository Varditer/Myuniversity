package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Student extends  User{
    public void Savefile(Student s ) throws IOException {

        String row1 = s.getName() + " , " + s.getUsername() + " , " + s.getPassword() + " , " + s.getUsername() + " , " + s.getEmail() + "\n";
        Path path1 = Paths.get("C:\\Users\\Suren\\Desktop\\codsvard\\MyUniversity\\src\\com\\company\\Student.txt");
        Files.write(path1, row1.getBytes(), StandardOpenOption.APPEND);
    }

    private String faculty;
    private int Raiting;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getRaiting() {
        return Raiting;
    }

    public void setRaiting(int raiting) {
        Raiting = raiting;
    }
}

