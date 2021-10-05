/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


package ex43;

import java.io.*;

import java.util.Scanner;

public class ex43

{

    public static void main (String[] args )
    {

        Scanner reader = new Scanner(System.in);
        String location;
        String site_name;
        String author;

        char java_script = 'N';
        char css = 'N';

        System.out.print("Site name: ");
        site_name = reader.nextLine();

        System.out.print("Author: ");
        author = reader.nextLine();

        System.out.print("Do you want a folder for JavaScript? (y for yes , n for no): ");
        java_script = reader.next().charAt(0) ;

        System.out.print("Do you want a folder for CSS? (y for yes , n for no): ");
        css = reader.next().charAt(0);

        location = System.getProperty("user.dir");
        location += "\\"+site_name;

        File site = new File(location );

        boolean site_done = site.mkdir();
        if(site_done )

        {
            System.out.println("Created " + location );

            try
            {
                FileWriter skeletonWriter = new FileWriter(new File(location+"\\index.html"));
                skeletonWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                skeletonWriter.write("\t<meta author=\""+author+"\">\n");
                skeletonWriter.write("\t<title>"+site_name+"</title>\n");
                skeletonWriter.write("</head>\n<body>\n\n</body>\n</html>");
                skeletonWriter.close();

                System.out.println("Created " + location+"\\index.html");
                if(java_script == 'y' || java_script == 'Y')

                {
                    File java_script_folder = new File(location+"\\js");
                    boolean java_script_done = java_script_folder.mkdir();

                    if(java_script_done )

                    {
                        System.out.println("Created " + java_script_folder+"\\");
                    }

                    else

                    {
                        System.out.println("Java script folder is not created successfully. ");
                    }

                }


                if(css == 'y' || css == 'Y')
                {
                    File css_folder = new File(location+"\\css");
                    boolean css_done = css_folder.mkdir();
                    if(css_done )
                    {
                        System.out.println("Created " + css_folder+"\\");
                    }

                    else
                    {
                        System.out.println("css folder is not created successfully.");
                    }

                }

            }


            catch(IOException except )
            {
                System.out.println("index.html is not created successfully. ");
            }

        }

        else
        {
            System.out.println("site folder is not created successfully. ");
        }

        reader.close();

    }


}
