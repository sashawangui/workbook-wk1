package pluralsight;

public class MathApp {
    public static void main(String[] args){
        double bobSalary = 75000 ;
        double garySalary = 102000;

        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("1.The highest salary is " + highestSalary);

        double carPrice = 25000;
        double truckPrice = 48300;

        double cheaperCar = Math.min(carPrice, truckPrice);
        System.out.println("2.The cheaper car is " + cheaperCar);

        // Area of a circle is pi * r squared
        // java has a math method of the pi constant
        double circleRadius = 7.25;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        System.out.println("3.The area of the circle is " + circleArea);

        //java has an inbuilt method for square root
        double numberVariable = 5.0;
        double numVariableSqrRoot = Math.sqrt(numberVariable);
        System.out.println("4. The square root of " + numberVariable + " is " + numVariableSqrRoot);

        //distance between 2 points with point one being (x1, y1) and point 2 being (x2, y2)
        // is calculated by doing (x2 - x1) squared + (y2 - y1) squared, then finding the square root*/
        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow((x2-x1), 2)) + Math.pow((y2-y1),2);
        System.out.println("5. The distance between these points is " + distance);

        double absoluteformVariableNum = -3.8;
        double absoluteVariableNum = Math.abs(absoluteformVariableNum);
        System.out.println("6. The absolute value of " + absoluteformVariableNum + " is " + absoluteVariableNum);

        double randomNum = Math.random();
        System.out.println("7. The random number is " + randomNum);

        int days = 24;
        int hrsPerDay = 24;
        int minPerHour = 60;
        int secPerMin = 60;
        int msPerSec = 1000;

        int totalNumHrs = days * hrsPerDay;
        int totalMin = totalNumHrs * minPerHour;
        int totalSecs = totalMin * secPerMin;
        long totalMs = totalSecs * msPerSec;
        System.out.println("There are " + totalMin + " minutes and " + totalMs + " milliseconds in 24 days");


    }
}
