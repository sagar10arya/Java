
class Work
{
    public static void main(String[] args)
    {
        System.out.println("Switch Statements in Java");
        

        String day = "Monday";

        switch(day)
        {
            case "Saturday", "Sunday" -> System.out.println("Wake up at 9 AM");
            case "Tuesday" -> System.out.println("Wake up at 5 AM");
            default -> System.out.println("Wake up at 7 AM");
        }

        // Another way or old way -> both are fine

        int day1 = 4;
        switch (day1) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }
    }
}