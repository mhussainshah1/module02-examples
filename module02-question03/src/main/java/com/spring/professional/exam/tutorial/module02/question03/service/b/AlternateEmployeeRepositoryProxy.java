package com.spring.professional.exam.tutorial.module02.question03.service.b;

import com.spring.professional.exam.tutorial.module02.question03.ds.Employee;

public class AlternateEmployeeRepositoryProxy extends AlternateEmployeeRepository {
    @Override
    public Employee findEmployeeById(long id) {
        System.out.println("Before - findEmployeeById");
        Employee employeeById = super.findEmployeeById(id);
        System.out.println("After - findEmployeeById");
        return employeeById;
    }

    @Override
    public void saveEmployee(Employee employee) {
        super.saveEmployee(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        super.deleteEmployee(employee);
    }
}
