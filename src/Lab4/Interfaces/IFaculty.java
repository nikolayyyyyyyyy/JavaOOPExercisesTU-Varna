package Lab4.Interfaces;

import java.util.List;

public interface IFaculty {
    List<IStudentGroup> getStudentGroup();
    IStudentGroup getGroupWithMaxStudentByCourse(int course);
}
