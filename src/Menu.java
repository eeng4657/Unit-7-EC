import java.util.Scanner;
public class Menu 
{
    public static void main(String[] args) 
    {
        System.out.println("What would you like to do?\n1. Calculate cost of one package\n2. Simulate packages\n3. How package costs are calculated\n4.Exit\nInput: ");
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
    }
}
