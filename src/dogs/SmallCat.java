package dogs;

import cats.Cat;

/**
 * Created by Yaroslav on 19.04.2016.
 */
public class SmallCat extends Cat  {

    int age;
   public SmallCat(){
//       super();
//        System.out.println("Hello Small Cat");
    }


    void setAge(int age){
        this.age = age;
    }


    @Override
    public void sayHello(){
        System.out.println("Hello Vaska!");
        System.out.println(age);
    }


        void goCat() {
            SmallCat smallCat = new SmallCat();
        }

}
