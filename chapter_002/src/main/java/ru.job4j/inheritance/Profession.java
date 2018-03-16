package ru.job4j.inheritance;
/**
 *Класс Profession.
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
    public class Doctor extends Profession {
        void doHeal(Patient patient) {
        }
        void writeRecipe(Patient patient) {
        }
        void setDiagnose(Patient patient) {
        }
    }
    public class Engineer extends Profession {
        void doBuild(House house) {
         }
        void devProject(House house) {
         }
        void writeDocs(House house) {
        }
    }
    public class Teacher extends Profession {
        void giveLesson(Pupil pupil) {
        }
        void checkExcercise(Pupil pupil) {
        }
        void askHomework(Pupil pupil) {
        }
    }
    class Patient {
        int age;
        String reason;
    }
    class House {
        int volume;
        String district;
    }

    class Pupil {
        int age;
        String hobby;
    }
}