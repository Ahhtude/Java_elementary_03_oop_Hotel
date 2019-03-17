package Java_Home_Tasks.Lesson_02;

import java.util.Random;

public class Java_02_Home_Tasks01 {

    public static void main(String[] args) {
        Random random = new Random();
        int minBound = 0;
        int maxBound = 100;
        int [] newArray = new int[random.nextInt(maxBound-minBound)+minBound];
        minBound = 100;
        maxBound = 10000;

        for (int i=0;i<newArray.length;i++)
        {
            newArray[i]=random.nextInt(maxBound-minBound)+minBound;
        }

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i=0; i<newArray.length;i++)
        {
            if (minValue>newArray[i])
            {
                minValue=newArray[i];
            }
        }
        for (int i=0; i<newArray.length;i++)
        {
            if (maxValue<newArray[i])
            {
                maxValue=newArray[i];
            }
        }
        System.out.println(minValue);
        System.out.println(maxValue);

    }
}
