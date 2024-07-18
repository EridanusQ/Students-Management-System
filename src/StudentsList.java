import java.util.Scanner;

public class StudentsList {
    private Students[] stu = new Students[50];
    private int count = 0;
    public StudentsList() {
        System.out.println("请输入学生个数：");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        count = n;
        for (int i = 0; i < n; i++) {
            stu[i].init();
        }
    }
    public void show(){
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "\t");
            stu[i].Print();
        }
    }
    public static void main(String[] args) {
        StudentsList list = new StudentsList();
        list.show();
    }


}
