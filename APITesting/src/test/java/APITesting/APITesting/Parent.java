package APITesting.APITesting;

public class Parent {
    static int x = 0;
    Parent() {
        x++;
        System.out.println("Parent constructor called");
    }
}
  class Child extends Parent {
         public Child() {
             System.out.println("Child constructor called");             
         }
         public static void main(String[] args) {
              new Parent();
              new Child();
         }
     }
