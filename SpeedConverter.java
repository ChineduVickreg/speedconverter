package udemyFullCourse.TimBuchalkaExpressionsAndStatements;
//An Application that converts the speed from kilometers to miles.

import java.util.Scanner;

public class SpeedConverter {
     Scanner scanner = new Scanner(System.in);
     double kilometersPerHour = scanner.nextDouble();


        public static long toMilesPerHour(double kilometersPerHour) {
            System.out.println("Enter a Number");
            if (kilometersPerHour < 0){
                return -1;
            }
            return Math.round(kilometersPerHour / 1.609);
        }
        public static void printConversion(double kiloMetersPerHour ){
            if (kiloMetersPerHour < 0){
                System.out.println("Invalid Value");
            }else {
                long milesPerHour = toMilesPerHour(kiloMetersPerHour);
                System.out.println(kiloMetersPerHour +
                        "km/h = " + milesPerHour +
                        "mi/h");
            }
        }
}
