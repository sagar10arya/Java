import java.util.*;

/* 
********Java ArrayList********
- ArrayList class is a resizable array, found in the java.util package.
- Elements in an ArrayList are actually objects

*/

class arrayList
{
    public static void main(String args[])
    {
        // Collection<Integer> nums = new ArrayList<Integer>();
        /*
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);

        System.out.println(nums.get(2));

        for (int num : nums) {
            System.out.println(num);
        }
        */

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);  // Sorts alphabetically or numerically

        System.out.println(cars);

    }
}