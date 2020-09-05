package com.company;

public class Autor {
        private  String name;
        private char gender;
        private String email;

    public Autor(String name, char gender) {
        this.name=name;
        this.gender=gender;
    }


    public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }
        public String toString(){
            return "Автор "+this.name+"  "+"Адрес электронной почты "+this.email+"Его пол "+this.gender;
        }

    }

