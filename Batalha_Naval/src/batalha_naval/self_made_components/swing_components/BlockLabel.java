/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha_naval.self_made_components.swing_components;

import batalha_naval.self_made_components.beans.Vehicle;
import batalha_naval.self_made_components.util.Position;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;


/**
 *
 * @author Lucas
 */
public class BlockLabel extends JLabel
{
    public BlockLabel( Position<Integer, Integer> position )
    {
        this.position = position;
        
        setFont( new Font("Serif", Font.PLAIN, 45) );
        setForeground( new Color( 220, 0, 0 ) );
        setHorizontalTextPosition( JLabel.CENTER );      
        setVerticalTextPosition( JLabel.CENTER );   
        
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
    }
    
    public int getType() 
    {
        return type;
    }

    public void setType(int type) 
    {
        this.type = type;
    }

    public Position<Integer, Integer> getPosition() {
        return position;
    }

    public void setPosition(Position<Integer, Integer> position) {
        this.position = position;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    
    private boolean selected;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    private int type;
    
    private Position<Integer,Integer> position;
    
    private Vehicle vehicle;
    
    private boolean alive;   

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) 
    {
        this.alive = alive;
    }
    
    
    
    
}
