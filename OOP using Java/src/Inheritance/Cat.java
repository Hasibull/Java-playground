
package Inheritance;

public class Cat  extends Animal{
    public void voice() {
        System.out.println("Mew Mew.........");
    }
    
    @Override
    public void eating() {
        System.out.println("Cat is eating.........");
    }
}
