public class JavaEncapsulation {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public static void main(String[] args) {
        JavaEncapsulation myObj = new JavaEncapsulation();
        myObj.setName("Sahana");
        System.out.println(myObj.getName());
    }

}