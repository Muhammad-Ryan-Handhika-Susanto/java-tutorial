package com.tutorial;

import javax.lang.model.element.Name;

import org.w3c.dom.Text;

class mahasiswa{
    // Data Member
    String name = "masukan nama";
    String NIM;

    // constructor
    mahasiswa(String inputName, String inputNIM){
        this.name = inputName;
        this.NIM = inputNIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.name);
        System.out.println("NIM : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setName(String name){
        this.name = name;
    }

    // method dengan return tapi tidak ada parameter nya
    String getName(){
        return this.name;
    }
    String getNIM(){
        return this.NIM;
    }

    // method dengan return dan parameter
    String sayHai(String message){
        return "hai " + message + ", nama saya " + getName();
    }
}

class dosen{
    String name;

    dosen(String name){
        this.name = name;
    }
}

public class method {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("Ryan", "123456");
        mahasiswa1.show();
        mahasiswa1.setName("Handhika");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getName());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHai("ganteng");
        System.out.println(data);

        dosen dosen1 = new dosen("Akang");
    }
}
