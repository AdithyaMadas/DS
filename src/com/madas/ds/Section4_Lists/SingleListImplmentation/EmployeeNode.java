package com.madas.ds.Section4_Lists.SingleListImplmentation;

import com.madas.ds.Section4_Lists.model.Employee;

public class EmployeeNode {
    //Use generics if you want to make it use other Classes other than Employee

    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }

}
