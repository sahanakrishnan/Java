
class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Honk");

    }
}

class Car extends Vehicle {
    private String modelName = "mustang";
    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName); 
        
    }

}