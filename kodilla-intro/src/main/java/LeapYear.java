public class LeapYear {
    public static void main(String[] args) {
        int yourNumber = 2020;
        if (yourNumber % 4 == 0) {
            if (yourNumber % 100 == 0) {
                if (yourNumber % 400 == 0) {
                    System.out.println("the year is a leap year");

                } else {
                    System.out.println("the year is not a leap year");
                }
            } else {
                System.out.println("the year is a leap year");

            }




        } else {
            System.out.println("the year is not a leap year");
        }

    }
}