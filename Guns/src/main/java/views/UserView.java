/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;
import controllers.UserController;

/**
 *
 * @author Dante
 */
public class UserView {

    public static void main(String[] args) {
        String usuarioAgregado = new UserController().createUser("Mansour", "LOLO", "Canarias");
        String usuarioEliminado = new UserController().deleteUser(1);
        String usuarioModificado = new UserController().updateUser(2, "Dani");
        String getUsuario = new UserController().getUser(2);
        
        
        //System.out.print(getUsuario);
        //System.out.print(usuarioAgregado);
        //System.out.print(usuarioModificado);
        //System.out.print(usuarioEliminado);
    }
}
