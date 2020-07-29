import java.util.*;

public class RepeatedNumList {
    public static void main(String[] args) {
        ArrayList<Integer> intNums = new ArrayList<Integer>();
        intNums.add(5);
        intNums.add(5);
        intNums.add(5);
        intNums.add(6);
        intNums.add(8);
        intNums.add(6);
        intNums.add(10);
        intNums.add(10);
        System.out.println("List of integer numbers:" + intNums);

        ArrayList<Integer> repeatedNumList = new ArrayList<Integer>();
        for (Integer str : intNums) {
            if (Collections.frequency(intNums, str) > 1) {
                repeatedNumList.add(str);
            }
        }
        System.out.println("Repeated numbers in a list:" + repeatedNumList.toString());
    }
}
