package com.tutorial;

class example{
    String name;
    int age;
    String address;
    
    // creating constructor method in java
    // constructor akan di panggil pertama kali pada saat objek dibuat
    example(String inputName, int inputAge, String inputAddress) {
        name = inputName;
        age = inputAge;
        address = inputAddress;

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
    
}

public class constructor {
    public static void main(String[] args) {
        example siswa1 = new example("Ryan", 17, "Pondok Cikampek");
    }
}
