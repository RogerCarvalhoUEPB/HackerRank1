package ThirtyDaysChallenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Day03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine().trim());
        if(num%2 ==  0){
            if(num>=2 & num<=5){
                System.out.println("Not Weird");
            }else if(num>=6 & num<=20){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");

        }
        bufferedReader.close();
    }
}
