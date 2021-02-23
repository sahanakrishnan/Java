
public class MethodOverloading {
    String name = "";

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.name = ";";
        methodOverloading.myMethod(1);
    }

    int myMethod(int x) {
        System.out.println("Int  " + x + name);
        return x;
    }

    float myMethod(float x) {
        System.out.println("Float " + x);
        return x;
    }

    double myMethod(double x) {
        System.out.println("double " + x);
        return x;
    }

}