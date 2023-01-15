package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int abc;
        int sum = 0;
        while (number != 0) {
             abc = number%10;
             sum += abc;
             number /= 10;
        }
        System.out.println(sum);
    }
}
