/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;


import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;



public class PanelIcon extends JPanel{
    public Image imagen;
    public URL direc;
    public PanelIcon(){
        direc = this.getClass().getResource("src/Imagenes/b.jpg");
        imagen = new ImageIcon(direc).getImage();
    }
    
    public void pintar(Graphics gra){
        gra.drawImage(imagen, 0, 0, getWidth(),getHeight(),null);
        
    }
    
}
