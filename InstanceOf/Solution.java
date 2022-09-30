package InstanceOf;

import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) list.add(new Student());
            if (s.equals("Rockstar")) list.add(new Rockstar());
            if (s.equals("Hacker")) list.add(new Hacker());
        }
        System.out.println(InstanceOf.count(list));
    }

    static class Student {
    }

    static class Rockstar {
    }

    static class Hacker {
    }


    static public class InstanceOf {
        static String count(ArrayList<Object> list) {
            int a = 0, b = 0, c = 0;
            for (int i = 0; i < list.size(); i++) {
                Object element = list.get(i);
                if (element instanceof Student)
                    a++;
                if (element instanceof Rockstar)
                    b++;
                if (element instanceof Hacker)
                    c++;
            }
            return a + " " + b + " " + c;
        }
    }
}
