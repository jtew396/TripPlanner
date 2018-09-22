import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {

        intro();
        budget();
        time();
        distance();

    }

    public static void intro(){
        Scanner input=new Scanner(System.in);
        // Takes in user name and destination

        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.println("Nice to meet you " + name);
        System.out.print("Where are you traveling? ");
        String destination = input.nextLine();

        System.out.println("Great! " + destination + " sounds like a great trip!");
        System.out.println(" ");

    }

    public static void budget(){
        Scanner input=new Scanner(System.in);
        // Takes in days planned on trip, allowance, and converting info

        System.out.print("How many days are you going to spend traveling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double exchange = input.nextDouble();

        // Calculate the total hours in the trip
        int hours = days * 24;

        // Calculate the total minutes in the trip
        int minutes = hours * 60;

        // Calculate the daily budget
        double daily = money / days;
        daily = daily * 100;
        int dailyInt = (int) daily;
        double dailyBudget = (double) dailyInt / 100.0;

        // Calculate the money in the travel destination currency
        double exchangeMoney = money * exchange;
        exchangeMoney = exchangeMoney * 100;
        int exchangeMoneyInt = (int) exchangeMoney;
        exchangeMoney = (double) exchangeMoneyInt / 100.0;

        // Calculate the daily budget in the travel destination currency
        double dailyExchangeMoney = exchangeMoney / days;
        dailyExchangeMoney = dailyExchangeMoney * 100;
        int dailyExchangeMoneyInt = (int) dailyExchangeMoney;
        dailyExchangeMoney = (double) dailyExchangeMoneyInt / 100.0;

        System.out.println(" ");
        System.out.println("If you are travelling for " + days + " that is the same as " + hours + " hours or "
                + minutes + " minutes.");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $"
                + dailyBudget + " USD.");
        System.out.println("Your total budget in " + symbol + " is " + exchangeMoney + " " + symbol +
                ", which per day is " + dailyExchangeMoney + " " + symbol + ".");
        System.out.println(" ");

    }

    public static void time(){
        Scanner input=new Scanner(System.in);
        // Takes in the time difference between home and destination

        System.out.print("What is the time difference, in hours, between your home and destination? ");
        int difference = input.nextInt();
        difference = difference % 24;
        int differenceNoon = (difference + 12) % 24;
        System.out.print("That means that when it is midnight at home it will be " + difference + ":00 in your " +
                "travel destination and when it is noon at home it will be " + differenceNoon + ":00.");
        System.out.println(" ");

    }

    public static void distance(){
        Scanner input=new Scanner(System.in);
        // Takes in distance between home and destination in square kilometers
        // and converts it into square miles

        // Kilometers*0.62137 = miles

        System.out.print("What is the square distance of your destination in km^2? ");
        double area = input.nextDouble();
        double areaSquareMiles = area * 0.62137;
        areaSquareMiles = areaSquareMiles * 100;
        int areaSquareMilesInt = (int) areaSquareMiles;
        areaSquareMiles = (double) areaSquareMilesInt / 100.0;
        System.out.print("In square miles that is " + areaSquareMiles + ".");
        System.out.println(" ");
    }

}
