/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


package ex42;
import java.util.*;
import java.io.*;

public class ex42
{

    public void results(String file)
    {
        try {
            File inFile = new File(file);
            Scanner input = new Scanner(inFile );

            while ( input.hasNext() )
            {
                String str = input.nextLine() ;
                String[] tem = str.split( ",");
                System.out.printf("%-20s%-20s%-20s\n", tem[0], tem[1], tem[2]);
            }

        }

        catch (FileNotFoundException except)
        {
            System.out.println("File is not available.."); //prints this error message if nothing is found:
        }

    }

    public static void main(String[] args)
    {
        ex42 emp = new ex42();
        System.out.printf("%-20s%-20s%-20s\n", "Last", "First", "Salary");
        System.out.println("------------------------------------------------");

        emp.results("exercise42_input.txt") ;
    }

}
