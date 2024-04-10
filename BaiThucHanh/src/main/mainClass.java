package main;
import persons.employee;
import persons.employee_fulltime;
import persons.employee_pasttime;
import persons.person;

public class mainClass {
    public static void main(String[] args) {
        person p = new person();
        p.persons();
        employee e = new employee();
        e.employees();
        employee_fulltime ef = new employee_fulltime();
        ef.employee_fulltimes();
        employee_pasttime ei = new employee_pasttime();
        ei.employee_pasttimes();
    }
    
}
