package batalha_naval.self_made_components.beans;

public class Player implements Shooter
{
    protected int hitCounter;

    public Player()
    {
        hitCounter = 0;
    }
    
    public int getHitCounter()
    {
        return hitCounter;
    }

    public void setHitCounter( int hitCounter )
    {
        this.hitCounter = hitCounter;
    }

    @Override
    public void hit() 
    {
        this.hitCounter++;
    }
}
