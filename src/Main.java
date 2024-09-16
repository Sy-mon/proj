import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Welcome();
       int [] allAges = studentAges(32, 25, 33);
       System.out.println(allAges[0]);
//       System.out.println(allAges[1]);
//       System.out.println(allAges[2]);

    }

    public static void Welcome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.close();
    }

    public static int [] studentAges (int a, int b, int c){
        int [] ages = new int[3];
        ages[0] = a;
        ages[1] = b;
        ages[2] = c;

        return ages;
    }
}