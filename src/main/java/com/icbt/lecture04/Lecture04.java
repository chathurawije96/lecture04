/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.icbt.lecture04;

import com.icbt.lecture04.dto.Employee;
import com.icbt.lecture04.dto.Person;
import com.icbt.lecture04.dto.Student;

/**
 *
 * @author hd
 */
public class Lecture04 {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Jone");
        person1.setLastName("Smith");
        person1.setNic("11123456V");
        
        Person person2 = new Person("11563456V", "chat", "dham");
        
        System.out.println("Hello "+person1.getFirstName());
        System.out.println("Hello "+person2.getFirstName());
        
        Student student1= new Student();
        student1.setFirstName("James");
        student1.setLastName("Smith");
        student1.setNic("14123456V");
        student1.setStudentNo("56");
        
        Student student2 = new Student("67", "141234766V", "Thomus", "Stalin");
        
        System.out.println("Hello "+student1.getFirstName());
        System.out.println("Hello "+student2.getFirstName());
        
        Employee employee1= new Employee();
        employee1.setFirstName("Sumie");
        employee1.setLastName("Smith");
        employee1.setNic("14123456V");
        employee1.setEmployeeNo("E86");
        employee1.setSalary(4000.0);
        
        Employee employee2 = new Employee("E87",5000.0, "141234766V", "Anton", "Stalin");
        
        System.out.println("Hello "+employee1.getFirstName());
        System.out.println("Hello "+employee2.getFirstName());
    }
}
