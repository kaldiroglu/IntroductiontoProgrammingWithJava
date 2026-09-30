package dev.kaldiroglu.java.ip.solution.ch10;

import java.util.Scanner;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 * </p>
 * This is an example about if-else if-else.
 */
public class AgeClassifier {

    void main() {
        System.out.println("This program classifies people based on their ages.");
        System.out.println("Here are the ranges:");
        System.out.println(" 1-12 : Child \n 13-30: Young \n 31-49: Middle age \n 60-  : Old \n");
        System.out.println("Enter 0 to exit.");

        int babyCount = 0;
        int teenagerCount = 0;
        int childCount = 0;
        int youngCount = 0;
        int middleAgeCount = 0;
        int oldCount = 0;

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the age:");
            int age = in.nextInt();

            if (age <= 0 || age > 120)
                break;
            else if (age <= 3)
                babyCount++;
            else if ((4 <= age) & (age <= 12))
                childCount++;
            else if ((13 <= age) & (age <= 19))
                teenagerCount++;
            else if ((20 <= age) & (age <= 30))
                youngCount++;
            else if ((31 <= age) & (age <= 59))
                middleAgeCount++;
            else
                oldCount++;
        }

        System.out.println("Here is the classification:");
        System.out.println("There are " + babyCount + " babies.");
        System.out.println("There are " + childCount + " children.");
        System.out.println("There are " + youngCount + " young people.");
        System.out.println("There are " + middleAgeCount + " middle age people.");
        System.out.println("There are " + oldCount + " old people.");
    }
}
