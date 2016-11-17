import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ronni on 17-11-2016.
 */
public class Business_Logic {

    public void boyGirl() throws FileNotFoundException
    {
        DAO dao = new DAO();
        Scanner input = dao.getData();
        String name = ("");
        int number = 0;
        int sum1 = 0;
        int sum2 = 0;
        int boysCount = 0;
        int girlsCount = 0;
        int count = 0;
        int difference = 0;

        while(input.hasNext())
        {
            if(count%2 == 0)
            {
                name = input.next();
                number = input.nextInt();
                sum1 += number;
                boysCount++;
                count++;
            }

            else if(count%2 == 1)
            {
                name = input.next();
                number = input.nextInt();
                sum2 += number;
                girlsCount++;
                count++;
            }
        }
        System.out.println(boysCount + " Boys, " + girlsCount + " Girls");
        if(sum1 >= sum2)
        {
            difference = sum1 - sum2;
            System.out.println("Difference between boys' and girls' sums: " + difference);
        }

        else
        {
            difference = sum2 - sum1;
            System.out.println("Difference between boys' and girls' sums: " + difference);
        }
    }
}
