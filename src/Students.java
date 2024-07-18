import java.util.Scanner;

public class Students {
    private int id;
    private String name;
    private String gender;
    private String grade;
    public Students(int id, String name, String gender, String grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }
    public void Print(){
        System.out.print(id + "\t" + name + "\t" + gender + "\t" + grade + "\n");
    }
    public void init(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student id: ");
        id = input.nextInt();
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your gender: ");
        gender = input.nextLine();
        System.out.print("Enter your grade: ");
        grade = input.nextLine();
    }
}
