/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Getter_and_Setter.Cantidades;
import Getter_and_Setter.Precios;
import javax.swing.JOptionPane;

/**
 *
 * @author José
 */
public class Mesa4 extends javax.swing.JFrame {

    /**
     * Creates new form Mesa1
     */
    public Mesa4() {
        initComponents();
    }

    Cantidades C = new Cantidades(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    Precios P = new Precios(1000.0,2000.0, 1200.0, 1500.0, 1300.0,  1600.0, 900.0, 1350.0, 1100.0, 1700.0, 1000.0, 1000.0, 600.0, 700.0,1300.0,1350.0, 700.0, 850.0); 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnInicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Comprar = new javax.swing.JButton();
        Tacos = new javax.swing.JButton();
        Hamburguesa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Burritos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PapasSupremas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        hamburguesaSimple = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        hamburguesaDoble = new javax.swing.JRadioButton();
        tacoPequeño = new javax.swing.JRadioButton();
        tacoGrande = new javax.swing.JRadioButton();
        papasPequeñas = new javax.swing.JRadioButton();
        papasGrandes = new javax.swing.JRadioButton();
        nachosPequeños = new javax.swing.JRadioButton();
        nachosGrandes = new javax.swing.JRadioButton();
        cantidadhamSimple = new javax.swing.JTextField();
        txtotal = new javax.swing.JTextField();
        cantidadhamDoble = new javax.swing.JTextField();
        cantidadtacoPequeño = new javax.swing.JTextField();
        cantidadtacoGrande = new javax.swing.JTextField();
        cantidadpapasPequeñas = new javax.swing.JTextField();
        cantidadpapasGrandes = new javax.swing.JTextField();
        cantidadnachosPequeños = new javax.swing.JTextField();
        cantidadnachosGrandes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        Button3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        NachosSupremos = new javax.swing.JButton();
        burritosGrande = new javax.swing.JRadioButton();
        burritosPequeños = new javax.swing.JRadioButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane10 = new javax.swing.JTextPane();
        cantidadburritogrande = new javax.swing.JTextField();
        cantidadburritopequeño = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        OtrasBebidas = new javax.swing.JButton();
        Gaseosas = new javax.swing.JButton();
        RefrescoNatural = new javax.swing.JButton();
        Batidos = new javax.swing.JButton();
        CocaCola = new javax.swing.JRadioButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPane11 = new javax.swing.JTextPane();
        cantidadcocacola = new javax.swing.JTextField();
        Fresca = new javax.swing.JRadioButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextPane12 = new javax.swing.JTextPane();
        cantidadfresca = new javax.swing.JTextField();
        JugoNaranja = new javax.swing.JRadioButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextPane13 = new javax.swing.JTextPane();
        cantidadjugonaranja = new javax.swing.JTextField();
        Frutas = new javax.swing.JRadioButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextPane14 = new javax.swing.JTextPane();
        cantidadfrescomora = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextPane15 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextPane16 = new javax.swing.JTextPane();
        BatidoMora = new javax.swing.JRadioButton();
        BatidoFresa = new javax.swing.JRadioButton();
        cantidadbatidomora = new javax.swing.JTextField();
        cantidadbatidofresa = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextPane17 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextPane18 = new javax.swing.JTextPane();
        Chocolate = new javax.swing.JRadioButton();
        Cafe = new javax.swing.JRadioButton();
        cantidadchocolate = new javax.swing.JTextField();
        cantidadcafe = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jTextField1 = new javax.swing.JTextField();
        jBGuardarcompra = new javax.swing.JButton();
        jButtonRefrescasrPrecios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Bienvenido a Mesa #1");

        BtnInicio.setBackground(new java.awt.Color(0, 0, 51));
        BtnInicio.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(255, 255, 0));
        BtnInicio.setText("Inicio");
        BtnInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BtnInicioStateChanged(evt);
            }
        });
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Bebidas");

        Comprar.setBackground(new java.awt.Color(0, 0, 51));
        Comprar.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        Comprar.setForeground(new java.awt.Color(255, 255, 0));
        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        Tacos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Tacos.jpg"))); // NOI18N
        Tacos.setText("jButton1");

        Hamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hamburguesa.JPG"))); // NOI18N
        Hamburguesa.setText("jButton1");
        Hamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HamburguesaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Tacos");

        Burritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/burritos.jpg"))); // NOI18N
        Burritos.setText("jButton1");
        Burritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurritosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Papas Supremas");

        PapasSupremas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Papas Supremas.png"))); // NOI18N
        PapasSupremas.setText("jButton1");

        jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Hamburguesas");

        hamburguesaSimple.setText("Hamburguesa Simple");
        hamburguesaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamburguesaSimpleActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Nachos Supremos");

        hamburguesaDoble.setText("Hamburguesa Doble");
        hamburguesaDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamburguesaDobleActionPerformed(evt);
            }
        });

        tacoPequeño.setText("Taco Pequeño");
        tacoPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tacoPequeñoActionPerformed(evt);
            }
        });

        tacoGrande.setText("Taco Grande");
        tacoGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tacoGrandeActionPerformed(evt);
            }
        });

        papasPequeñas.setText("Papas Pequeñas");
        papasPequeñas.setToolTipText("");
        papasPequeñas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papasPequeñasActionPerformed(evt);
            }
        });

        papasGrandes.setText("Papas Grandes");
        papasGrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papasGrandesActionPerformed(evt);
            }
        });

        nachosPequeños.setText("Nachos Pequeños");
        nachosPequeños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nachosPequeñosActionPerformed(evt);
            }
        });

        nachosGrandes.setText("Nachos Grandes");
        nachosGrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nachosGrandesActionPerformed(evt);
            }
        });

        cantidadhamSimple.setText("0");
        cantidadhamSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadhamSimpleActionPerformed(evt);
            }
        });

        txtotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        txtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotalActionPerformed(evt);
            }
        });

        cantidadhamDoble.setText("0");
        cantidadhamDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadhamDobleActionPerformed(evt);
            }
        });

        cantidadtacoPequeño.setText("0");

        cantidadtacoGrande.setText("0");
        cantidadtacoGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadtacoGrandeActionPerformed(evt);
            }
        });

        cantidadpapasPequeñas.setText("0");
        cantidadpapasPequeñas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadpapasPequeñasActionPerformed(evt);
            }
        });

        cantidadpapasGrandes.setText("0");
        cantidadpapasGrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadpapasGrandesActionPerformed(evt);
            }
        });

        cantidadnachosPequeños.setText("0");
        cantidadnachosPequeños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadnachosPequeñosActionPerformed(evt);
            }
        });

        cantidadnachosGrandes.setText("0");

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setText("Precio = ¢1000");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextPane1);

        jTextPane2.setEditable(false);
        jTextPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane2.setText("Precio = ¢2000");
        jScrollPane2.setViewportView(jTextPane2);

        Button3.setBackground(new java.awt.Color(0, 0, 51));
        Button3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 10)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 255, 0));
        Button3.setText("Ver subtotal");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        jTextPane3.setEditable(false);
        jTextPane3.setBorder(null);
        jTextPane3.setText("Precio = ¢1200");
        jTextPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(jTextPane3);

        jTextPane4.setEditable(false);
        jTextPane4.setBorder(null);
        jTextPane4.setText("Precio = ¢1500");
        jTextPane4.setToolTipText("");
        jTextPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane4.setViewportView(jTextPane4);

        jTextPane5.setEditable(false);
        jTextPane5.setBorder(null);
        jTextPane5.setText("Precio = ¢1300");
        jTextPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane5.setViewportView(jTextPane5);

        jTextPane6.setEditable(false);
        jTextPane6.setBorder(null);
        jTextPane6.setText("Precio = ¢1350");
        jTextPane6.setToolTipText("");
        jTextPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane6.setViewportView(jTextPane6);

        jTextPane7.setEditable(false);
        jTextPane7.setBorder(null);
        jTextPane7.setText("Precio = ¢1600");
        jTextPane7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane7.setViewportView(jTextPane7);

        jTextPane8.setEditable(false);
        jTextPane8.setBorder(null);
        jTextPane8.setText("Precio = ¢1100");
        jTextPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane8.setViewportView(jTextPane8);

        jLabel10.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("Burritos");

        NachosSupremos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/nachos.jpg"))); // NOI18N
        NachosSupremos.setText("jButton1");
        NachosSupremos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NachosSupremosActionPerformed(evt);
            }
        });

        burritosGrande.setText("Burrito Grande");
        burritosGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burritosGrandeActionPerformed(evt);
            }
        });

        burritosPequeños.setText("Burrito Pequeño");
        burritosPequeños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burritosPequeñosActionPerformed(evt);
            }
        });

        jTextPane9.setEditable(false);
        jTextPane9.setBorder(null);
        jTextPane9.setText("Precio = ¢900");
        jTextPane9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane9.setViewportView(jTextPane9);

        jTextPane10.setEditable(false);
        jTextPane10.setBorder(null);
        jTextPane10.setText("Precio = ¢1700");
        jTextPane10.setToolTipText("");
        jTextPane10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane10.setViewportView(jTextPane10);

        cantidadburritogrande.setText("0");
        cantidadburritogrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadburritograndeActionPerformed(evt);
            }
        });

        cantidadburritopequeño.setText("0");
        cantidadburritopequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadburritopequeñoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("¿Que desea ordenar?");

        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Comidas");

        jLabel11.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("Subtotal de la Compra");

        jLabel12.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Gaseosas");

        jLabel13.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Fresco Natural");

        jLabel14.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("Batidos");

        jLabel15.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Otros");

        OtrasBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Cafe.jpg"))); // NOI18N
        OtrasBebidas.setText("jButton1");

        Gaseosas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Gaseosas.jpg"))); // NOI18N
        Gaseosas.setText("jButton1");

        RefrescoNatural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/FrescoNatural.jpg"))); // NOI18N
        RefrescoNatural.setText("jButton1");

        Batidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Batidos.jpg"))); // NOI18N
        Batidos.setText("jButton1");

        CocaCola.setText("Coca Cola");
        CocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocaColaActionPerformed(evt);
            }
        });

        jTextPane11.setEditable(false);
        jTextPane11.setBorder(null);
        jTextPane11.setText("Precio = ¢1000");
        jTextPane11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane11.setViewportView(jTextPane11);

        cantidadcocacola.setText("0");
        cantidadcocacola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadcocacolaActionPerformed(evt);
            }
        });

        Fresca.setText("Fresca");
        Fresca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrescaActionPerformed(evt);
            }
        });

        jTextPane12.setEditable(false);
        jTextPane12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane12.setText("Precio = ¢1000");
        jScrollPane12.setViewportView(jTextPane12);

        cantidadfresca.setText("0");
        cantidadfresca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadfrescaActionPerformed(evt);
            }
        });

        JugoNaranja.setText("Jugo de Naranja");
        JugoNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugoNaranjaActionPerformed(evt);
            }
        });

        jTextPane13.setEditable(false);
        jTextPane13.setBorder(null);
        jTextPane13.setText("Precio = ¢600");
        jTextPane13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane13.setViewportView(jTextPane13);

        cantidadjugonaranja.setText("0");
        cantidadjugonaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadjugonaranjaActionPerformed(evt);
            }
        });

        Frutas.setText("Fresco de Mora");
        Frutas.setActionCommand("Fresco de Frutas");
        Frutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrutasActionPerformed(evt);
            }
        });

        jTextPane14.setEditable(false);
        jTextPane14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane14.setText("Precio = ¢700");
        jScrollPane14.setViewportView(jTextPane14);

        cantidadfrescomora.setText("0");
        cantidadfrescomora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadfrescomoraActionPerformed(evt);
            }
        });

        jTextPane15.setEditable(false);
        jTextPane15.setBorder(null);
        jTextPane15.setText("Precio = ¢1300");
        jTextPane15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane15.setViewportView(jTextPane15);

        jTextPane16.setEditable(false);
        jTextPane16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane16.setText("Precio = ¢1350");
        jScrollPane16.setViewportView(jTextPane16);

        BatidoMora.setText("Batido de Mora");
        BatidoMora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatidoMoraActionPerformed(evt);
            }
        });

        BatidoFresa.setText("Batido de Fresa");
        BatidoFresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatidoFresaActionPerformed(evt);
            }
        });

        cantidadbatidomora.setText("0");
        cantidadbatidomora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadbatidomoraActionPerformed(evt);
            }
        });

        cantidadbatidofresa.setText("0");
        cantidadbatidofresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadbatidofresaActionPerformed(evt);
            }
        });

        jTextPane17.setEditable(false);
        jTextPane17.setBorder(null);
        jTextPane17.setText("Precio = ¢700");
        jTextPane17.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane17.setViewportView(jTextPane17);

        jTextPane18.setEditable(false);
        jTextPane18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane18.setText("Precio = ¢850");
        jScrollPane18.setViewportView(jTextPane18);

        Chocolate.setText("Chocolate");
        Chocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChocolateActionPerformed(evt);
            }
        });

        Cafe.setText("Café");
        Cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CafeActionPerformed(evt);
            }
        });

        cantidadchocolate.setText("0");
        cantidadchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadchocolateActionPerformed(evt);
            }
        });

        cantidadcafe.setText("0");
        cantidadcafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadcafeActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("₡");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jBGuardarcompra.setText("Guardar");
        jBGuardarcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarcompraActionPerformed(evt);
            }
        });

        jButtonRefrescasrPrecios.setText("Refrescar precios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBGuardarcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(Button3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadcocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Gaseosas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fresca, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadfresca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(327, 327, 327)
                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cantidadhamDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(hamburguesaSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tacos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cantidadtacoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RefrescoNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JugoNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cantidadjugonaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Frutas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cantidadfrescomora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tacoGrande, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tacoPequeño, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cantidadtacoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(77, 77, 77))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cantidadhamSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(hamburguesaDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PapasSupremas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(papasGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(cantidadpapasPequeñas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jScrollPane7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(cantidadpapasGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Batidos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(BatidoFresa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cantidadbatidofresa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(BatidoMora, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cantidadbatidomora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(papasPequeñas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cantidadnachosPequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nachosGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cantidadnachosGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(OtrasBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cantidadcafe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cantidadchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(NachosSupremos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nachosPequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(47, 47, 47)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadburritopequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(burritosPequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(burritosGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Burritos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonRefrescasrPrecios)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadburritogrande, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Tacos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NachosSupremos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Burritos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PapasSupremas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hamburguesaSimple)
                            .addComponent(tacoPequeño))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadtacoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(burritosPequeños, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nachosPequeños, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(papasPequeñas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cantidadpapasPequeñas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cantidadhamSimple, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantidadnachosPequeños, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane8)
                                        .addComponent(jScrollPane9)
                                        .addComponent(cantidadburritopequeño, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hamburguesaDoble)
                        .addComponent(tacoGrande)
                        .addComponent(burritosGrande))
                    .addComponent(nachosGrandes)
                    .addComponent(papasGrandes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cantidadhamDoble, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane10)
                        .addComponent(cantidadburritogrande))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cantidadtacoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cantidadpapasGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cantidadnachosGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Gaseosas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OtrasBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Batidos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))
                                    .addComponent(RefrescoNatural, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(Cafe)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cantidadcafe)
                                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(Chocolate)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cantidadchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 12, Short.MAX_VALUE))
                                            .addComponent(jScrollPane18)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CocaCola)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cantidadcocacola)
                                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addComponent(Fresca)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane12)
                                            .addComponent(cantidadfresca, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JugoNaranja)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cantidadjugonaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BatidoFresa)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cantidadbatidofresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Frutas, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BatidoMora, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane14)
                                    .addComponent(jScrollPane16)
                                    .addComponent(cantidadbatidomora, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                    .addComponent(cantidadfrescomora))))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBGuardarcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButtonRefrescasrPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(373, 373, 373))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadcafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadcafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadcafeActionPerformed

    private void cantidadchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadchocolateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadchocolateActionPerformed

    private void CafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CafeActionPerformed
        cantidadcafe.setText("");
    }//GEN-LAST:event_CafeActionPerformed

    private void ChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChocolateActionPerformed
        cantidadchocolate.setText("");
    }//GEN-LAST:event_ChocolateActionPerformed

    private void cantidadbatidofresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadbatidofresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadbatidofresaActionPerformed

    private void cantidadbatidomoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadbatidomoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadbatidomoraActionPerformed

    private void BatidoFresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatidoFresaActionPerformed
        cantidadbatidofresa.setText("");
    }//GEN-LAST:event_BatidoFresaActionPerformed

    private void BatidoMoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatidoMoraActionPerformed
        cantidadbatidomora.setText("");
    }//GEN-LAST:event_BatidoMoraActionPerformed

    private void cantidadfrescomoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadfrescomoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadfrescomoraActionPerformed

    private void FrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrutasActionPerformed
        cantidadfrescomora.setText("");
    }//GEN-LAST:event_FrutasActionPerformed

    private void cantidadjugonaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadjugonaranjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadjugonaranjaActionPerformed

    private void JugoNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugoNaranjaActionPerformed
        cantidadjugonaranja.setText("");
    }//GEN-LAST:event_JugoNaranjaActionPerformed

    private void cantidadfrescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadfrescaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadfrescaActionPerformed

    private void FrescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrescaActionPerformed
        cantidadfresca.setText("");
    }//GEN-LAST:event_FrescaActionPerformed

    private void cantidadcocacolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadcocacolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadcocacolaActionPerformed

    private void CocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocaColaActionPerformed
        cantidadcocacola.setText("");
    }//GEN-LAST:event_CocaColaActionPerformed

    private void cantidadburritopequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadburritopequeñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadburritopequeñoActionPerformed

    private void cantidadburritograndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadburritograndeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadburritograndeActionPerformed

    private void NachosSupremosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NachosSupremosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NachosSupremosActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        Double Hamburguesa_sim = 1000.0;
        Double Hamburguesa_doble = 2000.0;
        Double taco_pequeno = 1200.0;
        Double taco_grande = 1500.0;
        Double papas_pequeno = 1300.0;
        Double papas_grande = 1600.0;
        Double nachos_pequeno = 900.0;
        Double nachos_grande = 1350.0;
        Double burrito_pequeno = 1100.0;
        Double burrito_grande = 1700.0;
        Double coca_cola = 1000.0;
        Double fresca = 1000.0;
        Double jugo_naranja = 600.0;
        Double fresco_mora = 700.0;
        Double batido_fresa = 1300.0;
        Double batido_mora = 1350.0;
        Double cafe = 700.0;
        Double chocolate = 850.0;

       

        try {

            //COMIDAS
            Double total = C.getCantidadhamSimple() * Hamburguesa_sim;        
            Double total2 = C.getCantidadhamdoble() * Hamburguesa_doble;           
            Double total3 = C.getCantidadtacosPequeño() * taco_pequeno;         
            Double total4 = C.getCantidadtacosGrande() * taco_grande;          
            Double total5 = C.getCantidadpapasPequeñas() * papas_pequeno;           
            Double total6 = C.getCantidadpapasGrandes() * papas_grande;          
            Double total7 = C.getCantidadnachosPequeños() * nachos_pequeno;            
            Double total8 = C.getCantidadnachosGrandes() * nachos_grande;           
            Double total9 = C.getCantidadburritoPequeños() * burrito_pequeno;          
            Double total10 = C.getCantidadburritosGrandes() * burrito_grande;

            //BEBIDAS
            Double total11 = C.getCantidadCocaCola() * coca_cola;   
            Double total12 = C.getCantidadfresca() * fresca;            
            Double total13 = C.getCantidadFrescoDeNaranja() * jugo_naranja;          
            Double total14 = C.getCantidadFrescoDeMora() * fresco_mora;         
            Double total15 = C.getCantidadBatidoDeFresa() * batido_fresa;            
            Double total16 = C.getCantidadBatidoDeMora() * batido_mora;           
            Double total17 = C.getCantidadCafe() * cafe;          
            Double total18 = C.getCantidadChocolate() * chocolate;
           
            Double subtotal = total + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10 + total11 + total12 + total13 + total14 + total15 + total16 + total17 + total18;
            String Subtotal = String.valueOf(subtotal);
            txtotal.setText(Subtotal);
           
            if (subtotal < 0) {
                JOptionPane.showMessageDialog(null, "Error numero negativo ", "MENSAJE", JOptionPane.WARNING_MESSAGE);
                txtotal.setText("");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en numero ingresado ", "MENSAJE", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_Button3ActionPerformed

    private void cantidadnachosPequeñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadnachosPequeñosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadnachosPequeñosActionPerformed

    private void cantidadpapasGrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadpapasGrandesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadpapasGrandesActionPerformed

    private void cantidadpapasPequeñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadpapasPequeñasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadpapasPequeñasActionPerformed

    private void cantidadtacoGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadtacoGrandeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadtacoGrandeActionPerformed

    private void cantidadhamDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadhamDobleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadhamDobleActionPerformed

    private void txtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotalActionPerformed

    private void cantidadhamSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadhamSimpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadhamSimpleActionPerformed

    private void papasGrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papasGrandesActionPerformed
        cantidadpapasGrandes.setText("");
    }//GEN-LAST:event_papasGrandesActionPerformed

    private void papasPequeñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papasPequeñasActionPerformed
        cantidadpapasPequeñas.setText("");
    }//GEN-LAST:event_papasPequeñasActionPerformed

    private void tacoPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tacoPequeñoActionPerformed
        cantidadtacoPequeño.setText("");
    }//GEN-LAST:event_tacoPequeñoActionPerformed

    private void hamburguesaDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamburguesaDobleActionPerformed
        cantidadhamDoble.setText("");
    }//GEN-LAST:event_hamburguesaDobleActionPerformed

    private void hamburguesaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamburguesaSimpleActionPerformed
        cantidadhamSimple.setText("");
    }//GEN-LAST:event_hamburguesaSimpleActionPerformed

    private void BurritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurritosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BurritosActionPerformed

    private void HamburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HamburguesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HamburguesaActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed

        Factura f = new Factura();
        f.setVisible(true);
        this.dispose();
        Factura.txtrecibirsubtotal.setText(txtotal.getText());
    }//GEN-LAST:event_ComprarActionPerformed

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        Principal P = new Principal();
        P.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BtnInicioStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInicioStateChanged

    private void tacoGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tacoGrandeActionPerformed
        cantidadtacoGrande.setText("");
    }//GEN-LAST:event_tacoGrandeActionPerformed

    private void nachosPequeñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachosPequeñosActionPerformed
        cantidadnachosPequeños.setText("");
    }//GEN-LAST:event_nachosPequeñosActionPerformed

    private void nachosGrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachosGrandesActionPerformed
        cantidadnachosGrandes.setText("");
    }//GEN-LAST:event_nachosGrandesActionPerformed

    private void burritosPequeñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burritosPequeñosActionPerformed
        cantidadburritopequeño.setText("");
    }//GEN-LAST:event_burritosPequeñosActionPerformed

    private void burritosGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burritosGrandeActionPerformed
        cantidadburritogrande.setText("");
    }//GEN-LAST:event_burritosGrandeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
