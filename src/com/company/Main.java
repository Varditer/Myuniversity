package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();

        String h = " " ;
        System.out.println("name");
        h = scanner.next();
        teacher.setName(h);

        String k = " " ;
        System.out.println("Surname");
        k = scanner.next();
        teacher.setSurname(k);

        boolean isvalid;
        String a = " " ;
        do {
            System.out.println("Password");
            a = scanner.next();
            isvalid=User.validate(a);
        }while(isvalid==false);
        teacher.setPassword(a);


        String n = " ";
        System.out.println("Username");
        n = scanner.next();
        teacher.setUsername(n);

        String g = " ";
        System.out.println("Email");
        g = scanner.next();
        teacher.setEmail(g);

        int f;
        System.out.println("WorkDays");
        f = scanner.nextInt();
        teacher.setWorkDays(f);

        int d;
        System.out.println("DaySalary");
        d = scanner.nextInt();
        teacher.setDaySalary(d);

        int m;
        m = teacher.CalculateSalary();
        System.out.println(m);

        teacher.Savefile(teacher);


        Student student = new Student();

        String l = " " ;
        System.out.println("name");
        l= scanner.next();
        student.setName(l);

        String s = " " ;
        System.out.println("Surname");
        s = scanner.next();
        student.setSurname(s);

        isvalid=false;
        String b = " " ;
        do{
            System.out.println("Password");
            b = scanner.next();
            isvalid=User.validate(b);
        }while (isvalid==false);
        student.setPassword(b);


        String q = " ";
        System.out.println("Username");
        q = scanner.next();
        student.setUsername(q);

        String w = " ";
        System.out.println("Email");
        w = scanner.next();
        student.setEmail(w);

        String x = " ";
        System.out.println("faculty");
        x = scanner.next();
        student.setFaculty(x);

        int z ;
        System.out.println("Raiting");
        z = scanner.nextInt();
        student.setRaiting(z);

     student.Savefile(student);



    }

}
