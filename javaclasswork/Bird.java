interface Animal{
   public void makeSound();
   public void move();
}
public class Bird implements Animal{
    public void makeSound(){
        System.out.println("Chrip");
    }
    public void move(){
        System.out.println("Fly");
    }
}
  class Dog implements Animal{
        public void makeSound(){
            System.out.println("Bark");
        }
        public void move(){
            System.out .println("Run");
        }
    }
 class Zoo{
            public static void main(String[]args){
                Bird a1=new Bird();
                a1.makeSound();
                a1.move();
                Dog a2=new Dog();
                a2.makeSound();
                a2.move();
                
            }
        }
    