package hometasks.lesson10.a3;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final String nameOfUniversity;

    private final List<Faculty> faculties = new ArrayList<>();

    public University(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public Faculty addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
        return faculty;
    }

    public List<Double> getAllMarksUniversity() {
        List<Double> marks = new ArrayList<>();
        for (Faculty faculty : faculties) {
            marks.addAll(faculty.getAllMarksFaculty());
        }
        return marks;
    }
    @Override
    public String toString() {
        return "University{" +
                "nameOfUniversity='" + nameOfUniversity + '\'' +
                ", \n faculties=" + faculties +
                '}';
    }
}
