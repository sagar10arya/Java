
class Conditionals
{
    public static void main(String args[])
    {
        System.out.println("Conditional Statements:");

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Ternary OPerator
        // variable = (condition) ? expressionTrue :  expressionFalse;
        int time1 = 20;
        String result = (time1 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}