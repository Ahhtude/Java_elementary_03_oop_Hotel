package Java_Home_Tasks.Lesson_02;

public class Java_02_Home_Tasks04 {
    public static void main(String[] args) {
        int heigh = 10;
        int width = 20;
        for (int i = 0; i < heigh; i++)
        {

            for (int j = 0; j < width; j++)
            {
                if (i>0 && i<9)
                {
                    width=2;
                }
                else width=20;
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
