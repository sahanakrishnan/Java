abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("ZZZ");
    }
}

class Pig extends Animal {
    public void animalSound() { 
        System.out.println("the pig says: oink");
    }
}

class JavaAbstraction {
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}