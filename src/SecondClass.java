public class SecondClass {
    int myNumber = 23;

    public int printAndReturn(){
        System.out.println(String.format("--- %d ---", myNumber));
        return myNumber;
    }
}
