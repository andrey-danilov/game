package com.company;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.company.Main.*;


public class left_confirm_lis implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        String temp_left_defense = left_defense.getSelectedItem();
        String temp_left_Attack = left_Attack.getSelectedItem();
        String temp_left_lesion = left_lesion.getSelectedItem();

        switch (temp_left_defense){
            case "Head": left.tempDefense=left.Head.HeadDefense; break;
            case "Body": left.tempDefense=left.Body.BodyDefense; break;
            case "Left hand": left.tempDefense=left.Lhand.handDefense; break;
            case "Right hand": left.tempDefense=left.Rhand.handDefense; break;
            case "Left leg": left.tempDefense=left.Lboot.bootDefense; break;
            case "Right leg": left.tempDefense=left.Rboot.bootDefense; break;
        }

        switch (temp_left_Attack){
            case "Head": left.tempAttack=left.Head.headAttack; break;
            case "Body": left.tempAttack=left.Body.bodyAttack; break;
            case "Left hand": left.tempAttack=left.Lhand.handAttack; break;
            case "Right hand": left.tempAttack=left.Rhand.handAttack; break;
            case "Left leg": left.tempAttack=left.Lboot.bootAttack; break;
            case "Right leg": left.tempAttack=left.Rboot.bootAttack; break;
        }
        switch (temp_left_lesion){
            case "Head": left.templesionDefense=right.Head.HeadDefense; break;
            case "Body": left.templesionDefense=right.Body.BodyDefense; break;
            case "Left hand": left.templesionDefense=right.Lhand.handDefense; break;
            case "Right hand": left.templesionDefense=right.Rhand.handDefense; break;
            case "Left leg": left.templesionDefense=right.Lboot.bootDefense; break;
            case "Right leg": left.templesionDefense=right.Rboot.bootDefense; break;
        }
        right_defense.setVisible(true);
        right_Attack.setVisible(true);
        right_lesion.setVisible(true);
        right_confirm.setVisible(true);
        R_w_protect.setVisible(true);
        R_y_hit.setVisible(true);
        R_w_hit.setVisible(true);
        R_allD.setVisible(true);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        String temp_left_defense = left_defense.getSelectedItem();
        String temp_left_Attack = left_Attack.getSelectedItem();
        String temp_left_lesion = left_lesion.getSelectedItem();

        switch (temp_left_defense){
            case "Head": left.tempDefense=left.Head.HeadDefense; break;
            case "Body": left.tempDefense=left.Body.BodyDefense; break;
            case "Left hand": left.tempDefense=left.Lhand.handDefense; break;
            case "Right hand": left.tempDefense=left.Rhand.handDefense; break;
            case "Left leg": left.tempDefense=left.Lboot.bootDefense; break;
            case "Right leg": left.tempDefense=left.Rboot.bootDefense; break;
        }
        switch (temp_left_Attack){
            case "Head": left.tempAttack=left.Head.headAttack; break;
            case "Body": left.tempAttack=left.Body.bodyAttack; break;
            case "Left hand": left.tempAttack=left.Lhand.handAttack; break;
            case "Right hand": left.tempAttack=left.Rhand.handAttack; break;
            case "Left leg": left.tempAttack=left.Lboot.bootAttack; break;
            case "Right leg": left.tempAttack=left.Rboot.bootAttack; break;
        }
        switch (temp_left_lesion){
            case "Head": left.templesionDefense=right.Head.HeadDefense; break;
            case "Body": left.templesionDefense=right.Body.BodyDefense; break;
            case "Left hand": left.templesionDefense=right.Lhand.handDefense; break;
            case "Right hand": left.templesionDefense=right.Rhand.handDefense; break;
            case "Left leg": left.templesionDefense=right.Lboot.bootDefense; break;
            case "Right leg": left.templesionDefense=right.Rboot.bootDefense; break;
        }

    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }

}
