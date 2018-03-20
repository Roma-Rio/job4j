package ru.job4j.inheritance;
/**
 *Class Profession.
 *
 *@author Ramil' Gilyazev.
 *@version task 2.1.
 *@since 16.03.2018.
 */
public class Profession {
    String name;
    String title;
    int experience;
    String specialty;
	
    public String getName(String name) {
        return this.name;
    }
	
    public String getTitle(String title) {
        return this.title;
    }
}