import java.util.Scanner;

public class Task4 
{
    public static void main(String[] args) 
    {
        final String USERNAME = "pklrlk"; 
        final String PASSWORD = "000000"; 
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        Scanner sc = new Scanner(System.in);

        while (attempts < MAX_ATTEMPTS) 
        {
            System.out.print("Enter username: ");
            String user = sc.nextLine();

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            if (user.equals(USERNAME) && pass.equals(PASSWORD)) 
            {
                System.out.println("Access Granted!");
                sc.close();
                return;
            } 
            else 
            {
                attempts++;
                if (attempts < MAX_ATTEMPTS) 
                {
                    System.out.println("Invalid credentials. Attempts left: " + (MAX_ATTEMPTS - attempts));
                }
            }
        }

        System.out.println("Try again later.");
        sc.close();
    }
}

