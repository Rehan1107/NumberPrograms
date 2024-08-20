import java.util.Scanner;

public class CountNumberOfDays {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year:");
        int year = sc.nextInt();

        System.out.println("Enter the Month:");
        int month = sc.nextInt();

        countDays(month, year);

    }

    public static void countDays(int month, int year)
    {
        if(month == 2)
        {
            if (((year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0))) {
                System.out.println("Number of days is 29");
            } else {
                System.out.println("Number of days is 28");
            }
        }

        else {

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("Number of days is 31");
            } else {
                System.out.println("Number of days is 30");
            }

        }

    }
}
