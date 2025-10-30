/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.time.LocalDateTime;
import controllers.SellController;

/**
 *
 * @author Dante
 */

/**
 *
 * @author Dante
 */
public class SellView {

    
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now(); 

        String getSell = new SellController().getSell(1);
        // String sellCreada = new SellController().createSell(2, 2, myDateObj);
        // String sellEliminada = new SellController().deleteSell(1);

        System.out.println(getSell);
        // System.out.println(sellCreada);
        // System.out.println(sellEliminada);
    }
}
