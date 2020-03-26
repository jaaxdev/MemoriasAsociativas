/*
	Jaaziel Isai Rebollar Calzada
	Memorias Asociativas
	Octubre 2018

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Memorias extends JFrame implements ActionListener{
	
	JPanel panelLetra, panelRuido, panelMinimoLetra, panelMaximoLetra, panelMinimoRuido, panelMaximoRuido;
    JButton[] btnLetra, btnRuido, btnMinimoLetra, btnMaximoLetra, btnMinimoRuido, btnMaximoRuido;
    JLabel[] letreros;
    JPanel panelLetra2, panelRuido2, panelMinimoLetra2, panelMaximoLetra2, panelMinimoRuido2, panelMaximoRuido2;
    JButton[] btnLetra2, btnRuido2, btnMinimoLetra2, btnMaximoLetra2, btnMinimoRuido2, btnMaximoRuido2;
    JLabel[] letreros2;
    JPanel panelLetra3, panelRuido3, panelMinimoLetra3, panelMaximoLetra3, panelMinimoRuido3, panelMaximoRuido3;
    JButton[] btnLetra3, btnRuido3, btnMinimoLetra3, btnMaximoLetra3, btnMinimoRuido3, btnMaximoRuido3;
    JLabel[] letreros3;

    int[][] matrizAlfaLetra, matrizAlfaRuido, minimo, maximo, MinBetaLetra, MaxBetaLetra, MinBetaRuido, MaxBetaRuido;
    int[] vectorLetra, vectorRuido, vectorFinMinLetra, vectorFinMaxLetra, vectorFinMinRuido, vectorFinMaxRuido;
    int[][] matrizAlfaLetra2, matrizAlfaRuido2, minimo2, maximo2, MinBetaLetra2, MaxBetaLetra2, MinBetaRuido2, MaxBetaRuido2;
    int[] vectorLetra2, vectorRuido2, vectorFinMinLetra2, vectorFinMaxLetra2, vectorFinMinRuido2, vectorFinMaxRuido2;
    int[][] matrizAlfaLetra3, matrizAlfaRuido3, minimo3, maximo3, MinBetaLetra3, MaxBetaLetra3, MinBetaRuido3, MaxBetaRuido3;
    int[] vectorLetra3, vectorRuido3, vectorFinMinLetra3, vectorFinMaxLetra3, vectorFinMinRuido3, vectorFinMaxRuido3;
    int n = 0;

    public Memorias(){
    	super( "Memoria Asociativa" );
    	setBounds( 50, 20, 800, 650 );
    	setLayout( null );
    	setResizable( false );
    	initComponents();
    	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
    	setVisible( true );
    }

	private void initComponents(){
		matrizAlfaLetra = new int[12][12];
		matrizAlfaRuido = new int[12][12];
		minimo = new int[12][12];
		maximo = new int[12][12];
		MinBetaLetra = new int[12][12];
		MaxBetaLetra = new int[12][12];
		MinBetaRuido = new int[12][12];
		MaxBetaRuido = new int[12][12];
		vectorLetra = new int[12];
		vectorRuido = new int[12];
		vectorFinMinLetra = new int[12];
		vectorFinMaxLetra = new int[12];
		vectorFinMinRuido = new int[12];
		vectorFinMaxRuido = new int[12];

		matrizAlfaLetra2 = new int[12][12];
		matrizAlfaRuido2 = new int[12][12];
		minimo2 = new int[12][12];
		maximo2 = new int[12][12];
		MinBetaLetra2 = new int[12][12];
		MaxBetaLetra2 = new int[12][12];
		MinBetaRuido2 = new int[12][12];
		MaxBetaRuido2 = new int[12][12];
		vectorLetra2 = new int[12];
		vectorRuido2 = new int[12];
		vectorFinMinLetra2 = new int[12];
		vectorFinMaxLetra2 = new int[12];
		vectorFinMinRuido2 = new int[12];
		vectorFinMaxRuido2 = new int[12];

		matrizAlfaLetra3 = new int[12][12];
		matrizAlfaRuido3 = new int[12][12];
		minimo3 = new int[12][12];
		maximo3 = new int[12][12];
		MinBetaLetra3 = new int[12][12];
		MaxBetaLetra3 = new int[12][12];
		MinBetaRuido3 = new int[12][12];
		MaxBetaRuido3 = new int[12][12];
		vectorLetra3 = new int[12];
		vectorRuido3 = new int[12];
		vectorFinMinLetra3 = new int[12];
		vectorFinMaxLetra3 = new int[12];
		vectorFinMinRuido3 = new int[12];
		vectorFinMaxRuido3 = new int[12];

		for( int i=0; i<vectorLetra.length; i++ ){
			vectorLetra[i] = 0;
			vectorRuido[i] = 0;
			vectorFinMinLetra[i] = 0;
			vectorFinMaxLetra[i] = 0;
			vectorFinMinRuido[i] = 0;
			vectorFinMaxRuido[i] = 0;

			vectorLetra2[i] = 0;
			vectorRuido2[i] = 0;
			vectorFinMinLetra2[i] = 0;
			vectorFinMaxLetra2[i] = 0;
			vectorFinMinRuido2[i] = 0;
			vectorFinMaxRuido2[i] = 0;

			vectorLetra3[i] = 0;
			vectorRuido3[i] = 0;
			vectorFinMinLetra3[i] = 0;
			vectorFinMaxLetra3[i] = 0;
			vectorFinMinRuido3[i] = 0;
			vectorFinMaxRuido3[i] = 0;
		}
		for( int i=0; i<12; i++ ){
			for( int j=0; j<12; j++ ){
				matrizAlfaLetra[i][j] = 0;
				matrizAlfaRuido[i][j] = 0;
				minimo[i][j] = 0;
				maximo[i][j] = 0;
				MinBetaLetra[i][j] = 0;
				MaxBetaLetra[i][j] = 0;
				MinBetaRuido[i][j] = 0;
				MaxBetaRuido[i][j] = 0;

				matrizAlfaLetra2[i][j] = 0;
				matrizAlfaRuido2[i][j] = 0;
				minimo2[i][j] = 0;
				maximo2[i][j] = 0;
				MinBetaLetra2[i][j] = 0;
				MaxBetaLetra2[i][j] = 0;
				MinBetaRuido2[i][j] = 0;
				MaxBetaRuido2[i][j] = 0;

				matrizAlfaLetra3[i][j] = 0;
				matrizAlfaRuido3[i][j] = 0;
				minimo3[i][j] = 0;
				maximo3[i][j] = 0;
				MinBetaLetra3[i][j] = 0;
				MaxBetaLetra3[i][j] = 0;
				MinBetaRuido3[i][j] = 0;
				MaxBetaRuido3[i][j] = 0;
			}
		}

		panelLetra = new JPanel();
        panelRuido = new JPanel();
        panelMinimoLetra = new JPanel();
        panelMaximoLetra = new JPanel();
        panelMinimoRuido = new JPanel();
        panelMaximoRuido = new JPanel();

        panelLetra2 = new JPanel();
        panelRuido2 = new JPanel();
        panelMinimoLetra2 = new JPanel();
        panelMaximoLetra2 = new JPanel();
        panelMinimoRuido2 = new JPanel();
        panelMaximoRuido2 = new JPanel();

        panelLetra3 = new JPanel();
        panelRuido3 = new JPanel();
        panelMinimoLetra3 = new JPanel();
        panelMaximoLetra3 = new JPanel();
        panelMinimoRuido3 = new JPanel();
        panelMaximoRuido3 = new JPanel();
        
        btnLetra = new JButton[12];
        btnRuido = new JButton[12];
        btnMinimoLetra = new JButton[12];
        btnMaximoLetra = new JButton[12];
        btnMinimoRuido = new JButton[12];
        btnMaximoRuido = new JButton[12];

        btnLetra2 = new JButton[12];
        btnRuido2 = new JButton[12];
        btnMinimoLetra2 = new JButton[12];
        btnMaximoLetra2 = new JButton[12];
        btnMinimoRuido2 = new JButton[12];
        btnMaximoRuido2 = new JButton[12];

        btnLetra3 = new JButton[12];
        btnRuido3 = new JButton[12];
        btnMinimoLetra3 = new JButton[12];
        btnMaximoLetra3 = new JButton[12];
        btnMinimoRuido3 = new JButton[12];
        btnMaximoRuido3 = new JButton[12];


        letreros = new JLabel[6];
        letreros[0] = new JLabel( "LETRA" );
        letreros[1] = new JLabel( "RUIDO" );
        letreros[2] = new JLabel( "MINIMOS LETRA" );
        letreros[3] = new JLabel( "MAXIMOS LETRA" );
        letreros[4] = new JLabel( "MINIMOS RUIDO" );
        letreros[5] = new JLabel( "MAXIMOS RUIDO" );

        letreros[0].setBounds( 20, 5, 200, 50 );
        letreros[1].setBounds( 420, 5, 200, 50 );
        letreros[2].setBounds( 140, 5, 200, 50 );
        letreros[3].setBounds( 260, 5, 200, 50 );
        letreros[4].setBounds( 560, 5, 200, 50 );
        letreros[5].setBounds( 680, 5, 200, 50 );

        letreros2 = new JLabel[6];
        letreros2[0] = new JLabel( "LETRA" );
        letreros2[1] = new JLabel( "RUIDO" );
        letreros2[2] = new JLabel( "MINIMOS LETRA" );
        letreros2[3] = new JLabel( "MAXIMOS LETRA" );
        letreros2[4] = new JLabel( "MINIMOS RUIDO" );
        letreros2[5] = new JLabel( "MAXIMOS RUIDO" );

        letreros2[0].setBounds( 20, 205, 200, 50 );
        letreros2[1].setBounds( 420, 205, 200, 50 );
        letreros2[2].setBounds( 140, 205, 200, 50 );
        letreros2[3].setBounds( 260, 205, 200, 50 );
        letreros2[4].setBounds( 560, 205, 200, 50 );
        letreros2[5].setBounds( 680, 205, 200, 50 );

        letreros3 = new JLabel[6];
        letreros3[0] = new JLabel( "LETRA" );
        letreros3[1] = new JLabel( "RUIDO" );
        letreros3[2] = new JLabel( "MINIMOS LETRA" );
        letreros3[3] = new JLabel( "MAXIMOS LETRA" );
        letreros3[4] = new JLabel( "MINIMOS RUIDO" );
        letreros3[5] = new JLabel( "MAXIMOS RUIDO" );

        letreros3[0].setBounds( 20, 405, 200, 50 );
        letreros3[1].setBounds( 420, 405, 200, 50 );
        letreros3[2].setBounds( 140, 405, 200, 50 );
        letreros3[3].setBounds( 260, 405, 200, 50 );
        letreros3[4].setBounds( 560, 405, 200, 50 );
        letreros3[5].setBounds( 680, 405, 200, 50 );
        
        panelLetra.setLayout(new GridLayout(4, 3));
        panelRuido.setLayout(new GridLayout(4, 3));
        panelMinimoLetra.setLayout(new GridLayout(4, 3));
        panelMaximoLetra.setLayout(new GridLayout(4, 3));
        panelMinimoRuido.setLayout(new GridLayout(4, 3));
        panelMaximoRuido.setLayout(new GridLayout(4, 3));

        panelLetra.setBounds( 20, 40, 100, 150 );
        panelRuido.setBounds( 420, 40, 100, 150 );
        panelMinimoLetra.setBounds( 140, 40, 100, 150 );
        panelMaximoLetra.setBounds( 260, 40, 100, 150 );
        panelMinimoRuido.setBounds( 560, 40, 100, 150 );
        panelMaximoRuido.setBounds( 680, 40, 100, 150 );

        panelLetra2.setLayout(new GridLayout(4, 3));
        panelRuido2.setLayout(new GridLayout(4, 3));
        panelMinimoLetra2.setLayout(new GridLayout(4, 3));
        panelMaximoLetra2.setLayout(new GridLayout(4, 3));
        panelMinimoRuido2.setLayout(new GridLayout(4, 3));
        panelMaximoRuido2.setLayout(new GridLayout(4, 3));

        panelLetra2.setBounds( 20, 240, 100, 150 );
        panelRuido2.setBounds( 420, 240, 100, 150 );
        panelMinimoLetra2.setBounds( 140, 240, 100, 150 );
        panelMaximoLetra2.setBounds( 260, 240, 100, 150 );
        panelMinimoRuido2.setBounds( 560, 240, 100, 150 );
        panelMaximoRuido2.setBounds( 680, 240, 100, 150 );

        panelLetra3.setLayout(new GridLayout(4, 3));
        panelRuido3.setLayout(new GridLayout(4, 3));
        panelMinimoLetra3.setLayout(new GridLayout(4, 3));
        panelMaximoLetra3.setLayout(new GridLayout(4, 3));
        panelMinimoRuido3.setLayout(new GridLayout(4, 3));
        panelMaximoRuido3.setLayout(new GridLayout(4, 3));

        panelLetra3.setBounds( 20, 440, 100, 150 );
        panelRuido3.setBounds( 420, 440, 100, 150 );
        panelMinimoLetra3.setBounds( 140, 440, 100, 150 );
        panelMaximoLetra3.setBounds( 260, 440, 100, 150 );
        panelMinimoRuido3.setBounds( 560, 440, 100, 150 );
        panelMaximoRuido3.setBounds( 680, 440, 100, 150 );

        
        for( int i=0; i<btnLetra.length; i++ ){
            btnLetra[i] = new JButton();
            btnLetra[i].setBackground( Color.white );
            btnRuido[i] = new JButton();
            btnRuido[i].setBackground( Color.white );
            btnMinimoLetra[i] = new JButton();
            btnMinimoLetra[i].setEnabled( false );
            btnMinimoLetra[i].setBackground( Color.white );
            btnMaximoLetra[i] = new JButton();
            btnMaximoLetra[i].setEnabled( false );
            btnMaximoLetra[i].setBackground( Color.white );
            btnMinimoRuido[i] = new JButton();
            btnMinimoRuido[i].setEnabled( false );
            btnMinimoRuido[i].setBackground( Color.white );
            btnMaximoRuido[i] = new JButton();
            btnMaximoRuido[i].setEnabled( false );
            btnMaximoRuido[i].setBackground( Color.white );

            btnLetra2[i] = new JButton();
            btnLetra2[i].setBackground( Color.white );
            btnRuido2[i] = new JButton();
            btnRuido2[i].setBackground( Color.white );
            btnMinimoLetra2[i] = new JButton();
            btnMinimoLetra2[i].setEnabled( false );
            btnMinimoLetra2[i].setBackground( Color.white );
            btnMaximoLetra2[i] = new JButton();
            btnMaximoLetra2[i].setEnabled( false );
            btnMaximoLetra2[i].setBackground( Color.white );
            btnMinimoRuido2[i] = new JButton();
            btnMinimoRuido2[i].setEnabled( false );
            btnMinimoRuido2[i].setBackground( Color.white );
            btnMaximoRuido2[i] = new JButton();
            btnMaximoRuido2[i].setEnabled( false );
            btnMaximoRuido2[i].setBackground( Color.white );

            btnLetra3[i] = new JButton();
            btnLetra3[i].setBackground( Color.white );
            btnRuido3[i] = new JButton();
            btnRuido3[i].setBackground( Color.white );
            btnMinimoLetra3[i] = new JButton();
            btnMinimoLetra3[i].setEnabled( false );
            btnMinimoLetra3[i].setBackground( Color.white );
            btnMaximoLetra3[i] = new JButton();
            btnMaximoLetra3[i].setEnabled( false );
            btnMaximoLetra3[i].setBackground( Color.white );
            btnMinimoRuido3[i] = new JButton();
            btnMinimoRuido3[i].setEnabled( false );
            btnMinimoRuido3[i].setBackground( Color.white );
            btnMaximoRuido3[i] = new JButton();
            btnMaximoRuido3[i].setEnabled( false );
            btnMaximoRuido3[i].setBackground( Color.white );
            
            panelLetra.add( btnLetra[i] );
            panelRuido.add( btnRuido[i] );
            panelMinimoLetra.add( btnMinimoLetra[i] );
            panelMaximoLetra.add( btnMaximoLetra[i] );
            panelMinimoRuido.add( btnMinimoRuido[i] );
            panelMaximoRuido.add( btnMaximoRuido[i] );

            panelLetra2.add( btnLetra2[i] );
            panelRuido2.add( btnRuido2[i] );
            panelMinimoLetra2.add( btnMinimoLetra2[i] );
            panelMaximoLetra2.add( btnMaximoLetra2[i] );
            panelMinimoRuido2.add( btnMinimoRuido2[i] );
            panelMaximoRuido2.add( btnMaximoRuido2[i] );

            panelLetra3.add( btnLetra3[i] );
            panelRuido3.add( btnRuido3[i] );
            panelMinimoLetra3.add( btnMinimoLetra3[i] );
            panelMaximoLetra3.add( btnMaximoLetra3[i] );
            panelMinimoRuido3.add( btnMinimoRuido3[i] );
            panelMaximoRuido3.add( btnMaximoRuido3[i] );
            
            btnLetra[i].addActionListener( this );
            btnRuido[i].addActionListener( this );

            btnLetra2[i].addActionListener( this );
            btnRuido2[i].addActionListener( this );

            btnLetra3[i].addActionListener( this );
            btnRuido3[i].addActionListener( this );
        }
        panelLetra.setVisible( true );
        panelRuido.setVisible( true );
        panelMinimoLetra.setVisible( true );
        panelMaximoLetra.setVisible( true );
        panelMinimoRuido.setVisible( true );
        panelMaximoRuido.setVisible( true );

        panelLetra2.setVisible( true );
        panelRuido2.setVisible( true );
        panelMinimoLetra2.setVisible( true );
        panelMaximoLetra2.setVisible( true );
        panelMinimoRuido2.setVisible( true );
        panelMaximoRuido2.setVisible( true );

        panelLetra3.setVisible( true );
        panelRuido3.setVisible( true );
        panelMinimoLetra3.setVisible( true );
        panelMaximoLetra3.setVisible( true );
        panelMinimoRuido3.setVisible( true );
        panelMaximoRuido3.setVisible( true );

        for( int i=0; i<letreros.length; i++ ){
        	this.add( letreros[i] );
        	this.add( letreros2[i] );
        	this.add( letreros3[i] );
        }

        this.add( panelLetra );
        this.add( panelRuido );
        this.add( panelMinimoLetra );
        this.add( panelMaximoLetra );
        this.add( panelMinimoRuido );
        this.add( panelMaximoRuido );

        this.add( panelLetra2 );
        this.add( panelRuido2 );
        this.add( panelMinimoLetra2 );
        this.add( panelMaximoLetra2 );
        this.add( panelMinimoRuido2 );
        this.add( panelMaximoRuido2 );

        this.add( panelLetra3 );
        this.add( panelRuido3 );
        this.add( panelMinimoLetra3 );
        this.add( panelMaximoLetra3 );
        this.add( panelMinimoRuido3 );
        this.add( panelMaximoRuido3 );
	}

	public void actionPerformed(ActionEvent ev) {
       	for( int i=0; i<btnLetra.length; i++){
       		if( ev.getSource() == btnLetra[i] ){
       			if( btnLetra[i].getBackground() == Color.white ){
       				btnLetra[i].setBackground( Color.black );
       				btnRuido[i].setBackground( Color.black );

       				vectorLetra[i] = 1;
       				vectorRuido[i] = 1;
       			} else {
       				btnLetra[i].setBackground( Color.white );
       				btnRuido[i].setBackground( Color.white );

       				vectorLetra[i] = 0;
       				vectorRuido[i] = 0;
       			}
       		}
       		if( ev.getSource() == btnRuido[i] ){
       			if( btnRuido[i].getBackground() == Color.white ){
       				btnRuido[i].setBackground( Color.black );

       				vectorRuido[i] = 1;
       			} else {
       				btnRuido[i].setBackground( Color.white );

       				vectorRuido[i] = 0;
       			}
       			aprendizaje();
       		}

       		if( ev.getSource() == btnLetra2[i] ){
       			if( btnLetra2[i].getBackground() == Color.white ){
       				btnLetra2[i].setBackground( Color.black );
       				btnRuido2[i].setBackground( Color.black );

       				vectorLetra2[i] = 1;
       				vectorRuido2[i] = 1;
       			} else {
       				btnLetra2[i].setBackground( Color.white );
       				btnRuido2[i].setBackground( Color.white );

       				vectorLetra2[i] = 0;
       				vectorRuido2[i] = 0;
       			}
       		}
       		if( ev.getSource() == btnRuido2[i] ){
       			if( btnRuido2[i].getBackground() == Color.white ){
       				btnRuido2[i].setBackground( Color.black );

       				vectorRuido2[i] = 1;
       			} else {
       				btnRuido2[i].setBackground( Color.white );

       				vectorRuido2[i] = 0;
       			}
       			aprendizaje2();
       		}

       		if( ev.getSource() == btnLetra3[i] ){
       			if( btnLetra3[i].getBackground() == Color.white ){
       				btnLetra3[i].setBackground( Color.black );
       				btnRuido3[i].setBackground( Color.black );

       				vectorLetra3[i] = 1;
       				vectorRuido3[i] = 1;
       			} else {
       				btnLetra3[i].setBackground( Color.white );
       				btnRuido3[i].setBackground( Color.white );

       				vectorLetra3[i] = 0;
       				vectorRuido3[i] = 0;
       			}
       		}

       		if( ev.getSource() == btnRuido3[i] ){
       			if( btnRuido3[i].getBackground() == Color.white ){
       				btnRuido3[i].setBackground( Color.black );

       				vectorRuido3[i] = 1;
       			} else {
       				btnRuido3[i].setBackground( Color.white );

       				vectorRuido3[i] = 0;
       			}
       			aprendizaje3();
       		}

       	}
    }

    private void prints(){
    	System.out.print("\nLETRA INICIAL:\t");
    	for(int i=0; i<vectorLetra.length; i++){
    		System.out.print(vectorLetra[i]+" ");
    	} System.out.print("\n");

    	System.out.print("\nLETRA RUIDO:\t");
    	for(int i=0; i<vectorRuido.length; i++){
    		System.out.print(vectorRuido[i]+" ");
    	} System.out.print("\n");
    }

    private int[][] alfa(int[] letra){
		int [][] matrizAlfa = new int[12][12];

		//System.out.println("\n\nMATRIZ TRANSPUESTA");
		for( int i=0; i<12; i++ ){
			for( int j=0; j<12; j++ ){
				
				if( letra[i] == 0 && letra[j] == 0 ) { matrizAlfa[i][j] = 1; }
				if( letra[i] == 0 && letra[j] == 1 ) { matrizAlfa[i][j] = 0; }
				if( letra[i] == 1 && letra[j] == 0 ) { matrizAlfa[i][j] = 2; }
				if( letra[i] == 1 && letra[j] == 1 ) { matrizAlfa[i][j] = 1; }
				//System.out.print(matrizAlfa[i][j]);
			}
			//System.out.print("\n");
		}
		return matrizAlfa;
	}

	private int[][] minimo( int[][] matrizAlfa1, int[][] matrizAlfa2 ){
		int[][] min = new int[12][12];
		for( int i=0; i<12; i++){
			for( int j=0; j<12; j++ ){
				if( matrizAlfa1[i][j] == matrizAlfa2[i][j] ){
					min[i][j] = matrizAlfa1[i][j];
				} else {
					if( matrizAlfa1[i][j] < matrizAlfa2[i][j] ){
						min[i][j] = matrizAlfa1[i][j];
					} else {
						min[i][j] = matrizAlfa2[i][j];
					}
				}
				//System.out.print(min[i][j]);
			}
			//System.out.print("\n");
		}
		return min;
	}

	private int[][] maximo( int[][] matrizAlfa1, int[][] matrizAlfa2 ){
		int[][] max = new int[12][12];

		for( int i=0; i<12; i++){
			for( int j=0; j<12; j++ ){
				if( matrizAlfa1[i][j] == matrizAlfa2[i][j] ){
					max[i][j] = matrizAlfa1[i][j];
				} else {
					if( matrizAlfa1[i][j] > matrizAlfa2[i][j] ){
						max[i][j] = matrizAlfa1[i][j];
					} else {
						max[i][j] = matrizAlfa2[i][j];
					}
				}
				//System.out.print(max[i][j]);
			}
			//System.out.print("\n");
		}
		return max;
	}

	private int[][] beta( int[][] minMax, int[] vectorLetra ){
		int[][] matrizBeta = new int[12][12];
		//System.out.println("\n\n MATRIZ BETA");

		for( int i=0; i<12; i++ ){
			for( int j=0; j<12; j++ ){
				if( minMax[i][j] == 0 && vectorLetra[i] == 0 ) { matrizBeta[i][j] = 0; }
				if( minMax[i][j] == 0 && vectorLetra[i] == 1 ) { matrizBeta[i][j] = 0; }
				if( minMax[i][j] == 1 && vectorLetra[i] == 0 ) { matrizBeta[i][j] = 0; }
				if( minMax[i][j] == 1 && vectorLetra[i] == 1 ) { matrizBeta[i][j] = 1; }
				if( minMax[i][j] == 2 && vectorLetra[i] == 0 ) { matrizBeta[i][j] = 1; }
				if( minMax[i][j] == 2 && vectorLetra[i] == 1 ) { matrizBeta[i][j] = 1; }

			//	System.out.print( matrizBeta[i][j] );
			}
			//System.out.print("\n");
		}
		return matrizBeta;
	}

	private int[] recuperacionMinimo( int[][] min ){
		int[] betaFinal = new int[12];

		for( int i=0; i<12; i++ ){
			for( int j=0; j<12; j++ ){
				if( min[i][j] == min[i][j] ){
					betaFinal[i] = min[i][j];
				} else {
					if( min[i][j] < min[i][j] ){
						betaFinal[i] = min[i][j];
					} else {
						betaFinal[i] = min[i][j];
					}
				}
			}
		}
		return betaFinal;
	}

	private int[] recuperacionMaximo( int[][] max ){
		int[] betaFinal = new int[12];

		for( int i=0; i<12; i++ ){
			for( int j=0; j<12; j++ ){
				if( max[i][j] == max[i][j] ){
					betaFinal[i] = max[i][j];
				} else {
					if( max[i][j] > max[i][j] ){
						betaFinal[i] = max[i][j];
					} else {
						betaFinal[i] = max[i][j];
					}
				}
			}
		}
		return betaFinal;
	}

	private void aprendizaje(){
		matrizAlfaLetra = alfa( vectorLetra );
		matrizAlfaRuido = alfa( vectorRuido );

		minimo = minimo( matrizAlfaLetra, matrizAlfaRuido );
		maximo = maximo( matrizAlfaLetra, matrizAlfaRuido );

		MinBetaLetra = beta( minimo, vectorLetra );
		MaxBetaLetra = beta( maximo, vectorLetra );
		MinBetaRuido = beta( minimo, vectorRuido );
		MaxBetaRuido = beta( maximo, vectorRuido );

		vectorFinMinLetra = recuperacionMinimo( MinBetaLetra );
		vectorFinMaxLetra = recuperacionMaximo( MaxBetaLetra );
		vectorFinMinRuido = recuperacionMinimo( MinBetaRuido );
		vectorFinMaxRuido = recuperacionMaximo( MaxBetaRuido );

		for( int i=0; i<vectorFinMinLetra.length; i++ ){
			if( vectorFinMinLetra[i] == 1 ){
				btnMinimoLetra[i].setBackground( Color.black );
			} else {
				btnMinimoLetra[i].setBackground( Color.white );
			}
			if( vectorFinMaxLetra[i] == 1 ){
				btnMaximoLetra[i].setBackground( Color.black );
			} else {
				btnMaximoLetra[i].setBackground( Color.white );
			}
			if( vectorFinMinRuido[i] == 1 ){
				btnMinimoRuido[i].setBackground( Color.black );
			} else {
				btnMinimoRuido[i].setBackground( Color.white );
			}
			if( vectorFinMaxRuido[i] == 1 ){
				btnMaximoRuido[i].setBackground( Color.black );
			} else {
				btnMaximoRuido[i].setBackground( Color.white );
			}
			//System.out.print( vectorFinMinLetra[i]+" " );
		} //System.out.print( "\n" );
	}

	private void aprendizaje2(){
		matrizAlfaLetra2 = alfa( vectorLetra2 );
		matrizAlfaRuido2 = alfa( vectorRuido2 );

		minimo2 = minimo( matrizAlfaLetra2, matrizAlfaRuido2 );
		maximo2 = maximo( matrizAlfaLetra2, matrizAlfaRuido2 );

		MinBetaLetra2 = beta( minimo2, vectorLetra2 );
		MaxBetaLetra2 = beta( maximo2, vectorLetra2 );
		MinBetaRuido2 = beta( minimo2, vectorRuido2 );
		MaxBetaRuido2 = beta( maximo2, vectorRuido2 );

		vectorFinMinLetra2 = recuperacionMinimo( MinBetaLetra2 );
		vectorFinMaxLetra2 = recuperacionMaximo( MaxBetaLetra2 );
		vectorFinMinRuido2 = recuperacionMinimo( MinBetaRuido2 );
		vectorFinMaxRuido2 = recuperacionMaximo( MaxBetaRuido2 );

		for( int i=0; i<vectorFinMinLetra.length; i++ ){
			if( vectorFinMinLetra2[i] == 1 ){
				btnMinimoLetra2[i].setBackground( Color.black );
			} else {
				btnMinimoLetra2[i].setBackground( Color.white );
			}
			if( vectorFinMaxLetra2[i] == 1 ){
				btnMaximoLetra2[i].setBackground( Color.black );
			} else {
				btnMaximoLetra2[i].setBackground( Color.white );
			}
			if( vectorFinMinRuido2[i] == 1 ){
				btnMinimoRuido2[i].setBackground( Color.black );
			} else {
				btnMinimoRuido2[i].setBackground( Color.white );
			}
			if( vectorFinMaxRuido2[i] == 1 ){
				btnMaximoRuido2[i].setBackground( Color.black );
			} else {
				btnMaximoRuido2[i].setBackground( Color.white );
			}

			//System.out.print( vectorFinMinLetra[i]+" " );
		} //System.out.print( "\n" );
	}

	private void aprendizaje3(){
		
		matrizAlfaLetra3 = alfa( vectorLetra3 );
		matrizAlfaRuido3 = alfa( vectorRuido3 );

		
		minimo3 = minimo( matrizAlfaLetra3, matrizAlfaRuido3 );
		maximo3 = maximo( matrizAlfaLetra3, matrizAlfaRuido3 );

		MinBetaLetra3 = beta( minimo3, vectorLetra3 );
		MaxBetaLetra3 = beta( maximo3, vectorLetra3 );
		MinBetaRuido3 = beta( minimo3, vectorRuido3 );
		MaxBetaRuido3 = beta( maximo3, vectorRuido3 );

		
		vectorFinMinLetra3 = recuperacionMinimo( MinBetaLetra3 );
		vectorFinMaxLetra3 = recuperacionMaximo( MaxBetaLetra3 );
		vectorFinMinRuido3 = recuperacionMinimo( MinBetaRuido3 );
		vectorFinMaxRuido3 = recuperacionMaximo( MaxBetaRuido3 );

		for( int i=0; i<vectorFinMinLetra.length; i++ ){
			if( vectorFinMinLetra3[i] == 1 ){
				btnMinimoLetra3[i].setBackground( Color.black );
			} else {
				btnMinimoLetra3[i].setBackground( Color.white );
			}
			if( vectorFinMaxLetra3[i] == 1 ){
				btnMaximoLetra3[i].setBackground( Color.black );
			} else {
				btnMaximoLetra3[i].setBackground( Color.white );
			}
			if( vectorFinMinRuido3[i] == 1 ){
				btnMinimoRuido3[i].setBackground( Color.black );
			} else {
				btnMinimoRuido3[i].setBackground( Color.white );
			}
			if( vectorFinMaxRuido3[i] == 1 ){
				btnMaximoRuido3[i].setBackground( Color.black );
			} else {
				btnMaximoRuido3[i].setBackground( Color.white );
			}
			//System.out.print( vectorFinMinLetra[i]+" " );
		} //System.out.print( "\n" );
	}

	public static void main( String[] args ){ new Memorias(); }
}
