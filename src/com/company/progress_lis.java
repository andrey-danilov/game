package com.company;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.company.Main.*;

/**
 * Created by Andrey on 07.06.2016.
 */
public class progress_lis implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {

        if(left.allDefense <= 0 || right.allDefense <= 0)
        {
            progress.setVisible(false);
        }else{
            if(right.Head.HeadDefense <= 0 || right.Body.BodyDefense<= 0 || right.Lhand.handDefense<= 0 || right.Rhand.handDefense<= 0||
                right.Lboot.bootDefense<= 0 || right.Rboot.bootDefense<= 0){
                progress.setVisible(false);
            }
            if(left.Head.HeadDefense <= 0 || left.Body.BodyDefense<= 0 || left.Lhand.handDefense<= 0 || left.Rhand.handDefense<= 0||
                    left.Lboot.bootDefense<= 0 || left.Rboot.bootDefense<= 0){
                progress.setVisible(false);
            }
        }

        if(left_lesion.getSelectedItem()== right_defense.getSelectedItem()){
            right.tempDefense-=left.tempAttack*0.1;
            try {
                Thread.sleep(2);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            setR(right);
            right.allDefense = right.Head.HeadDefense+right.Body.BodyDefense+right.Lhand.handDefense+right.Rhand.handDefense+right.Lboot.bootDefense+right.Rboot.bootDefense;

        }
        else{
            right.tempDefense-=left.tempAttack*0.3;
            setR(right);
            right.allDefense = right.Head.HeadDefense+right.Body.BodyDefense+right.Lhand.handDefense+right.Rhand.handDefense+right.Lboot.bootDefense+right.Rboot.bootDefense;
        }
        if(right_lesion.getSelectedItem()== left_defense.getSelectedItem()){
            left.tempDefense-=right.tempAttack*0.1;
            setL(left);
            left.allDefense = left.Head.HeadDefense+left.Body.BodyDefense+left.Lhand.handDefense+left.Rhand.handDefense+left.Lboot.bootDefense+left.Rboot.bootDefense;
        }
        else{
            left.tempDefense-=right.tempAttack*0.3;
            setL(left);
            left.allDefense = left.Head.HeadDefense+left.Body.BodyDefense+left.Lhand.handDefense+left.Rhand.handDefense+left.Lboot.bootDefense+left.Rboot.bootDefense;
        }

        left_Head_HeadDefense.setText("Head defense "+left.Head.HeadDefense);
        left_Body_BodyDefense.setText("Body defense "+left.Body.BodyDefense);
        left_Lhand_LhandDefense.setText("Left hand defense "+left.Lhand.handDefense);
        left_Rhand_RhandDefense.setText("Right hand defense "+left.Rhand.handDefense);
        left_Lboot_LbootDefense.setText("Left leg defense "+left.Lboot.bootDefense);
        left_Rboot_RbootDefense.setText("Right leg defense "+left.Rboot.bootDefense);
        l_allD.setText("full defense "+left.allDefense);
        R_Head_HeadDefense.setText("Head defense "+right.Head.HeadDefense);
        R_Body_BodyDefense.setText("Body defense "+right.Body.BodyDefense);
        R_Lhand_LhandDefense.setText("Left hand defense "+right.Lhand.handDefense);
        R_Rhand_RhandDefense.setText("Right hand defense "+right.Rhand.handDefense);
        R_Lboot_LbootDefense.setText("Left leg defense "+right.Lboot.bootDefense);
        R_Rboot_RbootDefense.setText("Right leg defense "+right.Rboot.bootDefense);
        R_allD.setText("full defense "+right.allDefense);


    }

    @Override
    public void mousePressed(MouseEvent e) {

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


    public void setL(fighter L){
        switch (left_defense.getSelectedItem()){
            case "Head": L.Head.HeadDefense=L.tempDefense; break;
            case "Body": L.Body.BodyDefense=L.tempDefense; break;
            case "Left hand": L.Lhand.handDefense=L.tempDefense; break;
            case "Right hand": L.Rhand.handDefense=L.tempDefense; break;
            case "Left boot": L.Lboot.bootDefense=L.tempDefense; break;
            case "Right boot": L.Rboot.bootDefense=L.tempDefense; break;
        }
    }
    public void setR(fighter R){
        switch (right_defense.getSelectedItem()){
            case "Head": R.Head.HeadDefense=R.tempDefense; break;
            case "Body": R.Body.BodyDefense=R.tempDefense; break;
            case "Left hand": R.Lhand.handDefense=R.tempDefense; break;
            case "Right hand": R.Rhand.handDefense=R.tempDefense; break;
            case "Left boot": R.Lboot.bootDefense=R.tempDefense; break;
            case "Right boot": R.Rboot.bootDefense=R.tempDefense; break;
        }
    }

}


