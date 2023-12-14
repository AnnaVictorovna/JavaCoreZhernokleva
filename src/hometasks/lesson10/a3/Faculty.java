package hometasks.lesson10.a3;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String nameOfFaculty;
    List<Group> groups = new ArrayList<>();

    public Faculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public Group addGroup(Group group) {
        this.groups.add(group);
        return group;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "nameOfFaculty='" + nameOfFaculty + '\'' +
                ", groups=" + groups +
                '}';

    }
}
