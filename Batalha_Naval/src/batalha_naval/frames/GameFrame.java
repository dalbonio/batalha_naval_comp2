/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha_naval.frames;

import batalha_naval.self_made_components.beans.Machine;
import batalha_naval.self_made_components.swing_components.BlockLabel;
import batalha_naval.self_made_components.beans.Player;
import batalha_naval.self_made_components.util.MapUtils;
import batalha_naval.self_made_components.util.Position;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
/**
 *
 * @author Lucas
 */
public final class GameFrame extends javax.swing.JFrame 
{

    /**
     * Creates new form GameFrame
     * @param playerMatrix
     * @param playerIntMap
     */
    public GameFrame( BlockLabel[][] playerMatrix, int[][] playerIntMap ) 
    {
        this.playerIntMap = playerIntMap;
        
        labelMatrixPlayer = playerMatrix;
        labelMatrixComputer = new BlockLabel[10][10];
        initComponents();
        setLocationRelativeTo(null);
        initConstantsPanel();
        initLabelMatrixes();
        
        selectedLabel = labelMatrixComputer[0][0];
        
        computer = new Machine();
        player = new Player();
        
        addComputerMatrixLabelListener();    
        
        JOptionPane.showMessageDialog( null, "Selecione o bloco em que deseja atirar e escolha qual tiro usar" );
        
        selectLabel( labelMatrixComputer[0][0] );
        updateShootingButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shootingStar = new javax.swing.JButton();
        cascadeShot = new javax.swing.JButton();
        commonShot = new javax.swing.JButton();
        panelMaquina = new javax.swing.JPanel();
        panelPlayer = new javax.swing.JPanel();
        charPanelPlayer = new javax.swing.JPanel();
        charPanelMaquina = new javax.swing.JPanel();
        numberPanelPlayer = new javax.swing.JPanel();
        numberPanelMaquina = new javax.swing.JPanel();
        hintButton = new javax.swing.JButton();
        hintCounter = new javax.swing.JLabel();
        acertosLabel1 = new javax.swing.JLabel();
        acertosLabel2 = new javax.swing.JLabel();
        computerHitCounter = new javax.swing.JLabel();
        playerHitCounter = new javax.swing.JLabel();
        surrenderButton = new javax.swing.JButton();
        background_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1440, 900));
        setMinimumSize(new java.awt.Dimension(1440, 900));
        setPreferredSize(new java.awt.Dimension(1440, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        shootingStar.setText("Tiro Estrela");
        shootingStar.setEnabled(false);
        getContentPane().add(shootingStar);
        shootingStar.setBounds(490, 20, 170, 32);

        cascadeShot.setText("Tiro Cascata");
        cascadeShot.setEnabled(false);
        getContentPane().add(cascadeShot);
        cascadeShot.setBounds(275, 20, 170, 32);

        commonShot.setText("Tiro Comum");
        commonShot.setEnabled(false);
        commonShot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commonShotActionPerformed(evt);
            }
        });
        getContentPane().add(commonShot);
        commonShot.setBounds(60, 20, 170, 32);

        panelMaquina.setLayout(new java.awt.GridLayout(10, 10));
        getContentPane().add(panelMaquina);
        panelMaquina.setBounds(820, 100, 600, 720);

        panelPlayer.setLayout(new java.awt.GridLayout(10, 10));
        getContentPane().add(panelPlayer);
        panelPlayer.setBounds(60, 100, 600, 720);

        charPanelPlayer.setOpaque(false);
        charPanelPlayer.setLayout(new java.awt.GridLayout(10, 1));
        getContentPane().add(charPanelPlayer);
        charPanelPlayer.setBounds(20, 100, 40, 720);

        charPanelMaquina.setOpaque(false);
        charPanelMaquina.setLayout(new java.awt.GridLayout(10, 1));
        getContentPane().add(charPanelMaquina);
        charPanelMaquina.setBounds(780, 100, 40, 720);

        numberPanelPlayer.setOpaque(false);
        numberPanelPlayer.setLayout(new java.awt.GridLayout(1, 10));
        getContentPane().add(numberPanelPlayer);
        numberPanelPlayer.setBounds(60, 60, 600, 40);

        numberPanelMaquina.setOpaque(false);
        numberPanelMaquina.setLayout(new java.awt.GridLayout(1, 10));
        getContentPane().add(numberPanelMaquina);
        numberPanelMaquina.setBounds(820, 60, 600, 40);

        hintButton.setText("Dica");
        getContentPane().add(hintButton);
        hintButton.setBounds(690, 20, 70, 32);

        hintCounter.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        hintCounter.setForeground(new java.awt.Color(255, 255, 255));
        hintCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hintCounter.setText("3");
        getContentPane().add(hintCounter);
        hintCounter.setBounds(770, 5, 70, 60);

        acertosLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        acertosLabel1.setForeground(new java.awt.Color(255, 255, 255));
        acertosLabel1.setText("Acertos: ");
        getContentPane().add(acertosLabel1);
        acertosLabel1.setBounds(1270, 820, 110, 40);

        acertosLabel2.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        acertosLabel2.setForeground(new java.awt.Color(255, 255, 255));
        acertosLabel2.setText("Acertos: ");
        getContentPane().add(acertosLabel2);
        acertosLabel2.setBounds(490, 820, 110, 40);

        computerHitCounter.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        computerHitCounter.setForeground(new java.awt.Color(255, 255, 255));
        computerHitCounter.setText("0");
        getContentPane().add(computerHitCounter);
        computerHitCounter.setBounds(1390, 825, 14, 30);

        playerHitCounter.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        playerHitCounter.setForeground(new java.awt.Color(255, 255, 255));
        playerHitCounter.setText("0");
        getContentPane().add(playerHitCounter);
        playerHitCounter.setBounds(620, 825, 14, 30);

        surrenderButton.setText("Desistir");
        getContentPane().add(surrenderButton);
        surrenderButton.setBounds(1020, 20, 170, 32);

        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgrounds/background_game.jpg"))); // NOI18N
        background_img.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(background_img);
        background_img.setBounds(0, 0, 1440, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void commonShotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commonShotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commonShotActionPerformed
  
    public void initLabelMatrixes()
    {           
        Color black = new Color( 0, 0, 0 );
        Color light_red = new Color(255,210,210);
        Color light_blue = new Color(176,224,230);
        
        int[][] computerMap = MapUtils.createRandomMap();
        
        for( int i = 0; i < 10; i++ )
        {    
            for(int j = 0; j < 10; j++ )
            {          
                labelMatrixComputer[i][j] = new BlockLabel( new Position(i, j) );                                
                
                //remove listener from other frame
                for( MouseListener listener : labelMatrixPlayer[i][j].getMouseListeners() ) 
                {
                    labelMatrixPlayer[i][j].removeMouseListener( listener );
                }
                
                initLabel(labelMatrixPlayer[i][j], light_blue, black, panelPlayer );
                initLabel(labelMatrixComputer[i][j], light_red, black, panelMaquina ); 
                
                labelMatrixComputer[i][j].setType( computerMap[i][j] );
            }
        }
        
         pack();
    }
    
    public void initLabel( BlockLabel label, Color backgroundColor, Color borderColor, JPanel panel )
    {        
        if( label.getVehicle() == null )
        {
            label.setBackground( backgroundColor );

            //passar border por parametro
            label.setBorder( javax.swing.BorderFactory.createLineBorder( borderColor ) );
            
            label.setType( 0 );
        }
        else
        {
            label.setType( label.getVehicle().getType() );
        }
        
        label.setAlive( true );
        
        label.setOpaque( true );
        
        panel.add( label );
    }
    
    
    
    //setar isso como listener
    public void updateShootingButtons()
    {
        int starShot = 0;
        int cascShot = 0;
        int cmShot = 0;
        
        for( int i = 0; i < 10; i++ )
        {    
            for(int j = 0; j < 10; j++ )
            {          
                if( labelMatrixPlayer[i][j].isAlive() )
                {
                    int labelType = labelMatrixPlayer[i][j].getType();                                
                
                    switch (labelType) 
                    {
                        case 1:
                            starShot = 1;
                            break;
                        case 2:
                            cmShot = 1;
                            break;
                        case 3:
                            cascShot = 1;
                            break;
                        default:
                            break;
                    }
                }                
            }
        }
         
        if( starShot == 1 )
        {
            this.shootingStar.setEnabled( true );
        }
        if( cascShot == 1 )
        {
            this.cascadeShot.setEnabled( true );
        }
        if( cmShot == 1 )
        {
            this.commonShot.setEnabled( true );
        }
        
        if( starShot == 0 && cascShot == 0 && cmShot == 0 )
        {
            JOptionPane.showMessageDialog( null, "Voce nao pode atirar\nDesista." );
        }
    }
    
    public void machineShot()
    {
        List<Integer> possibleShots = new ArrayList<>();
        
        possibleShots.addAll( getPossibleMachineShots() );
        
        Collections.shuffle( possibleShots );        
        
        if( possibleShots.isEmpty() )
        {
            JOptionPane.showMessageDialog( null, "O Computador nao pode atirar.");
            return;
        }
        
        Random random = new Random();
        
        int x;
        int y;
        
        do
        {
            x = random.nextInt( 10 );
            y = random.nextInt( 10 );
        }while( !labelMatrixPlayer[x][y].isAlive() );
        
        switch( possibleShots.get(0) )
        {
            case 1:
                starShot( computer, new Position( x, y ), labelMatrixPlayer );
                 JOptionPane.showMessageDialog( null, "Computador Disparou\nTiro estrela em: " + ( (char)(x + 'A') ) + ( y + 1 ) );
                break;
            case 2:
                commonShot(computer, new Position( x, y ), labelMatrixPlayer );
                JOptionPane.showMessageDialog( null, "Computador Disparou\nTiro comum em: " + ( (char)(x + 'A') ) + ( y + 1 ) );
                break;
            case 3:
                cascadeShot(computer, new Position( x, y ), labelMatrixPlayer );
                JOptionPane.showMessageDialog( null, "Computador Disparou\nTiro cascata em: " + ( (char)(x + 'A') ) + ( y + 1 ) );
                break;
            default:
                break;
        }
        
        
    }
    
      //setar isso como listener
    public Set<Integer> getPossibleMachineShots()
    {        
        int starShot = 0;
        int cascShot = 0;
        int cmShot = 0;
        
        Set<Integer> shots = new HashSet<>();
        
        for( int i = 0; i < 10; i++ )
        {    
            for(int j = 0; j < 10; j++ )
            {          
                if( labelMatrixComputer[i][j].isAlive() )
                {
                    int labelType = labelMatrixComputer[i][j].getType();                                
                
                    switch (labelType) 
                    {
                        case 1:
                            shots.add( 1 );
                            break;
                        case 2:
                            shots.add( 2 );
                            break;
                        case 3:
                            shots.add( 3 );
                            break;
                        default:                            
                            break;
                    }
                }                
            }
        }
         
        return shots;
    }

    public void addComputerMatrixLabelListener()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                labelMatrixComputer[i][j].addMouseListener( new MouseAdapter()
                {
                    @Override
                    public void mouseClicked(MouseEvent e) 
                    {
                       BlockLabel label = (BlockLabel)e.getSource();
                       
                       if( !label.isAlive() )
                       {
                           JOptionPane.showMessageDialog(null, "Bloco Invalido");
                           return;
                       }
                       
                       selectLabel( label );
                       
                       updateShootingButtons();
                    }                   
                });
            }            
        }
        
        //listener do tiro estrela
        this.shootingStar.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if( !shootingStar.isEnabled() )
                {
                    return;
                }
                
                Position<Integer, Integer> position = selectedLabel.getPosition();
                
                starShot( player, position, labelMatrixComputer );
                
                disableAllShots();
                
                updateScores();                                
                
                if( isGameOver() )
                {
                    EndGameFrame endGameFrame = new EndGameFrame( true, playerIntMap );
                    
                    endGameFrame.setVisible( true );
                    
                    dispose();
                }
                else
                {
                    machineShot();
                
                    updateScores();
                
                    if( isGameOver() )
                    {
                        EndGameFrame endGameFrame = new EndGameFrame( false, playerIntMap );

                        endGameFrame.setVisible( true );

                        dispose();
                    }
                }
            }                                    
        });
        
        //listener do tiro comum
        this.commonShot.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if( !commonShot.isEnabled() )
                {
                    return;
                }
                
                Position<Integer, Integer> position = selectedLabel.getPosition();
                
                commonShot( player, position, labelMatrixComputer );
                
                disableAllShots();                                 
                
                updateScores();
                
                if( isGameOver() )
                {
                    EndGameFrame endGameFrame = new EndGameFrame( true, playerIntMap );
                    
                    endGameFrame.setVisible( true );
                    
                    dispose();
                }
                else
                {
                    machineShot();
                
                    updateScores();
                
                    if( isGameOver() )
                    {
                        EndGameFrame endGameFrame = new EndGameFrame( false, playerIntMap );

                        endGameFrame.setVisible( true );

                        dispose();
                    }
                }
            }                  
        });
        
        //listener do tiro cascata
        this.cascadeShot.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if( !cascadeShot.isEnabled() )
                {
                    return;
                }
                
                Position<Integer, Integer> position = selectedLabel.getPosition();
                
                cascadeShot( player, position, labelMatrixComputer );
                
                disableAllShots();
                
                updateScores();
                
                if( isGameOver() )
                {
                    EndGameFrame endGameFrame = new EndGameFrame( true, playerIntMap );
                    
                    endGameFrame.setVisible( true );
                    
                    dispose();
                }
                else
                {
                    machineShot();
                
                    updateScores();
                
                    if( isGameOver() )
                    {
                        EndGameFrame endGameFrame = new EndGameFrame( false, playerIntMap );

                        endGameFrame.setVisible( true );

                        dispose();
                    }
                }
            }
        });
        
        this.surrenderButton.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int choice = JOptionPane.showOptionDialog( null, "Voce realmente deseja desistir?", "Surrender", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null );
                
                if( choice == JOptionPane.YES_OPTION )
                {
                    EndGameFrame endGameFrame = new EndGameFrame( false, playerIntMap );

                    endGameFrame.setVisible( true );

                    dispose();
                }
            }
            
        });
        
        //listener do tiro cascata
        this.hintButton.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if( !hintButton.isEnabled() )
                {
                    return;
                }
                
                String posicao = JOptionPane.showInputDialog("Digite a Posição", "A1");
                
                if( posicao.isEmpty() )
                {
                    return;
                }
                
                char xChar = posicao.substring( 0, 1 ).toUpperCase().charAt(0);
                
                int y = Integer.valueOf( posicao.substring( 1, posicao.length() ) ) - 1;                                               
                
                int x = (int)( xChar - 'A' );               
                
                if( x < 0 || x > 9  || y < 0 || y > 9 )
                {
                    JOptionPane.showMessageDialog(null, "Posicao Invalida");
                    return;
                }
                
                boolean thereIsVehicle = false;
                
                for(int i = 0; i < 10; i++)
                {
                    if( labelMatrixComputer[x][i].getType() != 0 || labelMatrixComputer[i][y].getType() != 0 )
                    {
                        thereIsVehicle = true;
                    }
                }
                              
                if( !thereIsVehicle )
                {
                    JOptionPane.showMessageDialog(null, "Nao tem veiculo nessa linha ou coluna");                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Tem veiculo nessa linha ou coluna");   
                }
                
                Integer hintInteger = Integer.valueOf( hintCounter.getText() );
                
                hintCounter.setText( String.valueOf( hintInteger - 1 ) );
                
                if( hintInteger == 1 )
                {
                    hintButton.setEnabled( false );
                }
            }        
        });
    }
    
    public void commonShot( Player shooter, Position<Integer, Integer> position, BlockLabel[][] labelMatrixTargeted )
    {
        int x = position.getX();
        int y = position.getY();
        
        if( labelMatrixTargeted[x][y].isAlive() )
        {
            if( labelMatrixTargeted[x][y].getType() != 0 )
            {
                shooter.hit();
                labelMatrixTargeted[x][y].setText( "X" );
            }
            else
            {
                labelMatrixTargeted[x][y].setBackground( new Color( 70,130,180 ) );
            }

            labelMatrixTargeted[x][y].setAlive( false );
        }
    }
    
    public void starShot( Player shooter, Position<Integer, Integer> position, BlockLabel[][] labelMatrixTargeted )
    {
        int x = position.getX();
        int y = position.getY();
        
        if( labelMatrixTargeted[x][y].isAlive() )
        {
            if( labelMatrixTargeted[x][y].getType() != 0 )
            {
                shooter.hit();
                labelMatrixTargeted[x][y].setText( "X" );
            }
            else
            {
                labelMatrixTargeted[x][y].setBackground( new Color( 70,130,180 ) );
            }

            labelMatrixTargeted[x][y].setAlive( false );   
        }

        if( y + 1 < 10 )
        {      
            if( labelMatrixTargeted[x][y+1].isAlive() )
            {
                if( labelMatrixTargeted[x][y+1].getType() != 0 )
                {
                    shooter.hit();
                    labelMatrixTargeted[x][y+1].setText( "X" );
                }
                else
                {
                    labelMatrixTargeted[x][y+1].setBackground( new Color( 70,130,180 ) );
                }
                
                labelMatrixTargeted[x][y+1].setAlive( false );
            }            
        }
        if( y - 1 >= 0 )
        {
            
            if( labelMatrixTargeted[x][y-1].isAlive() )
            {
                if( labelMatrixTargeted[x][y-1].getType() != 0 )
                {
                    shooter.hit();
                    labelMatrixTargeted[x][y-1].setText( "X" );
                }
                else
                {
                    labelMatrixTargeted[x][y-1].setBackground( new Color( 70,130,180 ) );
                }
                
                labelMatrixTargeted[x][y-1].setAlive( false );      
            }
        }                          
        if( x + 1 < 10 )
        {           
            if( labelMatrixTargeted[x+1][y].isAlive() )
            {
                if( labelMatrixTargeted[x+1][y].getType() != 0 )
                {
                    shooter.hit();
                    labelMatrixTargeted[x+1][y].setText( "X" ); 
                }
                else
                {
                    labelMatrixTargeted[x+1][y].setBackground( new Color( 70,130,180 ) );
                }
                
                labelMatrixTargeted[x+1][y].setAlive( false );             
            }
        }
        if( x - 1 >= 0 )
        {
            
            if( labelMatrixTargeted[x-1][y].isAlive() )
            {
                if( labelMatrixTargeted[x-1][y].getType() != 0 )
                {
                    shooter.hit();
                    labelMatrixTargeted[x-1][y].setText( "X" );
                }
                else
                {
                    labelMatrixTargeted[x-1][y].setBackground( new Color( 70,130,180 ) );
                }
                
                labelMatrixTargeted[x-1][y].setAlive( false );
            }
        }     
    }
    
    public boolean isGameOver()
    {           
        return (player.getHitCounter() == 11) || (computer.getHitCounter() == 11 );
    }
    
    public void cascadeShot( Player shooter, Position<Integer, Integer> position, BlockLabel[][] labelMatrixTargeted )
    {
        int x = position.getX();
        int y = position.getY();

        if( labelMatrixTargeted[x][y].isAlive() )
        {
            if( labelMatrixTargeted[x][y].getType() != 0 )
            {
                shooter.hit();
                labelMatrixTargeted[x][y].setText( "X" );
            }
            else
            {
                labelMatrixTargeted[x][y].setBackground( new Color( 70,130,180 ) );
            }

            labelMatrixTargeted[x][y].setAlive( false );
            
        }

        if( y + 1 < 10 )
        {
            
            if( labelMatrixTargeted[x][y+1].isAlive() )
            {                          
                if( labelMatrixTargeted[x][y+1].getType() != 0 )
                {
                    shooter.hit();
                    labelMatrixTargeted[x][y+1].setText( "X" );
                }
                else
                {
                    labelMatrixTargeted[x][y+1].setBackground( new Color( 70,130,180 ) );
                }
                
                labelMatrixTargeted[x][y+1].setAlive( false );
            }
        }
    }
    
    public void disableAllShots()
    {
        shootingStar.setEnabled( false );
        cascadeShot.setEnabled( false );
        commonShot.setEnabled( false );   
                
    }
    
    public void updateScores()
    {
        playerHitCounter.setText( String.valueOf( computer.getHitCounter() ) );
        computerHitCounter.setText( String.valueOf( player.getHitCounter() ) );
    }
    
    public void selectLabel( BlockLabel label )
    {
        int x = label.getPosition().getX();
        int y = label.getPosition().getY();
        
        selectedLabel = label;
                        
        label.setBorder( BorderFactory.createLineBorder( new Color( 0, 200, 0 ) ) );
        
        Border blackBorder = BorderFactory.createLineBorder( Color.BLACK );
                     
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if( i != x || j != y )
                {
                    labelMatrixComputer[i][j].setBorder( blackBorder );
                }
            }
        }
    }    
    
    public void initConstantsPanel()
    {
        JLabel label1;
        JLabel label2;
        for(int i = 0; i < 10; i++)
        {
            label1 = new JLabel( String.valueOf( (char)( 'A' + i ) ), SwingConstants.CENTER );                    
            
            label1.setOpaque( false );
            
            label1.setForeground( Color.WHITE );
            
            label1.setFont(new Font("Serif", Font.PLAIN, 23));
            
            label2 = new JLabel( String.valueOf( (char)( 'A' + i ) ), SwingConstants.CENTER );                   
            
            label2.setOpaque( false );       
            
            label2.setForeground( Color.WHITE );
            
            label2.setFont(new Font("Serif", Font.PLAIN, 23));
            
            charPanelPlayer.add( label1 );
                       
            charPanelMaquina.add( label2 );
        }
        
        JLabel label3;
        JLabel label4;
        
        for(int i = 0; i < 10; i++)
        {
            label3 = new JLabel( String.valueOf( i + 1 ), SwingConstants.CENTER );                           
            
            label3.setOpaque( false );
            
            label3.setForeground( Color.WHITE );
            
            label3.setFont(new Font("Serif", Font.PLAIN, 23));
            
            label4 = new JLabel( String.valueOf( i + 1 ), SwingConstants.CENTER );                          
            
            label4.setOpaque( false );
            
            label4.setForeground( Color.WHITE );
            
            label4.setFont(new Font("Serif", Font.PLAIN, 23));
            
            numberPanelPlayer.add( label3 );
            numberPanelMaquina.add( label4 );
        }
    }
    
    private final BlockLabel[][] labelMatrixPlayer;
    private final BlockLabel[][] labelMatrixComputer;
    private final int[][] playerIntMap;
    
    private final Player computer;
    private final Player player;
    
    private BlockLabel selectedLabel;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertosLabel1;
    private javax.swing.JLabel acertosLabel2;
    private javax.swing.JLabel background_img;
    private javax.swing.JButton cascadeShot;
    private javax.swing.JPanel charPanelMaquina;
    private javax.swing.JPanel charPanelPlayer;
    private javax.swing.JButton commonShot;
    private javax.swing.JLabel computerHitCounter;
    private javax.swing.JButton hintButton;
    private javax.swing.JLabel hintCounter;
    private javax.swing.JPanel numberPanelMaquina;
    private javax.swing.JPanel numberPanelPlayer;
    private javax.swing.JPanel panelMaquina;
    private javax.swing.JPanel panelPlayer;
    private javax.swing.JLabel playerHitCounter;
    private javax.swing.JButton shootingStar;
    private javax.swing.JButton surrenderButton;
    // End of variables declaration//GEN-END:variables
}
