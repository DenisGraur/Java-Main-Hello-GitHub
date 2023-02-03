import java.util.*;

public class Main implements Animals{

    public void method1() {
        System.out.println("this is the method1");
    }
    public static void main(String[] args) {
        System.out.println("Hello Github");

        Main obj1 = new Main();
        obj1.method1();
    }
}

interface Animals{
    public void method1();
}