//////////////////////////////////////////////////Crear los setter////////////////////////////////
    private void jBGuardarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarcompraActionPerformed
        //comidas
        double cantidadhamsimple = Double.parseDouble(cantidadhamSimple.getText().trim());
        double cantidadhamdoble = Double.parseDouble(cantidadhamDoble.getText().trim());

        double cantidadtacopequeno = Double.parseDouble(cantidadtacoPequeño.getText().trim());
        double cantidadtacogrande = Double.parseDouble(cantidadtacoGrande.getText().trim());

        double cantidadpapaspequena = Double.parseDouble(cantidadpapasPequeñas.getText().trim());
        double cantidadpapasgrande = Double.parseDouble(cantidadpapasGrandes.getText().trim());

        double cantidadnachospequeno = Double.parseDouble(cantidadnachosPequeños.getText().trim());
        double cantidadnachosgrande = Double.parseDouble(cantidadnachosGrandes.getText().trim());

        double cantidadburritospequeno = Double.parseDouble(cantidadburritopequeño.getText().trim());
        double cantidadburritosgrande = Double.parseDouble(cantidadburritogrande.getText().trim());
        //bebidas

        double cantidadcoca_cola = Double.parseDouble(cantidadcocacola.getText().trim());
        double cantidad_fresca = Double.parseDouble(cantidadfresca.getText().trim());

        double cantidad_jugonaranja = Double.parseDouble(cantidadjugonaranja.getText().trim());     
        double cantidad_frescomora = Double.parseDouble(cantidadfrescomora.getText().trim());
     
        double cantidad_batidofresa = Double.parseDouble(cantidadbatidofresa.getText().trim());    
        double cantidad_batidomora = Double.parseDouble(cantidadbatidomora.getText().trim());
       
        double cantidad_cafe = Double.parseDouble(cantidadcafe.getText().trim());       
        double cantidad_chocolate = Double.parseDouble(cantidadchocolate.getText().trim());
       

     
        //Comidas
        C.setCantidadhamSimple(cantidadhamsimple);
        C.setCantidadhamdoble(cantidadhamdoble);

        C.setCantidadtacosPequeño(cantidadtacopequeno);
        C.setCantidadtacosGrande(cantidadtacogrande);

        C.setCantidadpapasPequeñas(cantidadpapaspequena);
        C.setCantidadpapasGrandes(cantidadpapasgrande);

        C.setCantidadnachosPequeños(cantidadnachospequeno);
        C.setCantidadpapasGrandes(cantidadnachosgrande);

        C.setCantidadburritoPequeños(cantidadburritospequeno);
        C.setCantidadburritosGrandes(cantidadburritosgrande);

        //bebidas
        C.setCantidadCocaCola(cantidadcoca_cola);
        C.setCantidadfresca(cantidad_fresca);
        
        C.setCantidadFrescoDeNaranja(cantidad_jugonaranja);
        C.setCantidadFrescoDeMora(cantidad_frescomora);
        C.setCantidadBatidoDeFresa(cantidad_batidofresa);
        C.setCantidadBatidoDeMora(cantidad_batidomora);
        
        C.setCantidadCafe(cantidad_cafe);
        C.setCantidadChocolate(cantidad_chocolate);
        
        
    }//GEN-LAST:event_jBGuardarcompraActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mesa4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BatidoFresa;
    private javax.swing.JRadioButton BatidoMora;
    private javax.swing.JButton Batidos;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton Burritos;
    private javax.swing.JButton Button3;
    private javax.swing.JRadioButton Cafe;
    private javax.swing.JRadioButton Chocolate;
    private javax.swing.JRadioButton CocaCola;
    private javax.swing.JButton Comprar;
    private javax.swing.JRadioButton Fresca;
    private javax.swing.JRadioButton Frutas;
    private javax.swing.JButton Gaseosas;
    private javax.swing.JButton Hamburguesa;
    private javax.swing.JRadioButton JugoNaranja;
    private javax.swing.JButton NachosSupremos;
    private javax.swing.JButton OtrasBebidas;
    private javax.swing.JButton PapasSupremas;
    private javax.swing.JButton RefrescoNatural;
    private javax.swing.JButton Tacos;
    private javax.swing.JRadioButton burritosGrande;
    private javax.swing.JRadioButton burritosPequeños;
    private javax.swing.JTextField cantidadbatidofresa;
    private javax.swing.JTextField cantidadbatidomora;
    private javax.swing.JTextField cantidadburritogrande;
    private javax.swing.JTextField cantidadburritopequeño;
    private javax.swing.JTextField cantidadcafe;
    private javax.swing.JTextField cantidadchocolate;
    private javax.swing.JTextField cantidadcocacola;
    private javax.swing.JTextField cantidadfresca;
    private javax.swing.JTextField cantidadfrescomora;
    private javax.swing.JTextField cantidadhamDoble;
    private javax.swing.JTextField cantidadhamSimple;
    private javax.swing.JTextField cantidadjugonaranja;
    private javax.swing.JTextField cantidadnachosGrandes;
    private javax.swing.JTextField cantidadnachosPequeños;
    private javax.swing.JTextField cantidadpapasGrandes;
    private javax.swing.JTextField cantidadpapasPequeñas;
    private javax.swing.JTextField cantidadtacoGrande;
    private javax.swing.JTextField cantidadtacoPequeño;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JRadioButton hamburguesaDoble;
    private javax.swing.JRadioButton hamburguesaSimple;
    private javax.swing.JButton jBGuardarcompra;
    private javax.swing.JButton jButtonRefrescasrPrecios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane10;
    private javax.swing.JTextPane jTextPane11;
    private javax.swing.JTextPane jTextPane12;
    private javax.swing.JTextPane jTextPane13;
    private javax.swing.JTextPane jTextPane14;
    private javax.swing.JTextPane jTextPane15;
    private javax.swing.JTextPane jTextPane16;
    private javax.swing.JTextPane jTextPane17;
    private javax.swing.JTextPane jTextPane18;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextPane jTextPane9;
    private javax.swing.JRadioButton nachosGrandes;
    private javax.swing.JRadioButton nachosPequeños;
    private javax.swing.JRadioButton papasGrandes;
    private javax.swing.JRadioButton papasPequeñas;
    private javax.swing.JRadioButton tacoGrande;
    private javax.swing.JRadioButton tacoPequeño;
    private javax.swing.JTextField txtotal;
    // End of variables declaration//GEN-END:variables
}
