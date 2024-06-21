public class Main {
    public static void main(String[] args) {

        System.out.println("This is Screen Match!\n");

        int year;
        int classification;
        double average;
        String movie;
        boolean premium;

        //Cars
        year = 2006;
        movie = "Cars";
        premium = false;
        average = (7.5 + 7 + 9.5 + 10 + 10 + 9);
        classification = (int) (average/6);
        System.out.println("Movie: " + movie);
        System.out.println("Year: " + year);
        System.out.println("Premium Plan: " + premium);
        System.out.println("Classification: " + classification + " Stars");

    }
}
