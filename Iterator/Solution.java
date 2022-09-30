package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {
    static ArrayList<?> func(ArrayList<?> mylist) {
        mylist.removeIf(element -> element instanceof Integer || "###".equals(element));
        return mylist;
    }

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        ArrayList<?> newList = func(mylist);
        Iterator<?> it = newList.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
