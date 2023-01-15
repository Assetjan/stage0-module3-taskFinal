package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int last = (number%10)*100;
        int middle = ((number/10)%10)*10;
        int first = number/10;
        int sum = last + middle + first;
    }
}
