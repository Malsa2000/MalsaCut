package com.example.malsacut;

class comment {

    String titel , descreption , name_person;

    public comment(String titel, String name_person, String descreption) {
        this.titel = titel;
        this.descreption = descreption;
        this.name_person = name_person;
    }

    public String getTitel() {
        return titel;
    }

    public String getName_person() {
        return name_person;
    }

    public String getDescreption() {
        return descreption;
    }
}
