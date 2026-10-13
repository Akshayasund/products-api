package uk.ac.westminster.products_api;

public class Person {

    private String name;

    private String Email;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return Email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String Email) {this.Email = Email;}
    // TODO (Activity 3): add the "email" field and its getter here.



}