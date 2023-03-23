/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;


import formularios.fmr_JuegoDos;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import jdk.nashorn.internal.ir.Labels;

/**
 *
 * @author samyr
 */

public class Funcionalidades {
    CustomFont cf = new CustomFont();
    Random randon = new Random();
    private static int money = 500;
    private static String nombre;
    private static String apellido;
    private static String clave;
    private static String nick;
    private static int milisegundos = 70;
    private static int total = 0;
    public static int apu = 25;
    
    // nuemros
    private static String[] numeros = {"src/ImagenesJuego/0.png","src/ImagenesJuego/1.png",
    "src/ImagenesJuego/2.png","src/ImagenesJuego/3.png","src/ImagenesJuego/4.png","src/ImagenesJuego/5.png",
    "src/ImagenesJuego/6.png","src/ImagenesJuego/7.png","src/ImagenesJuego/8.png","src/ImagenesJuego/9.png"};
    
    private static int[] rueda1 = new int[7];
    private static int[] rueda2 = new int[7];
    private static int[] rueda3 = new int[7];
    private static int[] rueda4 = new int[7];
    //private static int[] rueda5 = new int[7];
    // Jlabels de los numeros
    private static JLabel[] imagenes1 = new JLabel[7];
    private static JLabel[] imagenes2 = new JLabel[7];
    private static JLabel[] imagenes3 = new JLabel[7];
    private static JLabel[] imagenes4 = new JLabel[7];
    //private static JLabel[] imagenes5 = new JLabel[7];
    // Jlabels de los multiplicadores
    private static JLabel[] multi1 = new JLabel[7];
    private static JLabel[] multi2 = new JLabel[7];
    private static JLabel[] multi3 = new JLabel[7];
    private static JLabel[] multi4 = new JLabel[7];
    //private static JLabel[] multi5 = new JLabel[7];
    // Jlabels de los giros
    private static JLabel[] giros1 = new JLabel[7];
    private static JLabel[] giros2 = new JLabel[7];
    private static JLabel[] giros3 = new JLabel[7];
    private static JLabel[] giros4 = new JLabel[7];
    //private static JLabel[] giros5 = new JLabel[7];
    
    //Uso o no
    public static boolean uso , uso2 =false;
    private static boolean tiempo = false;
    
  
    
    public static String[] imagenesGame2 = {"src/Imagenes/7y.png","src/Imagenes/8y.png","src/Imagenes/9y.png",
    "src/Imagenes/10y.png","src/Imagenes/11y.png","src/Imagenes/1y.png","src/Imagenes/2y.png","src/Imagenes/3y.png",
    "src/Imagenes/4y.png","src/Imagenes/5y.png","src/Imagenes/6y.png","src/Imagenes/12y.png","src/Imagenes/13y.png",
    "src/Imagenes/14y.png","src/Imagenes/15y.png","src/Imagenes/16y.png","src/Imagenes/17y.png","src/Imagenes/18y.png",
    "src/Imagenes/19y.png","src/Imagenes/20y.png","src/Imagenes/21y.png","src/Imagenes/22y.png","src/Imagenes/23y.png"};

    //abstraccion get   

    public static boolean isTiempo() {
        return tiempo;
    }

    public static int getTotal() {
        return total;
    }

    public static int[] getRueda1() {
        return rueda1;
    }

    public static int[] getRueda2() {
        return rueda2;
    }

    public static int[] getRueda3() {
        return rueda3;
    }

    public static int[] getRueda4() {
        return rueda4;
    }
    
    /*public static int[] getRueda5() {
        return rueda5;
    }  */  

    public static JLabel[] getGiros1() {
        return giros1;
    }

    public static JLabel[] getGiros2() {
        return giros2;
    }

    public static JLabel[] getGiros3() {
        return giros3;
    }

    public static JLabel[] getGiros4() {
        return giros4;
    }
    
    /*public static JLabel[] getGiros5() {
        return giros5;
    }   */

    public static JLabel[] getMulti1() {
        return multi1;
    }

    public static JLabel[] getMulti2() {
        return multi2;
    }

    public static JLabel[] getMulti3() {
        return multi3;
    }

    public static JLabel[] getMulti4() {
        return multi4;
    }
    
    /*public static JLabel[] getMulti5() {
        return multi5;
    }   */         

    public static JLabel[] getImagenes1() {
        return imagenes1;
    }

    public static JLabel[] getImagenes2() {
        return imagenes2;
    }

