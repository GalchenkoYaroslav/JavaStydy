package cicles;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yaroslav on 04.05.2016.
 */
public class General {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        List list = new LinkedList<>();
        linkedList.getLast();
        int [] mass = new int[100];

        int j = 0;
        while (j< 100){
            mass[j] = j+1;
            j++;
        }

//        for (int i = 0; i < 100; i++){
//            mass[i] = i + 1;
//        }
//
//        for (int i = 0; i < 100; i++){
//            System.out.println(mass[i]);
//        }

        int i = 0;
        while (i < 100) {
            if (mass[i]%5 == 0){
                System.out.println(mass[i]);
            }
            i++;
        }




    }
}
