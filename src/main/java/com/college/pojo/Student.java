package com.college.pojo;


import java.util.Date;
import java.util.List;

public class Student extends Person{
    private List<Book> issuedBooks;

    public Student(){}
    public Student(List<Book> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    public Student(Integer id, String firstName, String lastName, Integer age, Date dateOfBirth, Address address, List<Book> issuedBooks) {
        super(id, firstName, lastName, age, dateOfBirth, address);
        this.issuedBooks = issuedBooks;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(List<Book> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }
}
