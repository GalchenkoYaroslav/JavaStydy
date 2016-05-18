package cats;

/**
 * Created by Yaroslav on 19.04.2016.
 */
public class Cat {
  public   Cat(){
    //    System.out.println("Hello Cat");
    }

    public void sayHello(){
         System.out.println("Hello Tom!");
     }


    private String name;
    public int age = 20;
    protected String adress;
    String fatherName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

