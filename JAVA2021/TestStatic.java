
public class TestStatic {
    public static void main(String[] args) {
        // Access Static:
        System.out.println(" Access Static " + StaticClass.i);
        StaticClass.i = 6;
        System.out.println(" Access Static " + StaticClass.i);
        StaticClass objStatic = new StaticClass();
        objStatic.i = 7;
        System.out.println(" Access Static " + objStatic.i);
        System.out.println(" Access Static " + StaticClass.i);

        NonStatic ns1 = new NonStatic();
        ns1.i = 6;
        NonStatic ns2 = new NonStatic();
        ns2.i = 7;

        System.out.println(" Access non Static " + ns1.i);
        System.out.println(" Access non tatic " + ns2.i);

    }

}