package HomeWork9;

import java.util.ArrayList;
import java.util.List;
import static HomeWork9.Util.*;

public class Main {
     public static void main(String[] args) {

        List<StudentClass> students = new ArrayList<>();
        students.add(new StudentClass("Иван Петров", "Литература, Шахматы, История, Алгебра, География, Черчение, Геометрия"));
        students.add(new StudentClass("Петр Иванов", "Литература, Шахматы, История, Алгебра, Геометрия"));
        students.add(new StudentClass("Сидор Федоров", "Литература, Шахматы, История, Алгебра, Геометрия, Черчение, Изо, Пение"));
        students.add(new StudentClass("Федор Сидоров", "Литература, Шахматы, История, География, Столярное дело"));
        students.add(new StudentClass("Василий Васильев", "Литература, Шахматы, История, Геометрия"));
        students.add(new StudentClass("Сергей Сергеев", "Шахматы, История, Алгебра, География, Черчение, Геометрия, Пение"));
        students.add(new StudentClass("Василий Сергеев", "Шахматы, История, Алгебра, География, Столярное дело, Литература"));


        System.out.println("1. Список уникальных курсов, на которые подписаны студенты");
        System.out.println(unicCourse(students));
        System.out.println();

        System.out.println("2. Список из трех самых любознательных студентов");
        mostCuriousStudents(students).stream().forEach(System.out::println);
        System.out.println();

        System.out.println("3. Список студентов, которые посещают выбранный курс");
        studentsOnCourse(students,"Черчение" ).stream().forEach(System.out::println);

    }

}
