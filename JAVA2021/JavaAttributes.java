public class JavaAttributes {
    String fname = "Sahana";
    String lname = "Krishnan";
    int age = 17;

    public static void main(String[] args){
        JavaAttributes myObj = new JavaAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }

}