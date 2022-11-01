package com.spring.professional.exam.tutorial.module02.question03.service.a;

import com.spring.professional.exam.tutorial.module02.question03.ds.Employee;

public class EmployeeRepositoryProxy implements EmployeeRepository {
    private EmployeeRepositoryImpl employeeRepository;

    public EmployeeRepositoryProxy(EmployeeRepositoryImpl employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findEmployeeById(long id) {
        System.out.println("Before - findEmployeeById");
        Employee employeeById = employeeRepository.findEmployeeById(id);
        System.out.println("After - findEmployeeById");
        return employeeById;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.deleteEmployee(employee);
    }
}
