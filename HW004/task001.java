package hw_004.task001;
// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Collection;


public class task001 {
    public static void main(String[] args) {
        LinkedList<Integer> startList = new  LinkedList<Integer>();

        startList.add(1);
        startList.add(2);
        startList.add(3);
        System.out.println("Start list" + startList);
        LinkedList<Integer> rl = reverseLinkedList(startList);
        System.out.println("Reverse list:" + rl);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> rl = new LinkedList<>();

        for (int i = list.size() -1; i >= 0; i--) {
            int el = list.get(i);
            rl.add(el);
        }
        return rl;
    }
}    


