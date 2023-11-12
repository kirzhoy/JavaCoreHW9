package HomeWork9;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Util {
   public static Set<String> unicCourse(List<StudentClass> students) {
       return students.stream()
                .map(x -> x.getAllCourses())
                .flatMap(x->x.stream())
                .map(x-> x.toString())
                .collect(Collectors.toSet());
    }

    static List<Student> mostCuriousStudents(List<StudentClass> students) {
        return students.stream()
                  .sorted((x,y) -> y.getAllCourses().size() - x.getAllCourses().size())
                  .limit(3)
                  .collect(Collectors.toList());
    }

   static List<Student> studentsOnCourse(List<StudentClass> students, String title) {
       return students.stream()
                 .filter(x -> x.getAllCourses().toString().contains(title))
                 .collect(Collectors.toList());
          }

}
