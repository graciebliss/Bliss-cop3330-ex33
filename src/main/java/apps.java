/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;
import java.lang.Math;
public class apps {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String[] choices={"Yes.","No.","Maybe.","Ask again later."};

        System.out.println("What is your question?");

        String question=in.nextLine();

        int rand=(int)Math.floor(Math.random()*(3-0+1)+0);

        System.out.print(choices[rand]);
    }
}
