package main;

import media.Television;
import media.Radio;

public class Main {

    public static void main(String[] args) {
        Television Panasonic = new Television();
        Panasonic.info();
        
        Panasonic.setIsTurnedOn(true);
        Panasonic.setVolume(34);
        Panasonic.setCurrentProgram(5);
        
         Panasonic.info();
         
         Radio  myRadio = new Radio();
         myRadio.info();
         
         myRadio.setAmFrequency(200);
         myRadio.setFmFrequency(26.2);
         myRadio.setBand('A');
         myRadio.info();
         
         Radio myRadio2 = new Radio(22.9, 150, 'F');
         myRadio2.info();
        
    }
    
}
