//Write a java to demonstare super keywo
class Grandfather {
    public void display() {
        System.out.println("This is an instance of Grandfather class");
    }
}
class Father extends Grandfather {
    @Override
    public void display() {
        super.display();
        System.out.println("This is an instance of Father class, which extends Grandfather");
    }
}
public class DemoSuper extends Father {
    @Override
    public void display() {
        super.display();
        System.out.println("This is an instance of DemoSuper class, which extends Father");
    }

    public static void main(String[] args) {
        DemoSuper demo = new DemoSuper();
        demo.display();
    }

    
}
