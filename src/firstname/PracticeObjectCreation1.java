package firstname;
public class PracticeObjectCreation1 {
    public void doSumOfMultiples(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                sum=sum+i;
            }
        }
        System.out.println(sum);

    }
    public static  void main(String[] args) {
    PracticeObjectCreation obj=new PracticeObjectCreation();
    obj.doSumOfMultiples(1000);

    }
}
