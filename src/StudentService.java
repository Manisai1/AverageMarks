import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData() {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Alice", 101, 85));
        studentSet.add(new Student("Bob", 102, 90));
        studentSet.add(new Student("Charlie", 103, 78));
        studentSet.add(new Student("David", 104, 92));
        return studentSet;
    }

    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet) {
        TreeSet<String> sortedNames = new TreeSet<>();
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()) {
            sortedNames.add(iterator.next().getName());
        }
        return sortedNames;
    }

    public static Map<String, Integer> calculateAverage(Set<Student> studentSet) {
        Map<String, Integer> averageMap = new HashMap<>();
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            int averageMarks = student.getTotalMarks() / 1; // Assuming totalMarks represents marks for one subject
            averageMap.put(student.getName(), averageMarks);
        }
        return averageMap;
    }

    public static void main(String[] args) {
        Set<Student> studentSet = getAllStudentData();
        System.out.println("All Students: " + studentSet);

        Set<String> sortedNames = getAllStudentNameInSorted(studentSet);
        System.out.println("Sorted Names: " + sortedNames);

        Map<String, Integer> averageMap = calculateAverage(studentSet);
        System.out.println("Average Marks: " + averageMap);
    }
}
