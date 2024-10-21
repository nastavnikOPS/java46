package lesson11;
public class Main1 {
    public static void main(String[] args) {

        Student[] students = new Student[6];
        students[0] = new Student("Mary", "Stone", "A",5.0);
        students[1] = new Student("Chris", "Lloyd", "B",4.5);
        students[2] = new Student("Greg", "Boucher", "C",3.7);

        students[3] = new Aspirant("Sophie", "Donovan", "A", 5.0, "Biotechnology");
        students[4] = new Aspirant("Mike", "Ridd", "B", 4.3, "Nanotechnology");
        students[5] = new Aspirant("Kira", "Hills", "C", 3.5, "Agrobiotechnologies");

        for (Student student: students){
            System.out.println(student);
            System.out.println(student.getScholarship());
        }
    }
}
