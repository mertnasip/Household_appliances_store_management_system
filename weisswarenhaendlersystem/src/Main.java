import java.awt.EventQueue;

import java.awt.EventQueue;

import Gui.LoginGui;

public class Main {

    public static void main(String[] args) {


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Gui.LoginGui frame = new Gui.LoginGui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("naber lan ");

    }






}
