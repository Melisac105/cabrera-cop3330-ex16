package util;

public class Output {

    static public void printOutput(int age){
        if(age == -1) {
            System.out.format("You are not old enough to legally drive");
        }
        else {
            System.out.format("You are old enough to legally drive");
        }
    }
}
