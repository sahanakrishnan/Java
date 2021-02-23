enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class JavaENUM {
    public static void main(final String[] args) {
        final Level myVar = Level.LOW;

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Med level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        
        }
    }
}