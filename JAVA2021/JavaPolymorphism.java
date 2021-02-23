
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("pigs say wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Dogs say woof");
}
}