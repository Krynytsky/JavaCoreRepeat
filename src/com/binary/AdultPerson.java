package com.binary;

public class AdultPerson extends Person {
        private int passportID;

        public AdultPerson(){}
        public AdultPerson(int passportID){
            this.passportID=passportID;
        }

    public AdultPerson(String name, int age, int passportID) {
        super(name, age);
        this.passportID = passportID;
    }

    public int getPassportID() {
        return passportID;
    }

    public void setPassportID(int passportID) {
        this.passportID = passportID;
    }

    @Override
    public String toString() {
        return "AdultPerson{" +
                "passportID=" + passportID +
                "} " + super.toString();
    }
}
