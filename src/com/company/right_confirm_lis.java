package com.company;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.company.Main.*;
import static com.company.Main.left;
import static com.company.Main.right;

/**
 * Created by Andrey on 07.06.2016.
 */
public class right_confirm_lis implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
    }
    @Override
    public void mousePressed(MouseEvent e) {
        String temp_right_defense = right_defense.getSelectedItem();
        String temp_right_Attack = right_Attack.getSelectedItem();
        String temp_right_lesion = right_lesion.getSelectedItem();

        switch (temp_right_defense){
            case "Head": right.tempDefense=right.Head.HeadDefense; break;
            case "Body": right.tempDefense=right.Body.BodyDefense; break;
            case "Left hand": right.tempDefense=right.Lhand.handDefense; break;
            case "Right hand": right.tempDefense=right.Rhand.handDefense; break;
            case "Left boot": right.tempDefense=right.Lboot.bootDefense; break;
            case "Right boot": right.tempDefense=right.Rboot.bootDefense; break;
        }
        switch (temp_right_Attack) {
            case "Head": right.tempAttack = right.Head.headAttack; break;
            case "Body": right.tempAttack = right.Body.bodyAttack; break;
            case "Left hand": right.tempAttack = right.Lhand.handAttack; break;
            case "Right hand": right.tempAttack = right.Rhand.handAttack; break;
            case "Left boot": right.tempAttack = right.Lboot.bootAttack; break;
            case "Right boot": right.tempAttack = right.Rboot.bootAttack; break;
        }
        switch (temp_right_lesion){
                case "Head": right.templesionDefense=left.Head.HeadDefense; break;
                case "Body": right.templesionDefense=left.Body.BodyDefense; break;
                case "Left hand": right.templesionDefense=left.Lhand.handDefense; break;
                case "Right hand": right.templesionDefense=left.Rhand.handDefense; break;
                case "Left boot": right.templesionDefense=left.Lboot.bootDefense; break;
                case "Right boot": right.templesionDefense=left.Rboot.bootDefense; break;
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
