import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        List<Student> students = generateStudents(6);

        for (Student student : students)
        {
            System.out.println(student.toString());
        }

    }

    public static List<Student> generateStudents (int numberOfStudents)
    {

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++)
        {
            students.add(randomizeStudentData(i));
        }

        return students;

    }

    public static Student randomizeStudentData(int studentNumber)
    {
        //student name, age, ID
        String studentName = Data.names[(int) (Math.random() * Data.names.length)];
        int age = (int) (Math.random() * 20 + 10);
        int ID = studentNumber;

        //student subject-marks HashMap
        Map<String, Integer> progress = new HashMap<String, Integer>();

        //randomly generate mark for each subject
        for (String subject : Data.subjects) {
            progress.put(subject, (int) (Math.random() * 10));
        }

        return new Student(studentName, age, ID, progress);

    }

    //to store data for generation
    public class Data
    {

        public static String[] names = {"Jack", "James", "Desmond", "Kate"};
        public static String[] subjects = {"literature", "math", "physics"};

    }

    public static class Student
    {

        private String name;
        private int age;
        private int ID;
        private Map<String, Integer> progress = new HashMap<String, Integer>();

        public Student(String name, int age, int groupID, Map<String, Integer> progress) {

            this.name = name;
            this.age = age;
            this.ID = groupID;
            this.progress = progress;

        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", ID=" + ID +
                    ", progress=" + progress +
                    '}';
        }

    }
}