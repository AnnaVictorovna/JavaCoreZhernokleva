package hometasks.lesson10.a3;

import java.util.ArrayList;
import java.util.List;

public class University {
    String nameOfUniversity;

    List<Faculty> faculties = new ArrayList<>();

    public University(String nameOfUniversity, List<Faculty> faculties) {
        this.nameOfUniversity = nameOfUniversity;
        this.faculties = faculties;
    }
}
