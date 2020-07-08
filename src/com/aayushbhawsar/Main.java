package com.aayushbhawsar;
import java.util.Arrays;
import java.util.Scanner;
public class Main {


    static boolean arePermutation(String str1, String str2) {

        int n1 = str1.length();
        int n2 = str2.length();

         if (n1 != n2)
               return false;
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            for (int i = 0; i < n1; i++)
                if (ch1[i] != ch2[i])
                    return false;


            return true;
        }





        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);


            System.out.println("Enter number of testcase ");
            boolean hasnextint =scanner.hasNextInt();

            if(hasnextint) {
                int ts = scanner.nextInt();
                scanner.nextLine();

                if (ts > 0 && ts <= 100) {

                    for (int i = 1; i <= ts; i++) {

                        System.out.println("Enter string 1 ");
                        String str1 = scanner.nextLine();

                            System.out.println("Enter string 2 ");
                            String str2 = scanner.nextLine();

                        if (str1.length() < 100000 && str2.length()<100000) {


                            if (arePermutation(str1, str2))
                                System.out.println("Yes");
                            else
                                System.out.println("No");
                        }else {
                            System.out.println("invalid");
                        }

                    }
                }else{
                        System.out.println("invalid");
                    }
                }

//            System.out.println("Enter string 1 ");
//            String str1 = scanner.nextLine();
//
//            System.out.println("Enter string 2 ");
//            String str2 = scanner.nextLine();
//
//
//            if (arePermutation(str1, str2))
//                System.out.println("Yes");
//            else
//                System.out.println("No");



        }
    }

