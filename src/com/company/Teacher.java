package com.company;

import com.company.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Teacher extends User implements Salari {
    public void Savefile(Teacher t) throws IOException {
        String row = t.getName() + " , " + t.getUsername() + " , "+ t.getPassword()+ " , " + t.getUsername()+ " , "+ t.getEmail() +"\n";
        Path path = Paths.get("C:\\Users\\Suren\\Desktop\\codsvard\\MyUniversity\\src\\com\\company\\Teacher.txt");
        Files.write(path, row.getBytes(), StandardOpenOption.APPEND);

    }
    @Override
    public int CalculateSalary() {
         int result= WorkDays * DaySalary;
        return result;
    }
    private int WorkDays;
    private int DaySalary;

    public int getDaySalary() {
        return DaySalary;
    }

    public void setDaySalary(int daySalary) {
        DaySalary = daySalary;
    }

    public int getWorkDays() {
        return WorkDays;
    }

    public void setWorkDays(int workDays) {
        WorkDays = workDays;
    }
}
