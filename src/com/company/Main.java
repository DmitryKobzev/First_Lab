package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
import java.text.*;

public class Main {
    public static void main(String []args){
        try {
            Act_ln call = new Act_ln();
            call.act_ln();
        }
        catch(InputMismatchException a){
           System.out.println("Error!!!!!");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        }
    }


