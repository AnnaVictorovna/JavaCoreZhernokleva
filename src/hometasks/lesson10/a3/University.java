package hometasks.lesson10.a3;

import java.util.ArrayList;
import java.util.List;

public class University {
    String nameOfUniversity;
    List<Faculty> faculties = new ArrayList<>();

    public University(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public Faculty addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
        return faculty;
    }

    @Override
    public String toString() {
        return "University{" +
                "nameOfUniversity='" + nameOfUniversity + '\'' +
                ", faculties=" + faculties +
                '}';
    }
}
