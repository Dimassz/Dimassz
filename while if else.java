import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        int result;
        int attempt= 0;
        boolean x=true;
        String input;

        System.out.println("1 + 2");

        do {
            System.out.print("Result:");
            result= inputUser.nextInt();

            if (result == 3){
                System.out.println("Correct");
                x=false;

            }else{
                attempt++;
                System.out.println("Wrong");

                }
                if (attempt == 3){
                    x=false;
                    System.out.println("Try Again");
                    //----------------
                    System.out.print("Y/n?");
                    input=inputUser.next();
                    switch (input){
                        case"Y", "y":
                            x=true;
                            attempt=0;
                }
            }
        }while (x);
    }

}
