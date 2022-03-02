public class mainClass {

    /**
     * Adds two numbers.
     * @param a first argument
     * @param b second argument
     * @return sum of arguments
     */
    static int policz(int a, int b) {
        return a * b;
    }

    /**
     * Starts the program.
     * @param args program parameters
     */
    public static void main(String[] args) {
        System.out.println("W pierwszym branchu; 2+3=" + policz(2, 3));
    }
}
