package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {//459
        int last = (number%10)*100;
        int middle = ((number/10)%10)*10;
        int first = number/100;
        int sum = last + middle + first;
        System.out.println(sum);
    }
}
