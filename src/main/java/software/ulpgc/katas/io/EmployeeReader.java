package software.ulpgc.katas.io;

import software.ulpgc.katas.model.Employee;

import java.util.List;

public interface EmployeeReader {
    List<Employee> load();
}
