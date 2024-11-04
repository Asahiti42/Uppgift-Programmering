package Uppgift1Inlämning;

import java.util.Scanner;

public class CharacterAndLineCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counter counter = new Counter();

        System.out.println("Skriv text här (skriv /stop på en separat rad för att avsluta):");
        handleInput(scanner, counter);

        System.out.println("Så här många tecken skrev du (inklusive space): " + counter.getCharCount());
        System.out.println("Så här många rader använde du: " + counter.getLineCount());

        scanner.close();
    }


    public static void handleInput(Scanner scanner, Counter counter) {
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("/stop")) {
                break;
            }
            counter.addLine(line);
        }
    }
}