package org.example.preparingcode;

import java.time.LocalDateTime;
import java.util.Arrays;

public class TestableCode {
    public static String[] knownNames = {"Zeynep", "Tess", "Marina", "Jade", "Eric", "James"};
    public static String[] specialNames = {"Zach", "Martin", "Noah", "Tess"};
    public String greeting = "";

    public String greetUser(String name){
        String greetuser = "";

        if(Arrays.stream(knownNames).anyMatch(name::equals)){
            greetuser += "I know you, " + name + ".";
            if(Arrays.stream(specialNames).anyMatch(name::equals)){
                greetuser += "You're even on VIP list!";
            }

        }else if(Arrays.stream(specialNames).anyMatch(name::equals)){
            greetuser += "I do not know you, " + name + ". But you are in our VIP list!";
        } else{
            greetuser += "stranger";
        }
        return greetuser;
    }

    public String greetDay(LocalDateTime dateTime){
        String greetDayPart = "";
        if(dateTime.getHour() >= 0 && dateTime.getHour() < 6){
            greetDayPart += "Good Night, ";
        }
        if(dateTime.getHour() >= 6 && dateTime.getHour() < 12) {
            greetDayPart += "Good Morning, ";
        }
        if(dateTime.getHour() >= 12 && dateTime.getHour() < 18){
            greetDayPart += "Good Afternoon, ";
        }
        if(dateTime.getHour() >= 18 && dateTime.getHour() <= 23 ){
            greetDayPart += "Good evening, ";
        }

        System.out.println(greetDayPart);
        return greetDayPart;
    }
}
