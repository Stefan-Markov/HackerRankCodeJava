package Reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Class<Student> student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }

        Collections.sort(methodNames);
        for (String name : methodNames) {
            System.out.println(name);
        }
    }

    static class Student {
        private String name;
        private String id;
        private String email;

        public String getName() {
            return name;
        }

        public Student setName(String name) {
            this.name = name;
            return this;
        }

        public String getId() {
            return id;
        }

        public Student setId(String id) {
            this.id = id;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Student setEmail(String email) {
            this.email = email;
            return this;
        }
    }
}
