import java.util.Scanner;

public class GuessNumber {
        Scanner scanner = new Scanner(System.in);
        double numb = Math.floor(Math.random() * 20);


    public void getInputNum(){

        Scanner scan = new Scanner(System.in);
        int inputNum;
        String answer = "";
        double numb = Math.floor(Math.random() * 20);
        int rand = (int) numb;
        System.out.println("Hello! What is your name?");


        try {
            String name = scan.nextLine();
            System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20");


            int count = 0;
            boolean play = true;

            while (count <= 6) {
                System.out.println("Take a guess");
                inputNum = scanner.nextInt();
                String mesg = checkNumber(rand, inputNum);
                count++;
                if (mesg.equalsIgnoreCase("yes")) {
                    System.out.println("Good job! " + name + "You guess my number in " + count + " guesses! ");
                    System.out.println("Do you want to play again(y or n)?");
                    String str = scan.nextLine();
                    if (str.equalsIgnoreCase("y")) {

                        count = 0;
                    } else {

                        break;
                    }
                } else {
                    System.out.println(mesg);
                }
            }
        } catch(Exception e) {
            System.out.println("Caught Exception: not a valid number input.");
        }
    }
    public String checkNumber(int rand, int numb){
        String message ="";
        try{
            if (rand == numb)
                message = "yes";
            else if (numb < 1 || numb > 20)
                message = "you entered the wrong number";
            else if (numb > rand)
                message = "your number is too big";
            else if (numb < rand)
                message = "your number is too small";
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return message;
    }
}

