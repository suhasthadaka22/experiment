//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    int[] rollNum= new int[n];
    System.out.println("Enter the size of the array");



        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {

            rollNum[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(rollNum[i]);

        }
    }
}