    public static JLabel[] getImagenes3() {
        return imagenes3;
    }

    public static JLabel[] getImagenes4() {
        return imagenes4;
    }
    
    /*public static JLabel[] getImagenes5() {
        return imagenes5;
    }*/

    public static int getMoney() {
        return money;
    }

    public static int getMilisegundos() {
        return milisegundos;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static String getClave() {
        return clave;
    }

    public static String getNick() {
        return nick;
    }
    
    //abstraccion set

    public static void setTotal(int total) {
        Funcionalidades.total = total;
    }

    public static void setTiempo(boolean tiempo) {
        Funcionalidades.tiempo = tiempo;
    } 
    
    public static void setRueda1(int[] rueda1) {
        Funcionalidades.rueda1 = rueda1;
    }

    public static void setRueda2(int[] rueda2) {
        Funcionalidades.rueda2 = rueda2;
    }

    public static void setRueda3(int[] rueda3) {
        Funcionalidades.rueda3 = rueda3;
    }

    public static void setRueda4(int[] rueda4) {
        Funcionalidades.rueda4 = rueda4;
    }

    /*public static void setRueda5(int[] rueda5) {
        Funcionalidades.rueda5 = rueda5;
    }*/
    
    public static void setGiros1(JLabel[] giros1) {
        Funcionalidades.giros1 = giros1;
    }

    public static void setGiros2(JLabel[] giros2) {
        Funcionalidades.giros2 = giros2;
    }

    public static void setGiros3(JLabel[] giros3) {
        Funcionalidades.giros3 = giros3;
    }

    public static void setGiros4(JLabel[] giros4) {
        Funcionalidades.giros4 = giros4;
    }

    /*public static void setGiros5(JLabel[] giros5) {
        Funcionalidades.giros5 = giros5;
    }*/

    public static void setMulti1(JLabel[] multi1) {
        Funcionalidades.multi1 = multi1;
    }

    public static void setMulti2(JLabel[] multi2) {
        Funcionalidades.multi2 = multi2;
    }

    public static void setMulti3(JLabel[] multi3) {
        Funcionalidades.multi3 = multi3;
    }

    public static void setMulti4(JLabel[] multi4) {
        Funcionalidades.multi4 = multi4;
    }

    /*public static void setMulti5(JLabel[] multi5) {
        Funcionalidades.multi5 = multi5;
    }*/
    
    

    public static void setImagenes1(JLabel[] imagenes1) {
        Funcionalidades.imagenes1 = imagenes1;
    }

    public static void setImagenes2(JLabel[] imagenes2) {
        Funcionalidades.imagenes2 = imagenes2;
    }

    public static void setImagenes3(JLabel[] imagenes3) {
        Funcionalidades.imagenes3 = imagenes3;
    }

    public static void setImagenes4(JLabel[] imagenes4) {
        Funcionalidades.imagenes4 = imagenes4;
    }

    /*public static void setImagenes5(JLabel[] imagenes5) {
        Funcionalidades.imagenes5 = imagenes5;
    }*/
    
    

    public static void setMoney(int money) {
        Funcionalidades.money = money;
    }

    public static void setMilisegundos(int milisegundos) {
        Funcionalidades.milisegundos = milisegundos;
    }

    public static void setNombre(String nombre) {
        Funcionalidades.nombre = nombre;
    }

    public static void setApellido(String apellido) {
        Funcionalidades.apellido = apellido;
    }

    public static void setClave(String clave) {
        Funcionalidades.clave = clave;
    }

    public static void setNick(String nick) {
        Funcionalidades.nick = nick;
    }
     
    // METODOS Propios
    
    public void prewSpin (JLabel label){
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                rsscalelabel.RSScaleLabel.setScaleLabel(label, "src/Imagenes/GIF.gif");
        try {
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }  
            }
        };  
        Thread hilo = new Thread(runnable);
        hilo.start();
    }
    public int[] spinGameTwo (JLabel label){
        int[] vector = new int[7];
        int randomNum = randon.nextInt(23);
        vector = returnVector(randomNum);

           try {
                Thread.sleep(800);
                
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }    
        rsscalelabel.RSScaleLabel.setScaleLabel(label,imagenesGame2[randomNum]);
         
        return vector;
    }
    public int[] returnVector (int randomNum){
        
        int[] vector = new int[7], vectorFull = {1,2,3,4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23};
        int position = 0;
        for (int i=0 ; i<23 ; i++){
            if(randomNum == vectorFull[i]){position = i+1;}
        }
        
        if(position>=3 && position<= 7){
            vector[0] = position-3;
            vector[1] = position-2;
            vector[2] = position-1;
            vector[3] = position;
            vector[4] = position+1;
            vector[5] = position+2;
            vector[6] = position+3;}
        if(position == 2){
            vector[0] = position+8;
            vector[1] = position-2;
            vector[2] = position-1;
            vector[3] = position;
            vector[4] = position+1;
            vector[5] = position+2;
            vector[6] = position+3;}
        if(position == 1){
            vector[0] = position+8;
            vector[1] = position+9;
            vector[2] = position-1;
            vector[3] = position;
            vector[4] = position+1;
            vector[5] = position+2;
            vector[6] = position+3;}
        if(position == 0){
            vector[0] = position+8;
            vector[1] = position+9;
            vector[2] = position+10;
            vector[3] = position;
            vector[4] = position+1;
            vector[5] = position+2;
            vector[6] = position+3;}
        if(position == 8){
            vector[0] = position-3;
            vector[1] = position-2;
            vector[2] = position-1;
            vector[3] = position;
            vector[4] = position+1;
            vector[5] = position+2;
            vector[6] = position-8;}
        if(position == 9){
            vector[0] = position-3;
            vector[1] = position-2;
            vector[2] = position-1;
            vector[3] = position;
            vector[4] = position+1;
            vector[5] = position-9;
            vector[6] = position-8;}
        if(position == 10){
            vector[0] = position-3;
            vector[1] = position-2;
            vector[2] = position-1;
            vector[3] = position;
            vector[4] = position-10;
            vector[5] = position-9;
            vector[6] = position-8;}
        if(position == 11){
            vector[0] = 8;
            vector[1] = 6;
            vector[2] = 7;
            vector[3] = 8;
            vector[4] = 10;
            vector[5] = 2;
            vector[6] = 3;}
        if(position == 12){
            vector[0] = 2;
            vector[1] = 4;
            vector[2] = 2;
            vector[3] = 3;
            vector[4] = 6;
            vector[5] = 8;
            vector[6] = 9;}
        if(position == 13){
            vector[0] = 4;
            vector[1] = 1;
            vector[2] = 1;
            vector[3] = 3;
            vector[4] = 2;
            vector[5] = 9;
            vector[6] = 8;}
        if(position == 14){
            vector[0] = 9;
            vector[1] = 3;
            vector[2] = 4;
            vector[3] = 1;
            vector[4] = 8;
            vector[5] = 6;
            vector[6] = 1;}
        if(position == 15){
            vector[0] = 1;
            vector[1] = 1;
            vector[2] = 1;
            vector[3] = 1;
            vector[4] = 1;
            vector[5] = 1;
            vector[6] = 1;}
        if(position == 16){
            vector[0] = 2;
            vector[1] = 2;
            vector[2] = 2;
            vector[3] = 2;
            vector[4] = 2;
            vector[5] = 2;
            vector[6] = 2;}
        if(position == 17){
            vector[0] = 3;
            vector[1] = 3;
            vector[2] = 3;
            vector[3] = 3;
            vector[4] = 3;
            vector[5] = 3;
            vector[6] = 3;}
        if(position == 18){
            vector[0] = 6;
            vector[1] = 6;
            vector[2] = 6;
            vector[3] = 6;
            vector[4] = 6;
            vector[5] = 6;
            vector[6] = 6;}
        if(position == 19){
            vector[0] = 8;
            vector[1] = 8;
            vector[2] = 8;
            vector[3] = 8;
            vector[4] = 8;
            vector[5] = 8;
            vector[6] = 8;}
        if(position == 20){
            vector[0] = 5;
            vector[1] = 5;
            vector[2] = 5;
            vector[3] = 5;
            vector[4] = 5;
            vector[5] = 5;
            vector[6] = 5;}
        if(position == 21){
            vector[0] = 10;
            vector[1] = 10;
            vector[2] = 10;
            vector[3] = 10;
            vector[4] = 10;
            vector[5] = 10;
            vector[6] = 10;}
        if(position == 22){
            vector[0] = 0;
            vector[1] = 0;
            vector[2] = 0;
            vector[3] = 0;
            vector[4] = 0;
            vector[5] = 0;
            vector[6] = 0;}
        return vector;
    }
    
    public static void transformVec (int[] one, int[] two, int[] three, int[] four){
        for(int i=0 ;i<7 ; i++ ){
            if(one[i] == 5 && two[i] != 5){
                one[i] = two[i];
            }else if(one[i] == 5 && two[i] == 5 && three[i] != 5) {
                one[i] = three[i];
                two[i] = three[i];
            }else if(one[i] == 5 && two[i] == 5 && three[i] == 5 && four[i] != 5) {
                one[i] = four[i];
                two[i] = four[i];
                three[i] = four[i];
            }else if(one[i] == 5 && two[i] == 5 && three[i] == 5 && four[i] == 5){
                one[i] = 8;
                two[i] = 8;
                three[i] = 8;
                four[i] = 8;
            }/*else if(one[i] == 5 && two[i] == 5 && three[i] == 5 && four[i] == 5 && five[i] == 5){
                one[i] = 8;
                two[i] = 8;
                three[i] = 8;
                four[i] = 8;
                five[i] = 8;
            }*/
        }
        // condicion de la segunda columna
        for(int i=0 ; i<7; i++){
            if(two[i] == 5 && three[i] != 5){
                two[i] = three[i];
            }else if(two[i] == 5 && three[i] == 5 && four[i] != 5) {
                two[i] = four[i];
                three[i] = four[i];
            }/*else if(two[i] == 5 && three[i] == 5 && four[i] == 5 && five[i] != 5){
                two[i] = five[i];
                three[i] = five[i];
                four[i] = five[i];
            }*/
        }
        // condicion de la tercera columna
        for(int i=0 ; i<7; i++){
            if(three[i] == 5 && four[i] != 5) {
                three[i] = four[i];
            }/*else if(three[i] == 5 && four[i] == 5 && five[i] != 5){
                three[i] = five[i];
                four[i] = five[i];
            }*/
        }   
        // condicion de la cuarta columna
        /*for(int i=0 ; i<7; i++){
            if(four[i] == 5 && five[i] != 5){
                four[i] = five[i];
            }
        }*/
        // condicion de la quinta columna
        for(int i=0 ; i<7; i++){
            if(four[i] == 5 && three[i] != 5){
                four[i] = three[i];
            }else if(four[i] == 5 && three[i] == 5 && two[i] != 5){
                four[i] = two[i]; three[i] = two[i];
            }else if(four[i] == 5 && three[i] == 5 && two[i] == 5 && one[i] !=5){
                four[i] = one[i]; three[i] = one[i]; two[i] = one[i];
            }
        }
    }
    
    public  int returnMoney (JLabel[] col1, JLabel[] col2, JLabel[] col3,
            JLabel[] col4){
        int total = 0;
        // trasformo el vector
        transformVec(rueda1, rueda2, rueda3, rueda4);
        
        for(int i = 0 ; i<7 ; i++){ 

        // condicion para la colimna 1
            
            if(rueda1[i] == rueda2[i] && rueda1[i] != 0 && rueda1[i] != 10){
                total += rueda1[i] + rueda2[i];
                col1[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col1[i], "src/ImagenesJuego/azul.gif");
                col2[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col2[i], "src/ImagenesJuego/azul.gif");
                if(rueda1[i] == rueda2[i] &&  rueda2[i] == rueda3[i]){
                    total += rueda3[i];
                    col1[i].setVisible(true);
                    rsscalelabel.RSScaleLabel.setScaleLabel(col1[i], "src/ImagenesJuego/azul.gif");
                    col2[i].setVisible(true);
                    rsscalelabel.RSScaleLabel.setScaleLabel(col2[i], "src/ImagenesJuego/azul.gif");
                    col3[i].setVisible(true);
                    rsscalelabel.RSScaleLabel.setScaleLabel(col3[i], "src/ImagenesJuego/azul.gif");
                    if(rueda1[i] == rueda2[i] && rueda2[i] == rueda3[i] && rueda3[i] == rueda4[i]){
                        total += rueda4[i];
                        col1[i].setVisible(true);
                        rsscalelabel.RSScaleLabel.setScaleLabel(col1[i], "src/ImagenesJuego/azul.gif");
                        col2[i].setVisible(true);
                        rsscalelabel.RSScaleLabel.setScaleLabel(col2[i], "src/ImagenesJuego/azul.gif");
                        col3[i].setVisible(true);
                        rsscalelabel.RSScaleLabel.setScaleLabel(col3[i], "src/ImagenesJuego/azul.gif");
                        col4[i].setVisible(true);
                        rsscalelabel.RSScaleLabel.setScaleLabel(col4[i], "src/ImagenesJuego/azul.gif");
                        /*if(rueda1[i] == rueda2[i] && rueda2[i] == rueda3[i] && rueda3[i] == rueda4[i] && rueda4[i] == rueda5[i]){ 
                            total += rueda5[i];
                            col1[i].setVisible(true);
                            col2[i].setVisible(true);
                            col3[i].setVisible(true);
                            col4[i].setVisible(true);
                            col5[i].setVisible(true);
                        }*/
                    }
                }
            }
        // condicion para la columna 2
            if(rueda2[i] == rueda3[i] && rueda2[i] != 0 && rueda2[i] != 10){
                total += rueda2[i] + rueda3[i];
                col2[i].setVisible(true);
                col3[i].setVisible(true);
                    if(rueda2[i] == rueda3[i] && rueda3[i] == rueda4[i]){
                        total += rueda4[i];
                        col2[i].setVisible(true);
                        rsscalelabel.RSScaleLabel.setScaleLabel(col2[i], "src/ImagenesJuego/azul.gif");
                        col3[i].setVisible(true);
                        rsscalelabel.RSScaleLabel.setScaleLabel(col3[i], "src/ImagenesJuego/azul.gif");
                        col4[i].setVisible(true);
                        rsscalelabel.RSScaleLabel.setScaleLabel(col4[i], "src/ImagenesJuego/azul.gif");
                        /*if(rueda2[i] == rueda3[i] && rueda3[i] == rueda4[i] && rueda4[i] == rueda5[i]){
                            total += rueda5[i];
                            col2[i].setVisible(true);
                            col3[i].setVisible(true);
                            col4[i].setVisible(true);
                            col5[i].setVisible(true);
                            }*/
                        }
                    }
        // condicion para la comluna 3
            if(rueda3[i] == rueda4[i] && rueda3[i] != 0 && rueda3[i] != 10){
                total += rueda3[i] + rueda4[i];
                col3[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col3[i], "src/ImagenesJuego/azul.gif");
                col4[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col4[i], "src/ImagenesJuego/azul.gif");
                        /*if(rueda3[i] == rueda4[i] && rueda4[i] == rueda5[i]){
                            total += rueda5[i];
                            col3[i].setVisible(true);
                            col4[i].setVisible(true);
                            col5[i].setVisible(true);
                        }*/
                    }
        // condicion para la columna 4
            /*if(rueda4[i] == rueda5[i] && rueda4[i] != 0 && rueda4[i] != 10){
                            total += rueda4[i]+rueda5[i];
                            col4[i].setVisible(true);
                            col5[i].setVisible(true);
                    }*/
            
            System.out.println(total); 
        }
        return total;
    }
    
    public int caseMultiply(int[] one, int[] two, int[] three, int[] four,
            JLabel[] col1, JLabel[] col2, JLabel[] col3, JLabel[] col4){
        int contador = 0;
 
        transformVec(one, two, three, four);

        for(int i = 0 ; i<7 ; i++){
            if(one[i] == 0){
                contador ++;
                col1[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col1[i], "src/ImagenesJuego/prueba.gif");
            }
        }
        for(int i = 0 ; i<7 ; i++){
            if(two[i] == 0){
                contador ++;     
                col2[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col2[i], "src/ImagenesJuego/prueba.gif");
            }
        }
        for(int i = 0 ; i<7 ; i++){
            if(three[i] == 0){
                contador ++;  
                col3[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col3[i], "src/ImagenesJuego/prueba.gif");
            }
        }
        for(int i = 0 ; i<7 ; i++){
            if(four[i] == 0){
                contador ++;    
                col4[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col4[i], "src/ImagenesJuego/prueba.gif");
            }
        }
        /*for(int i = 0 ; i<7 ; i++){
            if(five[i] == 0){
                contador ++;    
                col5[i].setVisible(true);
            }
        }*/
        if(contador == 0){
            return 1;
        }else{
            return contador ;
        }
        
    }
    
    public int caseSpins(int[] one, int[] two, int[] three, int[] four,
            JLabel[] col1, JLabel[] col2, JLabel[] col3, JLabel[] col4){
        int contador = 0;
 
        transformVec(one, two, three, four);

        for(int i = 0 ; i<7 ; i++){
            if(one[i] == 10){
                contador ++;
                
                col1[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col1[i], "src/ImagenesJuego/verde.gif");
            }
        }
        for(int i = 0 ; i<7 ; i++){
            if(two[i] == 10){
                contador ++;
                
                col2[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col2[i], "src/ImagenesJuego/verde.gif");
            }
        }
        for(int i = 0 ; i<7 ; i++){
            if(three[i] == 10){
                contador ++;
                
                col3[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col3[i], "src/ImagenesJuego/verde.gif");
            }
        }
        for(int i = 0 ; i<7 ; i++){
            if(four[i] == 10){
                contador ++;
                
                col4[i].setVisible(true);
                rsscalelabel.RSScaleLabel.setScaleLabel(col4[i], "src/ImagenesJuego/verde.gif");
            }
        }
        /*for(int i = 0 ; i<7 ; i++){
            if(five[i] == 10){
                contador ++;
                col5[i].setVisible(true);
            }
        }*/
        return contador ;
    }
    
    public void powerLabels(JLabel[] a, JLabel[] b, JLabel[] c, JLabel[] d, boolean power){
        if(power == false){
            for(int i=0 ; i<7; i++){
                a[i].setVisible(false);
            }
            for(int i=0 ; i<7; i++){
                b[i].setVisible(false);
            }
            for(int i=0 ; i<7; i++){
                c[i].setVisible(false);
            }
            for(int i=0 ; i<7; i++){
                d[i].setVisible(false);
            }
            /*for(int i=0 ; i<7; i++){
                e[i].setVisible(false);
            }*/
        }else{
            for(int i=0 ; i<7; i++){
                a[i].setVisible(true);
            }
            for(int i=0 ; i<7; i++){
                b[i].setVisible(true);
            }
            for(int i=0 ; i<7; i++){
                c[i].setVisible(true);
            }
            for(int i=0 ; i<7; i++){
                d[i].setVisible(true);
            }
            /*for(int i=0 ; i<7; i++){
                e[i].setVisible(true);
            }*/
        }
    }
    
    public void labelGif(JLabel x, boolean y){
        Runnable runa = new Runnable() {
            @Override
            public void run() {
                
                for(int i = 0; i<1 ; i++){
                    try {
                Thread.sleep(1000);
                
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                } 
                if(y == true){
                    x.setVisible(true); 
                }else{
                    x.setVisible(false);
                }
                }   
            }
        };
        Thread hilo3 = new Thread(runa);
                
                hilo3.start(); 
    }
   
    public void showMoney(double total, JLabel x){
        
        x.setVisible(true);
    
        Runnable correr = new Runnable() {
            
            int inicio = 50, salto = 80;
            @Override
            public void run() {
              
                for(int i = 0; i<=total ; i++){
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    } 
                    //x.setSize(ancho,alto);
                    if(inicio <= 80){
                        x.setFont(cf.MyFont(1, inicio));
                    }
                    if(i%200 == 0 && i!=0){
                        salto += 10;
                        x.setFont(cf.MyFont(1, salto));   
                    }
                    
                    x.setText(String.valueOf(i));
                    inicio++;
                    i++;
                }
            }
        };
        Thread hilo = new Thread(correr);
        hilo.start();
        
    }
    
    public void cambio(int num, JLabel label,JLabel label2,JLabel label3,JLabel label4,JLabel label5){
               
        label.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(true);
        label5.setVisible(true);
        
        //inicio de los labels
          
        
        Runnable correr = new Runnable(){
            @Override
            public void run() {
                String[] vector;
                
                for(int i = 0; i<num+1 ; i++){
                    try {
                        Thread.sleep(45);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    } 
                    String temporal = String.valueOf(i);
                    vector = temporal.split("");
                    
                    if(i >= 10 ){
                        label.setLocation(410, 470);
                        label2.setLocation(470, 470);
                        label3.setLocation(530, 470);
                        label4.setLocation(590, 470); 
                        label5.setLocation(650, 470);
                    }     
                  
                    if(i>=100){
                        label.setLocation(380, 470);
                        label2.setLocation(440, 470);
                        label3.setLocation(500, 470);
                        label4.setLocation(560, 470);  
                        label5.setLocation(620, 470);
                    }
                    if(i>=1000){
                        label.setLocation(350, 470);
                        label2.setLocation(410, 470);
                        label3.setLocation(470, 470);
                        label4.setLocation(530, 470);  
                        label5.setLocation(590, 470);
                    }
                    if(i>=10000){
                        label.setLocation(320, 470);
                        label2.setLocation(380, 470);
                        label3.setLocation(440, 470);
                        label4.setLocation(500, 470);  
                        label5.setLocation(560, 470);
                    }
                    for(int j = 0; j<temporal.length();j++){
                        if(j == 0){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label, numeros[Integer.valueOf(vector[0])]);
                        }
                        if(j == 1){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label2, numeros[Integer.valueOf(vector[1])]);
                        }
                        if(j == 2){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label3, numeros[Integer.valueOf(vector[2])]);
                        }
                        if(j == 3){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[3])]);
                        }  
                        if(j == 4){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[4])]);
                        } 
                    }
                }   
            } 
        };
        Thread hilo = new Thread(correr);
        hilo.start();
        }
    public void cambioTotal(int num, JLabel label,JLabel label2,JLabel label3,JLabel label4,JLabel label5){
      
        Runnable correr = new Runnable(){
            @Override
            public void run() {
                String[] vector;
                
                for(int i = money; i<money+num+1 ; i++){
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    } 
                    String temporal = String.valueOf(i);
                    vector = temporal.split("");
                    
                    for(int j = 0; j<temporal.length();j++){
                        if(j == 0){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label, numeros[Integer.valueOf(vector[0])]);
                        }
                        if(j == 1){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label2, numeros[Integer.valueOf(vector[1])]);
                        }
                        if(j == 2){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label3, numeros[Integer.valueOf(vector[2])]);
                        }
                        if(j == 3){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[3])]);
                        }  
                        if(j == 4){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[4])]);
                        } 
                    }                   
                }
                money += num;
            } 
        };
        Thread hilo = new Thread(correr);
        hilo.start();
    } 
    
    public void cambioTotal2(int num,JLabel total, JLabel label,JLabel label2,JLabel label3,JLabel label4,JLabel label5){
        if(uso2 == false){
            uso2 = true;
            Runnable correr = new Runnable(){
            @Override
            public void run() {
                String[] vector;
                
                for(int i = apu; i<apu+num+1 ; i++){
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    } 
                    String temporal = String.valueOf(i);
                    vector = temporal.split("");
                    
                    for(int j = 0; j<temporal.length();j++){
                        if(j == 0){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label, numeros[Integer.valueOf(vector[0])]);
                        }
                        if(j == 1){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label2, numeros[Integer.valueOf(vector[1])]);
                        }
                        if(j == 2){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label3, numeros[Integer.valueOf(vector[2])]);
                        }
                        if(j == 3){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[3])]);
                        }  
                        if(j == 4){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[4])]);
                        } 
                    }                   
                }               
                apu += num;
                total.setText(String.valueOf(apu));
                uso2 = false;
            } 
        };
            Thread hilo = new Thread(correr);
            hilo.start();       
        }       
    } 
    public void cambioTotal3(int num,JLabel total, JLabel label,JLabel label2,JLabel label3,JLabel label4,JLabel label5){
        if(uso2 == false){
            uso2 = true;
            Runnable correr = new Runnable(){
                
            @Override
            public void run() {
                String[] vector;
                if(apu-num >= 0){
                for(int i = apu; i>apu-num-1 ; i--){
                    try {
                        Thread.sleep(70);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    } 
                    String temporal = String.valueOf(i);
                    vector = temporal.split("");
                    
                    if(apu <= 10){
                        label2.setIcon(null);
                    }
                    if(apu <= 100 && apu>10){
                        label3.setIcon(null);
                    }
                    if(apu <= 1000 && apu>10 && apu>100){
                        label4.setIcon(null);
                    }
                    if(apu <= 10000 && apu>10 && apu>100 && apu>1000){
                        label5.setIcon(null);
                    }
                    for(int j = 0; j<temporal.length();j++){
                        if(j == 0){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label, numeros[Integer.valueOf(vector[0])]);
                        }
                        if(j == 1){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label2, numeros[Integer.valueOf(vector[1])]);
                        }
                        if(j == 2){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label3, numeros[Integer.valueOf(vector[2])]);
                        }
                        if(j == 3){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[3])]);
                        }  
                        if(j == 4){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[4])]);
                        } 
                    }                   
                }
                
                    apu -= num;
                    total.setText(String.valueOf(apu));  
                    uso2 = false;
                }else {
                    System.out.println("No vale");                  
                }      
            } 
        };
        Thread hilo = new Thread(correr);
        hilo.start();
            
        }else{
            System.out.println("No valido");
        }
        
    } 
    
    public void bajarLabel(JLabel label,JLabel label2,JLabel label3,JLabel label4,JLabel label5,JLabel label6,JLabel label7){
        int x = 10, y = -445;
        //x5
        int x1 = 30, y1 = -340;
        int x2 = 90, y2 = -340;
        int x3 = 150, y3 = -340;
        int subirx = 95, subiry = -280;
        int totalx = 90, totaly = -240;
        int bajarx = 100, bajary = -140;

            Runnable correr = new Runnable(){
            
            @Override
            public void run() {
                
                for(int i = 0; i<450 ; i+=11){
                    try {
                        Thread.sleep(15);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    } 
                    label.setLocation(x, y+i);
                    label2.setLocation(x1, y1+i);
                    label3.setLocation(x2, y2+i);
                    label4.setLocation(x3, y3+i);
                    label5.setLocation(subirx, subiry+i);
                    label6.setLocation(totalx, totaly+i);
                    label7.setLocation(bajarx, bajary+i);
                                  
                }
                tiempo = true;
            } 
        };
        Thread hilo = new Thread(correr);
        hilo.start();
            
        
        }
            
    public void cambioApuesta(int num, JLabel label,JLabel label2,JLabel label3,JLabel label4,JLabel label5){
      
        Runnable correr = new Runnable(){
            @Override
            public void run() {
                String[] vector;
                
                for(int i = 0; i<num+1 ; i++){
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    } 
                    String temporal = String.valueOf(i);
                    vector = temporal.split("");
                    
                    for(int j = 0; j<temporal.length();j++){
                        if(j == 0){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label, numeros[Integer.valueOf(vector[0])]);
                        }
                        if(j == 1){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label2, numeros[Integer.valueOf(vector[1])]);
                        }
                        if(j == 2){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label3, numeros[Integer.valueOf(vector[2])]);
                        }
                        if(j == 3){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[3])]);
                        }  
                        if(j == 4){
                            rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[4])]);
                        } 
                    }                   
                }
                total += num;
            } 
        };
        Thread hilo = new Thread(correr);
        hilo.start();
        
        
        
    } 
    public void calcularGiros(int giros, JLabel label){
        int contador = 0;
            if(giros >=3){
                contador = Double.valueOf(giros/3).intValue(); 
                label.setText("+"+String.valueOf(contador));
            }
            //label.setText("+"+String.valueOf(extras));
            //rsscalelabel.RSScaleLabel.setScaleLabel(label, numeros[extras]);       
    } 
    public void inicioMoney(int dinero,JLabel label,JLabel label2,JLabel label3,JLabel label4,JLabel label5){
        String[] vector;
        vector = String.valueOf(dinero).split("");
            if(dinero <= 10){
                label2.setIcon(null);
            }
            if(dinero <= 100 && dinero>10){
                label3.setIcon(null);
            }
            if(dinero <= 1000 && dinero>10 && dinero>100){
                label4.setIcon(null);
            }
            if(dinero <= 10000 && dinero>10 && dinero>100 && dinero>1000){
                label5.setIcon(null);
            }
        
        for(int j = 0; j<String.valueOf(dinero).length();j++){
            if(j == 0){
                rsscalelabel.RSScaleLabel.setScaleLabel(label, numeros[Integer.valueOf(vector[0])]);
            }
            if(j == 1){
                rsscalelabel.RSScaleLabel.setScaleLabel(label2, numeros[Integer.valueOf(vector[1])]);
            }
            if(j == 2){
                rsscalelabel.RSScaleLabel.setScaleLabel(label3, numeros[Integer.valueOf(vector[2])]);
            }
            if(j == 3){
                rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[3])]);
            }  
            if(j == 4){
                rsscalelabel.RSScaleLabel.setScaleLabel(label4, numeros[Integer.valueOf(vector[4])]);
            } 
        }
        
    }
    public void negri(JLabel fondo, boolean estado, int d){
        Runnable correr = new Runnable(){
            @Override
            public void run() {
                if(estado == true){
                    for(int i = 0; i<d ; i++){
                        try {
                                Thread.sleep(40);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                            fondo.setBackground(new Color(0, 0, 0, i));
                        }                
                    }
                    else{
                        for(int i = 135; i<=d ; i--){
                            try {
                                    Thread.sleep(25);
                                } catch (InterruptedException ex) {
                                    ex.printStackTrace();
                                }
                                fondo.setBackground(new Color(0, 0, 0, d));
                        }                
                    }
                    }  
            };
        Thread hilo = new Thread(correr);
        hilo.start(); 
        
    }
    
    
}
    

