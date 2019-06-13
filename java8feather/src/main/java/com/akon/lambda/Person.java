package com.akon.lambda;

import java.time.LocalDate;

/**
 * @since 1.8+
 */
public class Person {

    public enum Sex{
        /**
         * 女性
         */
        MALE,
        /**
         * 男性
         */
        FEMALE
    }

    String name;
    LocalDate localDate;
    Sex gender;
    String emailAddreee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddreee() {
        return emailAddreee;
    }

    public void setEmailAddreee(String emailAddreee) {
        this.emailAddreee = emailAddreee;
    }

    public int getAge(){
        return 18;
    }

    public void printPerson() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", localDate=" + localDate +
                ", gender=" + gender +
                ", emailAddreee='" + emailAddreee + '\'' +
                '}';
    }
}
