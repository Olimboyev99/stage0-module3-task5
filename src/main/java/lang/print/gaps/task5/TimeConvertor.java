package lang.print.gaps.task5;

import java.util.Scanner;

public class TimeConvertor {

    public void convert(float minutes) {
        Scanner in = new Scanner(System.in);
        minutes = in.nextFloat();
        float s = 60*minutes;
        System.out.println(s);
    }
}
