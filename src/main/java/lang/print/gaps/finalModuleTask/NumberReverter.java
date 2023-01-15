package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int abc;
        while (number != 0 ) {
            abc = number%10;
            System.out.print(abc);
            number /= 10;
        }
    }
}
