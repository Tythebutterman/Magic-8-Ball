import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){

        Scanner keyboard;
        int testing;
        String question;
        int pickednumber;



        keyboard=new Scanner(System.in);

        pickednumber=(int)(Math.random()*100);

        System.out.println("Ask the magic 8 ball a question  ");
        question=keyboard.nextLine();

        if (pickednumber<11) {

            System.out.println("YEZZIR");
        }
        else if (pickednumber<21) {

            System.out.println("No way");
        }
        else if (pickednumber<31) {

            System.out.println("Thats all you");
        }
        else if (pickednumber<41) {

            System.out.println("Thats not possible");
        }
        else if (pickednumber<51) {

            System.out.println("Ask another question");
        }
        else if (pickednumber<61) {

            System.out.println("No doubt about it");
        }
        else if (pickednumber<71) {

            System.out.println("As I see it, yes");
        }
        else if (pickednumber<81) {

            System.out.println("It is certain");
        }
        else if (pickednumber<91) {

            System.out.println("Not a chance");
        }
        else if (pickednumber<101) {

            System.out.println("NOZZIR");
        }






    }
}