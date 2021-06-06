package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public int getAge() {
        System.out.print("what is your age? ");
        return input.nextByte();
    }
}
