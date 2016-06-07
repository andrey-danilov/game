package com.company;

/**
 * Created by Andrey on 02.06.2016.
 */
public class fighter {
    public  static double tempDefense;
    public  static double tempAttack;
    public  static double templesionDefense;

    public static double allDefense;
    public static double allAttack;

    public static head Head = new head(100,30,"Head");
    public static body Body = new body(140,0, "Body");
    public static hand Lhand = new hand(300,20, "Left hand");
    public static hand Rhand = new hand(300,30, "Right hand");
    public static boot Lboot = new boot(200,30, "Left leg");
    public static boot Rboot = new boot(200,50, "Right leg");


    fighter(){
        tempDefense=0;
        tempAttack=0;
        allDefense = Head.HeadDefense+Body.BodyDefense+Lhand.handDefense+Rhand.handDefense+Lboot.bootDefense+Rboot.bootDefense;
        allAttack=  Head.headAttack+Body.bodyAttack+Lhand.handAttack+Rhand.handAttack+Lboot.bootAttack+Rboot.bootAttack;
    }
    public static String[] body_part(){
        String[] temp;
        temp = new String[]{Head.name, Body.name, "Left hand", Rhand.name, Lboot.name, Rboot.name};
        return temp;
    }



}
