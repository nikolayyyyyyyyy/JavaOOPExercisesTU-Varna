package Lab4.Models;
import Lab4.Interfaces.IFaculty;
import Lab4.Interfaces.IStudentGroup;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Faculty implements IFaculty {

    private List<IStudentGroup> studentGroups;

    public Faculty(){

        this.studentGroups = new ArrayList<>();
    }

    @Override
    public List<IStudentGroup> getStudentGroup() {
        return studentGroups;
    }

    @Override
    public IStudentGroup getGroupWithMaxStudentByCourse(int course) {
        return studentGroups.stream()
                .filter(a->a.getCourse() == course)
                .max(Comparator.comparing(IStudentGroup::getCountStudents))
                .orElse(null);
    }
}
