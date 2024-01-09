package hometasks.lesson10.a3;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private final String nameOfFaculty;
    private final List<Group> groups = new ArrayList<>();

    public Faculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public Group addGroup(Group group) {
        this.groups.add(group);
        return group;
    }

    public List<Double> getAllMarksFaculty() {
        List<Double> marks = new ArrayList<>();
        for (Group group : groups) {
            marks.addAll(group.getAllMarksGroup());
        }
        return marks;
    }

    @Override
    public String toString() {
        return Tab.T2.getString() + "Faculty{" +
                "nameOfFaculty='" + nameOfFaculty + '\'' +
                Tab.T3.getString() + "groups=" + groups +
                Tab.T2.getString() + "}";

    }
}
