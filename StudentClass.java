package HomeWork9;

import java.util.ArrayList;
import java.util.List;

class StudentClass implements Student{

    public String name;
    public List<Course> courses;

    public StudentClass(String name, String courses) {
        this.name = name;
        this.courses = new ArrayList<Course>();
        for (String c: courses.split(", ")) {
            this.courses.add(new CourseClass(c));
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Course> getAllCourses() {
        return this.courses;
    }

    @Override
    public String toString() {
        return "Студент " + name + ", посещает следующие курсы = " + courses ;
    }
}
