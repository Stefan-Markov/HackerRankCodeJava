package InheritanceII;

public class Solution {
    public static void main(String[] args) {

        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getSimpleName());

        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }


    static private class Arithmetic {

        public int add(int a, int b) {
            return a + b;
        }
    }

    static private class Adder extends Arithmetic {

    }
}
