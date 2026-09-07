package Thread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TimerThread thread=new TimerThread();
        Thread thread1 = new Thread(thread);
        thread1.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 5 seconds to Enter your Name");
        System.out.print("Enter your name:");
        String name=scanner.nextLine();

        scanner.close();

    }
}
