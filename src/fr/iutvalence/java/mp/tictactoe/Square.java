package fr.iutvalence.java.mp.tictactoe;

/**
 * Square
 * 
 * This class represents one square, 
 * which is part of the grid defined in the TicTacToe class
 * 
 * @author seneclap
 *
 */
public class Square
{
    /**
     * EMPTY
     * This constant means there is no symbol in a square
     */
    public final static int EMPTY = 0;
    /**
     * CROSS
     * This constant means the square contains a cross
     */
    public final static int CROSS = 1;
    /**
     * CIRCLE
     * This constant means the square contains a circle
     */
    public final static int CIRCLE = 2;
    
    
    /**
     * UP_DOWN
     * This constant represents the direction Up to Down
     */
    public final static int UP_DOWN = 0;
    /**
     * LEFT_RIGHT
     * This constant represents the direction Left to Right
     */
    public final static int LEFT_RIGHT = 1;
    /**
     * UPLEFT_DOWNRIGHT
     * This constant represents the direction UpLeft to DownRight
     */
    public final static int UPLEFT_DOWNRIGHT = 2;
    /**
     * UPRIGHT_DOWNLEFT
     * This constant represents the direction UpRight to DownLeft
     */
    public final static int UPRIGHT_DOWNLEFT = 3;
    
    
    /**
     * value
     * Is equal to one of the aforedefined constants ; 
     * determines the symbol present in the square 
     */
    private int value;
    
    /**
     * direction
     * A table of 4 boolean
     * Each boolean represents one of the aforementioned directions
     * If it is true, then this square has been used 
     * to complete a line in the corresponding direction
     * Otherwise, it has not 
     */
    private boolean[] direction;


/**
 * Square
 * Class builder ; generates a new square, with no symbol in it, 
 * and is not used to form a line in any direction yet
 */
public Square()
{
    this.value = Square.EMPTY;
    this.direction[Square.UP_DOWN] = false;
    this.direction[Square.LEFT_RIGHT] = false;
    this.direction[Square.UPLEFT_DOWNRIGHT] = false;
    this.direction[Square.UPRIGHT_DOWNLEFT] = false;
}

/**
 * isEmpty
 * Checks the value of the Square
 * @return true if the value is EMPTY, false otherwise
 */
public boolean isEmpty()
{
    if (this.value == Square.EMPTY)
        return true;
    else
        return false;
}

/**
 * newValue
 * Changes the square's value
 * @param value : the new value
 */
public void newValue(int value)
 { 
    this.value = value;
 }
}
