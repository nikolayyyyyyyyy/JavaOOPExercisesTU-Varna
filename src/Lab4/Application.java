package Lab4;

import Lab4.Interfaces.IFaculty;
import Lab4.Interfaces.IStudentGroup;
import Lab4.Models.Faculty;
import Lab4.Models.StudentGroup;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IFaculty faculty = new Faculty();

        IStudentGroup firstGroup =
                new StudentGroup("Computer Science",
                        1,
                        101,
                        25);

        IStudentGroup secondGroup =
                new StudentGroup("Mathematics",
                        2,
                        202,
                        30);

        IStudentGroup thirdGroup =
                new StudentGroup("Physics",
                        2,
                        203,
                        28);

        IStudentGroup fourthGroup =
                new StudentGroup("Computer Science",
                        2,
                        204,
                        35);

        IStudentGroup fifthGroup =
                new StudentGroup("Mathematics",
                        3,
                        301,
                        20);

        faculty
                .getStudentGroup()
                .addAll(List.of(firstGroup,
                        secondGroup,
                        thirdGroup,
                        fourthGroup,
                        fifthGroup));

        System.out.println("Groups:");
        System.out.println();

        faculty
                .getStudentGroup()
                .forEach(System.out::println);

        System.out.println("Group with max students:");
        System.out.println("Insert Course:");
        int course = Integer.parseInt(scanner.nextLine());
        System.out.println(faculty.getGroupWithMaxStudentByCourse(course));
    }
}
