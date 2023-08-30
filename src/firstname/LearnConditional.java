package firstname;

public class LearnConditional {

    // Write method that can identify if a number is greater than 100 or not
    public static void doIdentify() {

        // if ( Condition )  { Statement 1 } else { Statement 2 }
        int num1 = 100;

        if (num1 == 100) {
            System.out.println(num1 + " " + "is greater than 100.");

        } else if (num1 < 100) {
            System.out.println(num1 + " " + "is equal to 100.");

        } else {
            System.out.println(num1 + " " + "is not greater than 100.");
        }

    }

    public static void main(String[] args) {

        //doIdentify();


        int incomeLimit = 10000;
        int rumelIncome = 20000;

        if (rumelIncome > incomeLimit) {
            int rumelPayToGov = rumelIncome * 50 / 100;
            System.out.println(" Rumels have to pay " + rumelPayToGov);
        } else {
            int rumelGetFromGov = rumelIncome * 50 / 100;
            System.out.println(" Rumels will get " + rumelGetFromGov);
        }


        int days = 25;

        if (days > 30) {
            System.out.println("Rumel have to pay $50 penalty.");
        } else {
            System.out.println("Rumel do not have to pay $50 penalty.");
        }

        //Q1. Write a program to check if a number is greater than 10 and smaller than 20.

        int number = 15;

        if (10 < number && number < 20) {
            System.out.println("The number1 is greater than 10 and less than 20.");
        } else {
            System.out.println("the number1 is not greater than 10 and less than 20.");
        }
//Q2. Write a program to check if someone is old enough to vote or not
        int personage = 16;
        int votingage = 18;

        if (personage >= votingage) {
            System.out.println("The person is old enough to vote");
        } else {
            System.out.println("the person is not old enough to vote");

            //Q4. White a program to provide 10% discount to people who has coupons. E.g.,
            // if someone has coupon then they will 10% discount, hence, the price will be 10% cheaper

            //Q3. Write a program where it will take exam marks as input and provide GPA as output. E.g.,
            // If I input 90, then it should say "Grade is: A"


            int mark = 80;

            if (mark >= 80) {
                System.out.println("Grade is A");
            } else {
                System.out.println("Grade isn't A");
            }

        }
    }
}


