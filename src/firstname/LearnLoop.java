package firstname;

public class LearnLoop {


    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }



        for (int i = 1; i <= 10; i++) {
            System.out.println("I love New year");
        }



        for (int i = 15; i <= 20; i++) {
            System.out.println(i);
        }



        for (int n=8; n<=28; n=n+8) {
            System.out.println(n);
        }



      /// Identifying even and odd numbers
        //
        //        for(int i =1; i <=20; i++) {
        //
        //            if (i % 2 ==0) {
        //                System.out.println(i + " is an even number.");
        //            } else {
        //                System.out.println(i + " is an odd number.");
        int j=20;
        while(j<=30) {
            System.out.println(j);
            j = j + 2;
        }




        int m=100;
        while(m<=1000){
            System.out.println(m);
            m=m+50;
        }


        int o=12;
        while(o<=277){
            System.out.println(o);
            o = o + 50;
        }


        //1. While loop VS Do while Loop
        //2. while loop VS For Loop
        //3. For each loop ?

        // Do while Loop




        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k<=10);




        int l =50;
        do {
           System.out.println(l);
           l++;
        } while (l<=500);




       int p = 15;
       do {
           System.out.println(p);
           p = p + 85;
       }
       while (p<=850);




       int h = 100;
       do{
           System.out.println(h);
           h=h+25;
       }
       while(h<=1250);

    }
}