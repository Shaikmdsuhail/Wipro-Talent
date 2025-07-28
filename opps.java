class A extends C {
    @Override
    public String display() {
        return "This is an instance of class A";
    }
}
class B extends A {
    @Override
    public String display() {
        return "This is an instance of class B, which extends A";
    }
}
interface I {
    String display();
}


abstract class C {
    public abstract String display();
}

public class opps implements I {
    @Override
        public String display() {
            return "This is an instance of OOPS class implementing interface I";
        }
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Object of class A created: " + a);
        B b = new B();
        System.out.println("Object of class B created: " + b);
        a.display();
        b.display();
        
        opps oops = new opps();
        System.out.println(oops.display());
    }
}