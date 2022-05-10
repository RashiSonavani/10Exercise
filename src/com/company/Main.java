package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

        public class ShowFile
        {

            public static void main(String[] args) throws IOException {

                FileInputStream fis;
                int bajt;

                try
                {
                    fis = new FileInputStream("showtime.txt");

                }
                catch (FileNotFoundException e)
                {
                    System.out.println("Sorry! File not found");
                    return;
                }


                try
                {

                    do
                    {
                        bajt = fis.read();
                        if (bajt != -1) System.out.print((char) bajt);
                    }

                    while (bajt != -1);

                }
                catch (IOException e)
                {
                    System.out.println("Error reading Tile");
                }
                finally {
                    try
                    {
                        fis.close();
                        System.out.println("Sorry Closed");

                    }

                    catch (IOException e)
                    {
                        System.out.println("Error in File");
                    }

                }

            }
        }

    }
