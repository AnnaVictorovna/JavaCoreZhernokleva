package hometasks.lesson7.a1;

public class University {
    Student kolya = new Student(20, 3);

    static class Student {
        int age;
        int yearsOfStuding;

        public Student(int age, int yearsOfStuding) {
            this.age = age;
            this.yearsOfStuding = yearsOfStuding;

        }

        @Override
        public String toString() {
            return "Student{" +
                    "age = " + age +
                    ", years Of Studing = " + yearsOfStuding +
                    '}';
        }
    }
}