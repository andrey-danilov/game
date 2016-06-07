package com.company;

import javax.swing.*;
import java.awt.*;



public class Main {
    public static fighter left = new fighter();
    public static fighter right = new fighter();
    public static JPanel panel;


    public static JLabel left_fighter = new JLabel( new ImageIcon("C:\\Users\\Andrey\\Desktop\\game\\src\\com\\company\\l.png"));
    public static Choice left_defense;
    public static Choice left_Attack;
    public static Choice left_lesion;
    public static JButton left_confirm;
    public static Label L_w_hit = new Label("Where to kick?");
    public static Label L_w_protect = new Label("What to protect?");
    public static Label L_y_hit = new Label("How to kick??");
    public static Label left_Head_HeadDefense= new Label();
    public static Label left_Body_BodyDefense= new Label();
    public static Label left_Lhand_LhandDefense= new Label();
    public static Label left_Rhand_RhandDefense= new Label();
    public static Label left_Lboot_LbootDefense= new Label();
    public static Label left_Rboot_RbootDefense= new Label();
    public static Label l_allD = new Label();



    public static JLabel right_fighter = new JLabel( new ImageIcon("C:\\Users\\Andrey\\Desktop\\game\\src\\com\\company\\r.png"));
    public static Choice right_defense;
    public static Choice right_Attack;
    public static Choice right_lesion;
    public static JButton right_confirm;
    public static Label R_w_hit = new Label("Where to kick?");
    public static Label R_w_protect = new Label("What to protect?");
    public static Label R_y_hit = new Label("How to kick?");
    public static Label R_Head_HeadDefense= new Label();
    public static Label R_Body_BodyDefense= new Label();
    public static Label R_Lhand_LhandDefense= new Label();
    public static Label R_Rhand_RhandDefense= new Label();
    public static Label R_Lboot_LbootDefense= new Label();
    public static Label R_Rboot_RbootDefense= new Label();
    public static Label R_allD = new Label();

    public static JButton progress;
    public static String[] arr_name_body_part=fighter.body_part();


    public static void main(String[] args) {



        JFrame frame = new JFrame("Fight club");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        panel = new JPanel();
        panel.setLayout(null);
        left_defense = new Choice();
        left_Attack = new Choice();
        left_lesion = new Choice();

        right_defense = new Choice();
        right_Attack = new Choice();
        right_lesion = new Choice();
        for (int i=0; i<arr_name_body_part.length; i++) {
            left_defense.addItem(arr_name_body_part[i]);
            left_Attack.addItem(arr_name_body_part[i]);
            left_lesion.addItem(arr_name_body_part[i]);
            right_defense.addItem(arr_name_body_part[i]);
            right_Attack.addItem(arr_name_body_part[i]);
            right_lesion.addItem(arr_name_body_part[i]);

        }

        progress = new JButton("progress");
        left_confirm= new JButton("confirm");
        right_confirm= new JButton("confirm");

        left_confirm.addMouseListener(new left_confirm_lis());
        right_confirm.addMouseListener(new right_confirm_lis());
        progress.addMouseListener(new progress_lis());


        left_fighter.setBounds(0,0,400,312);
        left_defense.setBounds(100,315,100,20);
        left_Attack.setBounds(100,340,100,20);
        left_lesion.setBounds(100,365,100,20);
        left_confirm.setBounds(200,315,100,20);
        L_w_protect.setBounds(0,315,100,20);
        L_y_hit.setBounds(0,340,100,20);
        L_w_hit.setBounds(0,365,100,20);
        l_allD.setBounds(0,385,110,20);

        left_Head_HeadDefense.setBounds(30,30,130,20);
        left_Body_BodyDefense.setBounds(20,120,130,20);
        left_Lhand_LhandDefense.setBounds(240,30,150,20);
        left_Rhand_RhandDefense.setBounds(0,80,150,20);
        left_Lboot_LbootDefense.setBounds(250,150,150,20);
        left_Rboot_RbootDefense.setBounds(10,200,150,20);
        l_allD.setBounds(0,385,110,20);

        panel.add(left_Head_HeadDefense);
        panel.add(left_Body_BodyDefense);
        panel.add(left_Lhand_LhandDefense);
        panel.add(left_Rhand_RhandDefense);
        panel.add(left_Lboot_LbootDefense);
        panel.add(left_Rboot_RbootDefense);

        panel.add(L_w_protect);
        panel.add(L_y_hit);
        panel.add(L_w_hit);
        panel.add(left_defense);
        panel.add(left_Attack);
        panel.add(left_lesion);
        panel.add(left_confirm);
        panel.add(l_allD);
        panel.add(left_fighter);


        right_fighter.setBounds(400,0,400,312);
        right_defense.setBounds(500,315,100,20);        right_defense.setVisible(false);
        right_Attack.setBounds(500,340,100,20);        right_Attack.setVisible(false);
        right_lesion.setBounds(500,365,100,20);        right_lesion.setVisible(false);
        right_confirm.setBounds(600,315,100,20);        right_confirm.setVisible(false);
        R_w_protect.setBounds(400,315,100,20);          R_w_protect.setVisible(false);
        R_y_hit.setBounds(400,340,100,20);      R_y_hit.setVisible(false);
        R_w_hit.setBounds(400,365,100,20);      R_w_hit.setVisible(false);
        R_allD.setBounds(600,365,110,20);       R_allD.setVisible(false);
        R_Head_HeadDefense.setBounds(650,30,130,20);
        R_Body_BodyDefense.setBounds(640,160,130,20);
        R_Lhand_LhandDefense.setBounds(650,130,150,20);
        R_Rhand_RhandDefense.setBounds(410,30,150,20);
        R_Lboot_LbootDefense.setBounds(630,200,150,20);
        R_Rboot_RbootDefense.setBounds(420,190,150,20);

        panel.add(R_Head_HeadDefense);
        panel.add(R_Body_BodyDefense);
        panel.add(R_Lhand_LhandDefense);
        panel.add(R_Rhand_RhandDefense);
        panel.add(R_Lboot_LbootDefense);
        panel.add(R_Rboot_RbootDefense);

        panel.add(right_defense);
        panel.add(right_Attack);
        panel.add(right_lesion);
        panel.add(right_confirm);
        panel.add(R_w_protect);
        panel.add(R_y_hit);
        panel.add(R_w_hit);
        panel.add(R_allD);
        panel.add(right_fighter);

        progress.setBounds(350,400,100,30);
        panel.add(progress);
        panel.repaint();

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}

