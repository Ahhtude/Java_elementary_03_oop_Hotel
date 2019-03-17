package Java_Home_Tasks.Lesson_02;

import java.util.Random;

public class Java_02_Home_Tasks02 {
    public static void main(String[] args) {


        int min = 0;
        int max = 10;
        Random random = new Random();
        int var = random.nextInt(max - min) + min;
        System.out.println(var);
        int factorial =1;
        for (int i=1;i<=var;i++)
        {
            factorial*=i;
        }
        System.out.println(factorial);


    }
}
