package com.company;

public class EqualsAndHashcodeTest {
    static void main() {
        Person person1 = new Person(01,"Isha",22);
        Person person2 = new Person(01,"Isha",22);

        if(person1.equals(person2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
