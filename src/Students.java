import java.util.Scanner;

public class Students {
    private String name;
    private String gender;
    private String grade;
    public Students(String name, String gender, String grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }
    public void Print(){
        System.out.print(name + "\t" + gender + "\t" + grade + "\n");
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Students s = new Students(sc.next(), sc.next(), sc.next());
//        s.Print();
//    }
}
