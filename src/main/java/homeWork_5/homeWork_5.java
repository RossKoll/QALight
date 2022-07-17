package homeWork_5;

import java.util.ArrayList;
import java.util.List;

public class homeWork_5 {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<Integer> myListEmpty = new ArrayList<>();
        myList.add(2);
        myList.add(44);
        myList.add(13);
        myList.add(27);

        List<Integer> listForReverse = new ArrayList<>();
        listForReverse.add(1);
        listForReverse.add(3);
        listForReverse.add(5);

        // Return and print MAX value in list
        int maxValueInList = findMaxValueInList(myList);
        System.out.println("Max value in list " + myList + " is : " + maxValueInList);

        // Return and print '0' in case list is empty
        int maxValueInList2 = findMaxValueInList(myListEmpty);
        System.out.println("Max value in list " + myListEmpty + " is : " + maxValueInList2);

        // Print reversed list and return it to 'listAfterRevers' variable
        List<Integer> listAfterRevers = listPrint(listForReverse);
    }

    public static int findMaxValueInList(List<Integer> listInteger) {
        //MAX element of array
        if (listInteger.size() == 0){
            return 0;
        }else {
            int max = listInteger.get(0);
            for (int i = 1; i < listInteger.size(); i++) {
                if (listInteger.get(i) > max) {
                    max = listInteger.get(i);
                }
            }
            System.out.println(max);
            return max;
        }
    }

    public static List<Integer> listPrint(List<Integer> list){
        for (int k = 0, j = list.size() - 1; k < j; k++)
        {
            list.add(k, list.remove(j));
        }
        System.out.println("List after revers : " + list);
        return list;
    }
}


