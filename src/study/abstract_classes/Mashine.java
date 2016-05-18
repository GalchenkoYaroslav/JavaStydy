package study.abstract_classes;

/**
 * Created by Yaroslav on 28.04.2016.
 */
public abstract class Mashine {

   int patroll;


    boolean hasWindow(){
        return true;
    }

    void drive(){
        System.out.println("Drive hard!");
    }

    abstract void color();

}
