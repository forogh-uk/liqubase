package com.example.liquibase;


import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
    private int id;

   @Column(name = "name")
   private String name;

   @Column (name="hight")
   private String height;




@Column(name = "addres")
private String address;


    public Person() {

    }

    public Person(String name, String height, String address) {

        this.name = name;
        this.height = height;

        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }


}
