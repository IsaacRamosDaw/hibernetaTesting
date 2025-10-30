/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controllers.GunController;

/**
 *
 * @author Dante
 */
public class GunView {
        public static void main(String[] args) {

                //String gunCreado = new GunController().createGun("M4A4", "5.56", "USA", 700);
                String gunModificado = new GunController().updateGun(1, "ArmaAniquiladora");
                //String gunEliminado = new GunController().deleteGun(1);
                // String getGun = new GunController().getGun();

                //System.out.println(gunCreado);
                //System.out.print(gunEliminado);
                System.out.print(gunModificado);
                // System.out.print(gunEliminado);
        }
}
