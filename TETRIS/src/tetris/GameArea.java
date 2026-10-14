/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author izqui
 */
public class GameArea extends JPanel{
    
    private int gridRows;
    private int gridColumns;
    private int gridCellSize;
    
public GameArea(JPanel placeholder, int columns ){
 placeholder.setVisible(false); 
 this.setBounds(placeholder.getBounds());
 this.setBackground(placeholder.getBackground());
 this.setBorder(placeholder.getBorder());
 
 gridColumns = columns;
 gridCellSize= this.getBounds().width / gridColumns;
}

    @Override
    protected void paintComponent (Graphics g){
        
    super.paintComponent(g);
    
    for (int y = 0; y < gridRows; y ++){
        
        for (int x = 0; x < gridColumns; x++) {
            
            g.drawRect(x * gridCellSize,y * gridCellSize ,gridCellSize,gridCellSize);
            
        }
    }
    }
}
