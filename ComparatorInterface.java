import java.util.*;

class Student {
    int rollno;
    String name;

      
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }


    @Override
    public String toString() {
        return rollno + ": " + name;
    }
}

class SortbyRoll implements Comparator<Student> 
{    
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

public class ComparatorInterface
{
    public static void main(String[] args) 
    {
        List<Student> students = new ArrayList<>();
        
          students.add(new Student(111, "Mayank"));
        students.add(new Student(131, "Anshul"));
        students.add(new Student(121, "Solanki"));
        students.add(new Student(101, "Aggarwal"));

        Collections.sort(students, new SortbyRoll());

          System.out.println("Sorted by Roll Number ");

        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
          
    }
}
