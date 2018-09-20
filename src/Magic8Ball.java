import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){

        Scanner keyboard;
        int testing;
        String question;



        keyboard=new Scanner(System.in);

        System.out.println("Ask the magic 8 ball a question  ");
        question=keyboard.nextLine();
        System.out.println("write a number 0-100");
        testing=keyboard.nextInt();
        if (testing<11) {

            System.out.println("YEZZIR");
        }
        else if (testing<21) {

            System.out.println("No way");
        }
        else if (testing<31) {

            System.out.println("Thats all you");
        }
        else if (testing<41) {

            System.out.println("Thats not possible");
        }
        else if (testing<51) {

            System.out.println("Ask another question");
        }
        else if (testing<61) {

            System.out.println("No doubt about it");
        }
        else if (testing<71) {

            System.out.println("As I see it, yes");
        }
        else if (testing<81) {

            System.out.println("It is certain");
        }
        else if (testing<91) {

            System.out.println("Not a chance");
        }
        else if (testing<101) {

            System.out.println("NOZZIR");
        }






    }
}