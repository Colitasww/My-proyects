/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import ClasePrincipal.CustomFont;
import ClasePrincipal.Funcionalidades;
import ClasePrincipal.Musica;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Control;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author samyr
 */
public class fmr_JuegoDos extends javax.swing.JFrame { 
    int total;
    int totalMulty, totalGiros, multiplicador = 1;
    double precio;
    boolean estado = true;
    
    CustomFont cf = new CustomFont();
    Funcionalidades funciones = new Funcionalidades();
    Random randon = new Random();
    Musica mus = new Musica();
    JFVentana a = new JFVentana();
    Clip clip = new Clip() {
        @Override
        public void open(AudioFormat af, byte[] bytes, int i, int i1) throws LineUnavailableException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void open(AudioInputStream stream) throws LineUnavailableException, IOException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getFrameLength() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public long getMicrosecondLength() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setFramePosition(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setMicrosecondPosition(long l) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setLoopPoints(int i, int i1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void loop(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drain() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void flush() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void start() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void stop() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isRunning() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isActive() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public AudioFormat getFormat() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getBufferSize() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int available() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getFramePosition() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public long getLongFramePosition() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public long getMicrosecondPosition() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public float getLevel() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Line.Info getLineInfo() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void open() throws LineUnavailableException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void close() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isOpen() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Control[] getControls() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isControlSupported(Control.Type type) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Control getControl(Control.Type type) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addLineListener(LineListener ll) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void removeLineListener(LineListener ll) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    public fmr_JuegoDos() {
        initComponents();
        
        funciones.uso = false;
        setLocationRelativeTo(null);
        mus.reproducir();
        lblUp.setText("25");
        
        funciones.inicioMoney(Integer.valueOf(lblUp.getText()),lblT6, lblT7, lblT8, lblT9, lblT10);
        funciones.inicioMoney(funciones.getMoney(),lblT1, lblT2, lblT3, lblT4, lblT5);
        

        //labes numeros
        rsscalelabel.RSScaleLabel.setScaleLabel(lblBarra,"src/ImagenesJuego/Barra.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondoGame,"src/ImagenesJuego/Oscuro.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondoGiros,"src/ImagenesJuego/MarcoFinal.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblRestard,"src/ImagenesJuego/Restart.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblXerrar,"src/ImagenesJuego/close_2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblBet,"src/ImagenesJuego/total.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lvlApuesta,"src/ImagenesJuego/apuesta.png");
        //ventana Bajar
        
        rsscalelabel.RSScaleLabel.setScaleLabel(lblBarraBajar,"src/ImagenesJuego/panel.png");
        //rsscalelabel.RSScaleLabel.setScaleLabel(lblUp,"src/ImagenesJuego/Puntaje.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblAbajo,"src/ImagenesJuego/upB.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblArriba,"src/ImagenesJuego/donwB.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblX2,"src/ImagenesJuego/x2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblX5,"src/ImagenesJuego/x5.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblX10,"src/ImagenesJuego/x10.png");
        
        funciones.bajarLabel(lblBarraBajar, lblX2, lblX5, lblX10,lblArriba, lblUp,lblAbajo );

       
        JLabel[] vectorLbl1 = {lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7};
        JLabel[] vectorLbl2 = {lbl8,lbl9,lbl10,lbl11,lbl12,lbl13,lbl14};
        JLabel[] vectorLbl3 = {lbl15,lbl16,lbl17,lbl18,lbl19,lbl20,lbl21};
        JLabel[] vectorLbl4 = {lbl22,lbl23,lbl24,lbl25,lbl26,lbl27,lbl28};
        
        
        funciones.setImagenes1(vectorLbl1);
        funciones.setImagenes2(vectorLbl2);
        funciones.setImagenes3(vectorLbl3);
        funciones.setImagenes4(vectorLbl4);
        //funciones.setImagenes5(vectorLbl5);
        
        //labes multiplicador
        JLabel[] vector1 = {lbl36,lbl37,lbl38,lbl39,lbl40,lbl41,lbl42};
        JLabel[] vector2 = {lbl43,lbl44,lbl45,lbl46,lbl47,lbl48,lbl49};
        JLabel[] vector3 = {lbl50,lbl51,lbl52,lbl53,lbl54,lbl55,lbl56};
        JLabel[] vector4 = {lbl57,lbl58,lbl59,lbl60,lbl61,lbl62,lbl63};
        
        
        funciones.setMulti1(vector1);
        funciones.setMulti2(vector2);
        funciones.setMulti3(vector3);
        funciones.setMulti4(vector4);
        //funciones.setMulti5(vector5);
        
        //labels giros
        JLabel[] giro1 = {lbl71,lbl72,lbl73,lbl74,lbl75,lbl76,lbl77};
        JLabel[] giro2 = {lbl78,lbl79,lbl80,lbl81,lbl82,lbl83,lbl84};
        JLabel[] giro3 = {lbl85,lbl86,lbl87,lbl88,lbl89,lbl90,lbl91};
        JLabel[] giro4 = {lbl92,lbl93,lbl94,lbl95,lbl96,lbl97,lbl98};
        
        
        funciones.setGiros1(giro1);
        funciones.setGiros2(giro2);
        funciones.setGiros3(giro3);
        funciones.setGiros4(giro4);
        //funciones.setGiros5(giro5);
        
        
        // labes apagados
        lblprimero.setVisible(false);
        lblprimero1.setVisible(false);
        lblprimero2.setVisible(false);
        lblprimero3.setVisible(false);
        
        funciones.powerLabels( funciones.getImagenes1(), funciones.getImagenes2(),
                       funciones.getImagenes3(), funciones.getImagenes4(),  false);
        
        funciones.powerLabels( funciones.getMulti1(), funciones.getMulti2(),
                       funciones.getMulti3(), funciones.getMulti4(), false);
        
        funciones.powerLabels( funciones.getGiros1(), funciones.getGiros2(),
                       funciones.getGiros3(), funciones.getGiros4(), false);
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblprimero4 = new javax.swing.JLabel();
        lblprimero3 = new javax.swing.JLabel();
        lblprimero2 = new javax.swing.JLabel();
        lblprimero1 = new javax.swing.JLabel();
        lblprimero = new javax.swing.JLabel();
        lblPremio = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblMultiplicador = new javax.swing.JLabel();
        lblGiros = new javax.swing.JLabel();
        lblXerrar = new javax.swing.JLabel();
        lvlApuesta = new javax.swing.JLabel();
        lblBet = new javax.swing.JLabel();
        lblRestard = new javax.swing.JLabel();
        lblT1 = new javax.swing.JLabel();
        lblT2 = new javax.swing.JLabel();
        lblT3 = new javax.swing.JLabel();
        lblT4 = new javax.swing.JLabel();
        lblT5 = new javax.swing.JLabel();
        lblT6 = new javax.swing.JLabel();
        lblT7 = new javax.swing.JLabel();
        lblT8 = new javax.swing.JLabel();
        lblT9 = new javax.swing.JLabel();
        lblT10 = new javax.swing.JLabel();
        lblAbajo = new javax.swing.JLabel();
        lblArriba = new javax.swing.JLabel();
        lblX10 = new javax.swing.JLabel();
        lblX2 = new javax.swing.JLabel();
        lblX5 = new javax.swing.JLabel();
        lblUp = new javax.swing.JLabel();
        lblSumador = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblBarra = new javax.swing.JLabel();
        lblBarraBajar = new javax.swing.JLabel();
        lblFondoGiros = new javax.swing.JLabel();
        lblTres = new javax.swing.JLabel();
        lblUno = new javax.swing.JLabel();
        lblDos = new javax.swing.JLabel();
        lblCuatro = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        lbl36 = new javax.swing.JLabel();
        lbl37 = new javax.swing.JLabel();
        lbl38 = new javax.swing.JLabel();
        lbl39 = new javax.swing.JLabel();
        lbl40 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        lbl45 = new javax.swing.JLabel();
        lbl46 = new javax.swing.JLabel();
        lbl47 = new javax.swing.JLabel();
        lbl48 = new javax.swing.JLabel();
        lbl49 = new javax.swing.JLabel();
        lbl50 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        lbl53 = new javax.swing.JLabel();
        lbl54 = new javax.swing.JLabel();
        lbl55 = new javax.swing.JLabel();
        lbl56 = new javax.swing.JLabel();
        lbl57 = new javax.swing.JLabel();
        lbl58 = new javax.swing.JLabel();
        lbl59 = new javax.swing.JLabel();
        lbl60 = new javax.swing.JLabel();
        lbl61 = new javax.swing.JLabel();
        lbl62 = new javax.swing.JLabel();
        lbl63 = new javax.swing.JLabel();
        lbl71 = new javax.swing.JLabel();
        lbl72 = new javax.swing.JLabel();
        lbl73 = new javax.swing.JLabel();
        lbl74 = new javax.swing.JLabel();
        lbl75 = new javax.swing.JLabel();
        lbl76 = new javax.swing.JLabel();
        lbl77 = new javax.swing.JLabel();
        lbl78 = new javax.swing.JLabel();
        lbl79 = new javax.swing.JLabel();
        lbl80 = new javax.swing.JLabel();
        lbl81 = new javax.swing.JLabel();
        lbl82 = new javax.swing.JLabel();
        lbl83 = new javax.swing.JLabel();
        lbl84 = new javax.swing.JLabel();
        lbl85 = new javax.swing.JLabel();
        lbl86 = new javax.swing.JLabel();
        lbl87 = new javax.swing.JLabel();
        lbl88 = new javax.swing.JLabel();
        lbl89 = new javax.swing.JLabel();
        lbl90 = new javax.swing.JLabel();
        lbl91 = new javax.swing.JLabel();
        lbl92 = new javax.swing.JLabel();
        lbl93 = new javax.swing.JLabel();
        lbl94 = new javax.swing.JLabel();
        lbl95 = new javax.swing.JLabel();
        lbl96 = new javax.swing.JLabel();
        lbl97 = new javax.swing.JLabel();
        lbl98 = new javax.swing.JLabel();
        lblFondoGame = new javax.swing.JLabel();
        lblTres1 = new javax.swing.JLabel();
        lblUno1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1200, 650));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblprimero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 40, 60));
        jPanel1.add(lblprimero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 40, 60));
        jPanel1.add(lblprimero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 40, 60));
        jPanel1.add(lblprimero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 40, 60));
        jPanel1.add(lblprimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 40, 60));
        jPanel1.add(lblPremio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 80, 30));
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 70, 20));

        lblMultiplicador.setFont(new java.awt.Font("Gadugi", 1, 56)); // NOI18N
        lblMultiplicador.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblMultiplicador, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 80, 80));

        lblGiros.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        lblGiros.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblGiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 70, 70));

        lblXerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXerrarMouseClicked(evt);
            }
        });
        jPanel1.add(lblXerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 60, 60));
        jPanel1.add(lvlApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 110, 40));
        jPanel1.add(lblBet, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 80, 33));

        lblRestard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/restart.png"))); // NOI18N
        lblRestard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRestardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRestardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRestardMouseExited(evt);
            }
        });
        jPanel1.add(lblRestard, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 100, 90));
        jPanel1.add(lblT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 30, 40));
        jPanel1.add(lblT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 30, 40));
        jPanel1.add(lblT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 30, 40));
        jPanel1.add(lblT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, 30, 40));
        jPanel1.add(lblT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 30, 40));
        jPanel1.add(lblT6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, 30, 40));
        jPanel1.add(lblT7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 30, 40));
        jPanel1.add(lblT8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, 30, 40));
        jPanel1.add(lblT9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 30, 40));
        jPanel1.add(lblT10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 30, 40));

        lblAbajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAbajoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAbajoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAbajoMouseExited(evt);
            }
        });
        jPanel1.add(lblAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 60, 40));

        lblArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArribaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblArribaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblArribaMouseExited(evt);
            }
        });
        jPanel1.add(lblArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 160, 60, 40));

        lblX10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblX10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblX10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblX10MouseExited(evt);
            }
        });
        jPanel1.add(lblX10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 60, 50));

        lblX2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblX2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblX2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblX2MouseExited(evt);
            }
        });
        jPanel1.add(lblX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 60, 50));

        lblX5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblX5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblX5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblX5MouseExited(evt);
            }
        });
        jPanel1.add(lblX5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, 50));

        lblUp.setBackground(new java.awt.Color(255, 255, 255));
        lblUp.setFont(new java.awt.Font("Gadugi", 1, 56)); // NOI18N
        lblUp.setForeground(new java.awt.Color(255, 255, 255));
        lblUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblUp.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(lblUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 110, 100));

        lblSumador.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        lblSumador.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblSumador, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 80, 80));

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setText("Ingresar Dinero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 120, -1));

        lblBarra.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(lblBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 600, 590, 110));
        jPanel1.add(lblBarraBajar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -5, 230, 445));
        jPanel1.add(lblFondoGiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 700, 750));
        jPanel1.add(lblTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 68, 83, 555));
        jPanel1.add(lblUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 68, 83, 555));
        jPanel1.add(lblDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 68, 83, 555));
        jPanel1.add(lblCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 68, 83, 555));

        lbl1.setAutoscrolls(true);
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 60, 90, 85));

        lbl2.setAutoscrolls(true);
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 140, 90, 85));

        lbl3.setAutoscrolls(true);
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 220, 90, 85));

        lbl4.setAutoscrolls(true);
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 300, 90, 85));

        lbl5.setAutoscrolls(true);
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 380, 90, 85));

        lbl6.setAutoscrolls(true);
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 460, 90, 85));

        lbl7.setAutoscrolls(true);
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 540, 90, 85));

        lbl8.setAutoscrolls(true);
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 60, 90, 85));

        lbl9.setAutoscrolls(true);
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 140, 90, 85));

        lbl10.setAutoscrolls(true);
        jPanel1.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 220, 90, 85));

        lbl11.setAutoscrolls(true);
        jPanel1.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 300, 90, 85));

        lbl12.setAutoscrolls(true);
        jPanel1.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 380, 90, 85));

        lbl13.setAutoscrolls(true);
        jPanel1.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 460, 90, 85));

        lbl14.setAutoscrolls(true);
        jPanel1.add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 540, 90, 85));

        lbl15.setAutoscrolls(true);
        jPanel1.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 60, 90, 85));

        lbl16.setAutoscrolls(true);
        jPanel1.add(lbl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 140, 90, 85));

        lbl17.setAutoscrolls(true);
        jPanel1.add(lbl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 220, 90, 85));

        lbl18.setAutoscrolls(true);
        jPanel1.add(lbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 300, 90, 85));

        lbl19.setAutoscrolls(true);
        jPanel1.add(lbl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 380, 90, 85));

        lbl20.setAutoscrolls(true);
        jPanel1.add(lbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 460, 90, 85));

        lbl21.setAutoscrolls(true);
        jPanel1.add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 540, 90, 85));

        lbl22.setAutoscrolls(true);
        jPanel1.add(lbl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 60, 90, 85));

        lbl23.setAutoscrolls(true);
        jPanel1.add(lbl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 140, 90, 85));

        lbl24.setAutoscrolls(true);
        jPanel1.add(lbl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 220, 90, 85));

        lbl25.setAutoscrolls(true);
        jPanel1.add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 300, 90, 85));

        lbl26.setAutoscrolls(true);
        jPanel1.add(lbl26, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 380, 90, 85));

        lbl27.setAutoscrolls(true);
        jPanel1.add(lbl27, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 460, 90, 85));

        lbl28.setAutoscrolls(true);
        jPanel1.add(lbl28, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 540, 90, 85));

        lbl36.setAutoscrolls(true);
        jPanel1.add(lbl36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 109, 104));

        lbl37.setAutoscrolls(true);
        jPanel1.add(lbl37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 109, 104));

        lbl38.setAutoscrolls(true);
        jPanel1.add(lbl38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 109, 104));

        lbl39.setAutoscrolls(true);
        jPanel1.add(lbl39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 109, 104));

        lbl40.setAutoscrolls(true);
        jPanel1.add(lbl40, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 109, 104));

        lbl41.setAutoscrolls(true);
        jPanel1.add(lbl41, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 109, 104));

        lbl42.setAutoscrolls(true);
        jPanel1.add(lbl42, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 109, 104));

        lbl43.setAutoscrolls(true);
        jPanel1.add(lbl43, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 50, 109, 104));

        lbl44.setAutoscrolls(true);
        jPanel1.add(lbl44, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 130, 109, 104));

        lbl45.setAutoscrolls(true);
        jPanel1.add(lbl45, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 210, 109, 104));

        lbl46.setAutoscrolls(true);
        jPanel1.add(lbl46, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 290, 109, 104));

        lbl47.setAutoscrolls(true);
        jPanel1.add(lbl47, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 370, 109, 104));

        lbl48.setAutoscrolls(true);
        jPanel1.add(lbl48, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 450, 109, 104));

        lbl49.setAutoscrolls(true);
        jPanel1.add(lbl49, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 530, 109, 104));

        lbl50.setAutoscrolls(true);
        jPanel1.add(lbl50, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 50, 109, 104));

        lbl51.setAutoscrolls(true);
        jPanel1.add(lbl51, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 130, 109, 104));

        lbl52.setAutoscrolls(true);
        jPanel1.add(lbl52, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 210, 109, 104));

        lbl53.setAutoscrolls(true);
        jPanel1.add(lbl53, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 290, 109, 104));

        lbl54.setAutoscrolls(true);
        jPanel1.add(lbl54, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 370, 109, 104));

        lbl55.setAutoscrolls(true);
        jPanel1.add(lbl55, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 450, 109, 104));

        lbl56.setAutoscrolls(true);
        jPanel1.add(lbl56, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 530, 109, 104));

        lbl57.setAutoscrolls(true);
        jPanel1.add(lbl57, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 50, 109, 104));

        lbl58.setAutoscrolls(true);
        jPanel1.add(lbl58, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 130, 109, 104));

        lbl59.setAutoscrolls(true);
        jPanel1.add(lbl59, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 210, 109, 104));

        lbl60.setAutoscrolls(true);
        jPanel1.add(lbl60, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 290, 109, 104));

        lbl61.setAutoscrolls(true);
        jPanel1.add(lbl61, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 370, 109, 104));

        lbl62.setAutoscrolls(true);
        jPanel1.add(lbl62, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 450, 109, 104));

        lbl63.setAutoscrolls(true);
        jPanel1.add(lbl63, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 530, 109, 104));

        lbl71.setAutoscrolls(true);
        jPanel1.add(lbl71, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 60, 90, 85));

        lbl72.setAutoscrolls(true);
        jPanel1.add(lbl72, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 140, 90, 85));

        lbl73.setAutoscrolls(true);
        jPanel1.add(lbl73, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 220, 90, 85));

        lbl74.setAutoscrolls(true);
        jPanel1.add(lbl74, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 300, 90, 85));

        lbl75.setAutoscrolls(true);
        jPanel1.add(lbl75, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 380, 90, 85));

        lbl76.setAutoscrolls(true);
        jPanel1.add(lbl76, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 460, 90, 85));

        lbl77.setAutoscrolls(true);
        jPanel1.add(lbl77, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 540, 90, 85));

        lbl78.setAutoscrolls(true);
        jPanel1.add(lbl78, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 60, 90, 85));

        lbl79.setAutoscrolls(true);
        jPanel1.add(lbl79, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 140, 90, 85));

        lbl80.setAutoscrolls(true);
        jPanel1.add(lbl80, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 220, 90, 85));

        lbl81.setAutoscrolls(true);
        jPanel1.add(lbl81, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 300, 90, 85));

        lbl82.setAutoscrolls(true);
        jPanel1.add(lbl82, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 380, 90, 85));

        lbl83.setAutoscrolls(true);
        jPanel1.add(lbl83, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 460, 90, 85));

        lbl84.setAutoscrolls(true);
        jPanel1.add(lbl84, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 540, 90, 85));

        lbl85.setAutoscrolls(true);
        jPanel1.add(lbl85, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 60, 90, 85));

        lbl86.setAutoscrolls(true);
        jPanel1.add(lbl86, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 140, 90, 85));

        lbl87.setAutoscrolls(true);
        jPanel1.add(lbl87, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 220, 90, 85));

        lbl88.setAutoscrolls(true);
        jPanel1.add(lbl88, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 300, 90, 85));

        lbl89.setAutoscrolls(true);
        jPanel1.add(lbl89, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 380, 90, 85));

        lbl90.setAutoscrolls(true);
        jPanel1.add(lbl90, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 460, 90, 85));

        lbl91.setAutoscrolls(true);
        jPanel1.add(lbl91, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 540, 90, 85));

        lbl92.setAutoscrolls(true);
        jPanel1.add(lbl92, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 60, 90, 85));

        lbl93.setAutoscrolls(true);
        jPanel1.add(lbl93, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 140, 90, 85));

        lbl94.setAutoscrolls(true);
        jPanel1.add(lbl94, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 220, 90, 85));

        lbl95.setAutoscrolls(true);
        jPanel1.add(lbl95, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 300, 90, 85));

        lbl96.setAutoscrolls(true);
        jPanel1.add(lbl96, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 380, 90, 85));

        lbl97.setAutoscrolls(true);
        jPanel1.add(lbl97, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 460, 90, 85));

        lbl98.setAutoscrolls(true);
        jPanel1.add(lbl98, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 540, 90, 85));
        jPanel1.add(lblFondoGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, 1190, 750));
        jPanel1.add(lblTres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 83, 560));
        jPanel1.add(lblUno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 83, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblRestardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRestardMouseClicked
        
        if(funciones.uso == false){
            
            precio = Integer.valueOf(lblUp.getText())*0.05;
            System.out.println(precio);
            if(funciones.getMoney() - Integer.valueOf(lblUp.getText()) >= 0){
                
                
                
                funciones.setMoney(funciones.getMoney() - Integer.valueOf(lblUp.getText()));
                funciones.inicioMoney(funciones.getMoney(),lblT1, lblT2, lblT3, lblT4, lblT5);
                mus.reproducirAccion();
                funciones.uso = true;
                //restar giro
            lblprimero.setVisible(false);
            lblprimero1.setVisible(false);
            lblprimero2.setVisible(false);
            lblprimero3.setVisible(false);
            lblprimero4.setVisible(false);
                //remover Icon
            lblprimero.setIcon(null);
            lblprimero1.setIcon(null);
            lblprimero2.setIcon(null);
            lblprimero3.setIcon(null);
            lblprimero4.setIcon(null);
                //Regresar al estado natural de los labels
//            lblprimero.setLocation(440, 470);
//            lblprimero1.setLocation(500, 470);
//            lblprimero2.setLocation(560, 470);
//            lblprimero3.setLocation(620, 470);
//            lblprimero4.setLocation(680, 470);
//            
            

            funciones.powerLabels( funciones.getImagenes1(), funciones.getImagenes2(),
                           funciones.getImagenes3(), funciones.getImagenes4(), false);

            funciones.powerLabels( funciones.getMulti1(), funciones.getMulti2(),
                           funciones.getMulti3(), funciones.getMulti4(), false);

            funciones.powerLabels( funciones.getGiros1(), funciones.getGiros2(),
                           funciones.getGiros3(), funciones.getGiros4(), false);

            Runnable hilo1 = new Runnable() {

                @Override
                public void run() {    
                    //Iniciar Musica
                    clip = mus.reproducirGiro();
                    clip.start();

                    funciones.prewSpin(lblUno);

                    funciones.setRueda1(funciones.spinGameTwo(lblUno));

                    funciones.prewSpin(lblDos);

                    funciones.setRueda2(funciones.spinGameTwo(lblDos));

                    funciones.prewSpin(lblTres);

                    funciones.setRueda3(funciones.spinGameTwo(lblTres));

                    funciones.prewSpin(lblCuatro);

                    funciones.setRueda4(funciones.spinGameTwo(lblCuatro));
                    clip.stop();

                    //funciones.prewSpin(lblCinco);

                    //funciones.setRueda5(funciones.spinGameTwo(lblCinco));


                        for(int i = 0; i<1 ; i++){

                        try {
                        Thread.sleep(2000);

                        }catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } 
                        //Optener total
                        total = (funciones.returnMoney(funciones.getImagenes1(), funciones.getImagenes2(),                       
                        funciones.getImagenes3(), funciones.getImagenes4())); 
                        
                        total = Double.valueOf(total * precio).intValue() ;
                        
                        
                        totalMulty = funciones.caseMultiply(funciones.getRueda1(), funciones.getRueda2(),
                        funciones.getRueda3(), funciones.getRueda4(),
                        funciones.getMulti1(), funciones.getMulti2(), 
                        funciones.getMulti3(), funciones.getMulti4());

                        totalGiros = funciones.caseSpins(funciones.getRueda1(), funciones.getRueda2(),
                        funciones.getRueda3(), funciones.getRueda4(),
                        funciones.getGiros1(), funciones.getGiros2(),funciones.getGiros3(),
                        funciones.getGiros4());
                        
                        funciones.setTotal(totalMulty * funciones.getTotal());

                        lblMultiplicador.setText(String.valueOf(totalMulty));

                        lblGiros.setText(String.valueOf(totalGiros)); 
                        
                        funciones.calcularGiros(totalGiros, lblSumador);
                        
                        funciones.cambio(total,lblprimero, lblprimero1, lblprimero2, lblprimero3, lblprimero4);
                        funciones.cambioTotal(total, lblT1, lblT2, lblT3, lblT4, lblT5);
                        }          
                     
                        funciones.uso = false;     
                }                
            };
            Thread hilo = new Thread(hilo1);         
            hilo.start();  
            }           
        }else if (funciones.uso == true){
            System.out.println("en uso");
        }
        
    }//GEN-LAST:event_lblRestardMouseClicked

    private void lblRestardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRestardMouseEntered
        rsscalelabel.RSScaleLabel.setScaleLabel(lblRestard,"src/ImagenesJuego/restartLuz.png"); 
    }//GEN-LAST:event_lblRestardMouseEntered

    private void lblRestardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRestardMouseExited
        rsscalelabel.RSScaleLabel.setScaleLabel(lblRestard,"src/ImagenesJuego/restart.png"); 
    }//GEN-LAST:event_lblRestardMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dine = "";
        while(dine.isEmpty()){
            dine = JOptionPane.showInputDialog(this, "ingrese el dinero: ");
            
            if(dine == null){
                break;
            } 
            else if(dine.matches("[0-9]+")){
                
            System.out.println("Valido");
            
            funciones.cambioTotal(Integer.valueOf(dine), lblT1, lblT2, lblT3, lblT4, lblT5);
            //funciones.setTotal((funciones.getTotal()+ Integer.valueOf(dine)));
            }
            else{
                System.out.println("No valido");
                dine = "";
                }
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblArribaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArribaMouseClicked
        
        funciones.cambioTotal2(multiplicador,lblUp, lblT6, lblT7, lblT8, lblT9, lblT10);
    }//GEN-LAST:event_lblArribaMouseClicked

    private void lblAbajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbajoMouseClicked
        
        funciones.cambioTotal3(multiplicador, lblUp,lblT6, lblT7, lblT8, lblT9, lblT10);
    }//GEN-LAST:event_lblAbajoMouseClicked

    private void lblX5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblX5MouseClicked
        multiplicador = 5;
    }//GEN-LAST:event_lblX5MouseClicked

    private void lblX10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblX10MouseClicked
        multiplicador = 10;
    }//GEN-LAST:event_lblX10MouseClicked

    private void lblX2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblX2MouseClicked
        multiplicador = 2;
    }//GEN-LAST:event_lblX2MouseClicked

    private void lblXerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblXerrarMouseClicked

    private void lblArribaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArribaMouseEntered
        rsscalelabel.RSScaleLabel.setScaleLabel(lblArriba,"src/ImagenesJuego/donw.png");
    }//GEN-LAST:event_lblArribaMouseEntered

    private void lblAbajoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbajoMouseEntered
        rsscalelabel.RSScaleLabel.setScaleLabel(lblAbajo,"src/ImagenesJuego/up.png");
    }//GEN-LAST:event_lblAbajoMouseEntered

    private void lblArribaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArribaMouseExited
        rsscalelabel.RSScaleLabel.setScaleLabel(lblArriba,"src/ImagenesJuego/donwB.png");
    }//GEN-LAST:event_lblArribaMouseExited

    private void lblAbajoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbajoMouseExited
        rsscalelabel.RSScaleLabel.setScaleLabel(lblAbajo,"src/ImagenesJuego/upB.png");
    }//GEN-LAST:event_lblAbajoMouseExited

    private void lblX2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblX2MouseEntered
        rsscalelabel.RSScaleLabel.setScaleLabel(lblX2,"src/ImagenesJuego/x2B.png");
    }//GEN-LAST:event_lblX2MouseEntered

    private void lblX2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblX2MouseExited
        rsscalelabel.RSScaleLabel.setScaleLabel(lblX2,"src/ImagenesJuego/x2.png");
    }//GEN-LAST:event_lblX2MouseExited

    private void lblX5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblX5MouseEntered
        rsscalelabel.RSScaleLabel.setScaleLabel(lblX5,"src/ImagenesJuego/x5B.png");
    }//GEN-LAST:event_lblX5MouseEntered

    private void lblX5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblX5MouseExited
        rsscalelabel.RSScaleLabel.setScaleLabel(lblX5,"src/ImagenesJuego/x5.png");
    }//GEN-LAST:event_lblX5MouseExited

    private void lblX10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblX10MouseEntered
        rsscalelabel.RSScaleLabel.setScaleLabel(lblX10,"src/ImagenesJuego/x10B.png");
    }//GEN-LAST:event_lblX10MouseEntered

    private void lblX10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblX10MouseExited
        rsscalelabel.RSScaleLabel.setScaleLabel(lblX10,"src/ImagenesJuego/x10.png");
    }//GEN-LAST:event_lblX10MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fmr_JuegoDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmr_JuegoDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmr_JuegoDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmr_JuegoDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmr_JuegoDos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl36;
    private javax.swing.JLabel lbl37;
    private javax.swing.JLabel lbl38;
    private javax.swing.JLabel lbl39;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl40;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl45;
    private javax.swing.JLabel lbl46;
    private javax.swing.JLabel lbl47;
    private javax.swing.JLabel lbl48;
    private javax.swing.JLabel lbl49;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl51;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl53;
    private javax.swing.JLabel lbl54;
    private javax.swing.JLabel lbl55;
    private javax.swing.JLabel lbl56;
    private javax.swing.JLabel lbl57;
    private javax.swing.JLabel lbl58;
    private javax.swing.JLabel lbl59;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl60;
    private javax.swing.JLabel lbl61;
    private javax.swing.JLabel lbl62;
    private javax.swing.JLabel lbl63;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl71;
    private javax.swing.JLabel lbl72;
    private javax.swing.JLabel lbl73;
    private javax.swing.JLabel lbl74;
    private javax.swing.JLabel lbl75;
    private javax.swing.JLabel lbl76;
    private javax.swing.JLabel lbl77;
    private javax.swing.JLabel lbl78;
    private javax.swing.JLabel lbl79;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl80;
    private javax.swing.JLabel lbl81;
    private javax.swing.JLabel lbl82;
    private javax.swing.JLabel lbl83;
    private javax.swing.JLabel lbl84;
    private javax.swing.JLabel lbl85;
    private javax.swing.JLabel lbl86;
    private javax.swing.JLabel lbl87;
    private javax.swing.JLabel lbl88;
    private javax.swing.JLabel lbl89;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lbl90;
    private javax.swing.JLabel lbl91;
    private javax.swing.JLabel lbl92;
    private javax.swing.JLabel lbl93;
    private javax.swing.JLabel lbl94;
    private javax.swing.JLabel lbl95;
    private javax.swing.JLabel lbl96;
    private javax.swing.JLabel lbl97;
    private javax.swing.JLabel lbl98;
    private javax.swing.JLabel lblAbajo;
    private javax.swing.JLabel lblArriba;
    private javax.swing.JLabel lblBarra;
    private javax.swing.JLabel lblBarraBajar;
    private javax.swing.JLabel lblBet;
    private javax.swing.JLabel lblCuatro;
    private javax.swing.JLabel lblDos;
    private javax.swing.JLabel lblFondoGame;
    private javax.swing.JLabel lblFondoGiros;
    private javax.swing.JLabel lblGiros;
    private javax.swing.JLabel lblMultiplicador;
    private javax.swing.JLabel lblPremio;
    private javax.swing.JLabel lblRestard;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSumador;
    private javax.swing.JLabel lblT1;
    private javax.swing.JLabel lblT10;
    private javax.swing.JLabel lblT2;
    private javax.swing.JLabel lblT3;
    private javax.swing.JLabel lblT4;
    private javax.swing.JLabel lblT5;
    private javax.swing.JLabel lblT6;
    private javax.swing.JLabel lblT7;
    private javax.swing.JLabel lblT8;
    private javax.swing.JLabel lblT9;
    private javax.swing.JLabel lblTres;
    private javax.swing.JLabel lblTres1;
    private javax.swing.JLabel lblUno;
    private javax.swing.JLabel lblUno1;
    private javax.swing.JLabel lblUp;
    private javax.swing.JLabel lblX10;
    private javax.swing.JLabel lblX2;
    private javax.swing.JLabel lblX5;
    private javax.swing.JLabel lblXerrar;
    private javax.swing.JLabel lblprimero;
    private javax.swing.JLabel lblprimero1;
    private javax.swing.JLabel lblprimero2;
    private javax.swing.JLabel lblprimero3;
    private javax.swing.JLabel lblprimero4;
    private javax.swing.JLabel lvlApuesta;
    // End of variables declaration//GEN-END:variables
}
