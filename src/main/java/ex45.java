import java.io.*;

import java.util.*;

// defining the class NameSorter

public class ex45

{

// defining the readNames() function to read the data from Scanner object to the ArrayList

    public static void readNames(Scanner input, ArrayList<String> names)

    {

// reading the data till the file has nextLine

        while(input.hasNextLine())

        {

// adding the read line to the list of names

            names.add(input.nextLine());

        }

    }

// defining the function to print the names in the file

    public static void outputNames(ArrayList<String> names) throws IOException

    {

// creating a FileWriter for the output file

        FileWriter output = new FileWriter(new File("exercise45_output.txt"));

// wrting the header of the output file about how many names are read from the input file

        output.write("Total of " + names.size() + " names\n");

        output.write("--------------------\n");

// writing the names in the file after the header and separator

        for(String i: names)

        {

            output.write(i+"\n");

        }

// closing the output FileWriter to avoid memory leakage

        output.close();

    }

    public static void main(String[] args) throws FileNotFoundException

    {

// creating an scanner object to read from input file

        Scanner inputFile = new Scanner(new File("exercise45_input.txt"));

// declaring an ArrayList for storing the names

        ArrayList<String> names = new ArrayList<String>();

// reading the names from the input file by calling the readNames() functin

        readNames(inputFile, names);

// sorting the list of names using sort function

        Collections.sort(names);

// closing the scanner object after reading the file

        inputFile.close();

// wrting the required data to the output file

        try

        {

            outputNames(names);

        }

// if any exception is raised in writing to the output file then printing the exception on the console

        catch(Exception e)

        {

            System.out.println(e);

        }



    }

}