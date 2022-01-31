package com.baontq.model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI
 */
public class EmployeeList {

    private ArrayList<Employee> list = new ArrayList<>();
    private int index = 0;

    public void first() {
        if (index > 0) {
            index = 0;
        }
    }

    public void previous() {
        if (index > 0) {
            index--;
        }
    }

    public void next() {
        if (index < list.size() - 1) {
            index++;
        }
    }

    public void last() {
        index = list.size() - 1;
    }

    public int getEmpIndex() {
        return index;
    }

    public void add(Employee emp) {
        list.add(emp);
    }

    public Employee getCurrentEmpIndex() {
        if (list.size() == 0) {
            return null;
        }
        return list.get(index);
    }

    public Employee findByID(String ID) {
        for (Employee employee : list) {
            if (employee.getID().equals(ID)) {
                return employee;
            }
        }
        return null;
    }

    public boolean update(Employee emp) {
        Employee existedEmp = findByID(emp.getID());
        if (existedEmp != null) {
            existedEmp.setName(emp.getName());
            existedEmp.setAge(emp.getAge());
            existedEmp.setEmail(emp.getEmail());
            existedEmp.setLuong(emp.getLuong());
            return true;
        }

        return false;
    }
    
    public void renderToTable(DefaultTableModel tblModel) {
        tblModel.setRowCount(0);
        
        for (Employee employee : list) {
            Object[] row = new Object[] {employee.getID(), employee.getName(), employee.getAge(), employee.getEmail(), employee.getLuong()};
            
            tblModel.addRow(row);
        }
        tblModel.fireTableDataChanged();
        
    }

    public boolean deleteByID(String ID) {
        for (Employee employee : list) {
            if (employee.getID().equals(ID)) {
                list.remove(employee);
                return true;
            }
        }
        return false;
    }
}
