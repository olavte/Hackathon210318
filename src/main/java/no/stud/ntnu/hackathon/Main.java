/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.stud.ntnu.hackathon;
import no.stud.ntnu.hackathon.TempSensor;
/**
 * 
 * @author Andreas
 */
public class Main {
    public static void main(String[] args) {
        TempSensor tempSensor = new TempSensor("Team 1 Temp");
        ProxSensor proxSensor = new ProxSensor("Team 1 Prox");
        TouchSensor touchSensor = new TouchSensor("Team 1 Touch");
        System.out.println(touchSensor.getBatteryStatus());
        System.out.println(touchSensor.getSignalStrength());
    }
}
