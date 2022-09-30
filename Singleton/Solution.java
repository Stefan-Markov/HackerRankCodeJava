package Singleton;

public class Solution {
    public static void main(String[] args) {
    }

    static class Singleton {
        private Singleton() {
        }

        public String str;
        private static Singleton instance = null;

        public Singleton getSingleInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}
