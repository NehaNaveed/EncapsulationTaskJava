public class Student {

    private String name;
    private String grade;

    public Student(String name, String grade) {
        if (grade != "A" && grade != "B" && grade != "C" && grade != "D" && grade != "F") {
            throw new IllegalArgumentException("Invalid Grade Initialization");
        }
        this.name = name;
        this.grade = grade;
    }

    public void setName(String stName) {
        name = stName;
    }

    public String getName() {
        return name;
    }

    public void setGrade(String gr) {
        switch (gr) {
            case "A":
            case "B":
            case "C":
            case "D":
            case "F":
                grade = gr;
                break;
            default:
                System.out.println("Invalid grade");
        }
    }

    public String getGrade() {
        return this.grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ali", "B");
        Student st2 = new Student("Neha", "A");
        System.out.println("Student 1 has name: " + st1.getName() + " and grade: " + st1.getGrade());
        System.out.println("Student 2 has name: " + st2.getName() + " and grade: " + st2.getGrade());
        st1.setGrade("F");
        st2.setGrade("C");
        System.out.println("-------------------------------------------");
        System.out.println("Updated grade for (Student 1) " + st1.getName() + ": " + st1.getGrade());
        System.out.println("Updated grade for (Student 2) " + st2.getName() + ": " + st2.getGrade());
        System.out.println("-------------------------------------------");
        st1.setName("Ali Naveed");
        System.out.println("Updated name for Student 1 is " + st1.getName());
    }
}
