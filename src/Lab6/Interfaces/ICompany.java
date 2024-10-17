package Lab6.Interfaces;

import java.util.List;

public interface ICompany {
    String getName();
    String getInformation();
    List<IEmployee> getEmployees(String employeeName);
}
