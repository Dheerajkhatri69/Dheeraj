import java.util.Scanner;
import java.util.Random;
class game{
    int user;
    public int random(){//behaviour
        Random ra =new Random();
        return ra.nextInt(1,101);
    }
    void ouput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the no:");
        user = sc.nextInt();
    }
    int input(){
        return user;
    }
}
public class guess_the_no_game {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        game ga =new game();//object
        int rec=ga.random();
        int no=0;
        while (true) {
            no+=1;
            System.out.println("\n<---Round No."+no+"--->");
            ga.ouput();
            if (rec == ga.input()) {
                System.out.println("You guess Right!");
                break;
            } else if (rec < ga.input()) {
                System.out.println("Too high....!");
            } else if (rec > ga.input()) {
                System.out.println("Too looo....!");
            } else {
                System.out.println("Out of limit!(1 to 100)");
            }
        }
        System.out.println("<---- completed into."+no+" round---->");
    }
}
