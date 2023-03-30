public class Main {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();

        int secondClassValue = secondClass.printAndReturn();

        System.out.println(String.format("~~~ %d ~~~", secondClassValue));
    }
}
