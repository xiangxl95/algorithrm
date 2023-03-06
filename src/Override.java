/**
 * @author xiangxl
 * @date 2022/6/15 12:44
 * @description:
 */
public class Override {
    public static class A {

    }

    public static class B extends A {

    }

    public void show (Object o) {
        System.out.println("Object invoke");
    }

    public void show (A a) {
        System.out.println("A invoke");
    }

    public void show (B b) {
        System.out.println("b invoke");
    }

    public void show (String s) {
        System.out.println("String invoke");
    }

    public static void main(String[] args) {
        Override override = new Override();
        A b = new B();
        override.show(b);
    }
}
