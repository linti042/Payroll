package com.example.payroll;

public class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Nem található a " + id + " azonosítójú alkalmazott.");
    }

}
