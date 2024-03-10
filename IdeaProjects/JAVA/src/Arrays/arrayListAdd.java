package Arrays;

import java.util.ArrayList;

public class arrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list+" "+list.size());
        list.add(11);
        System.out.println(list+" "+list.size());
        list.add(224);
        System.out.println(list+" "+list.size());
        list.add(43);
        System.out.println(list+" "+list.size());
        list.add(345);
        System.out.println(list+" "+list.size());
        list.remove(1);
        System.out.println(list+" "+list.size());




    }
}
