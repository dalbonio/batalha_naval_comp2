package beans;

public class Vehicle
{
    private int size;

    private int damage;

    public Vehicle()
    {
        //nothing
    }

    public void initialize( int size, int damage )
    {
        this.size = size;
        this.damage = damage;
    }

    public int getSize()
    {
        return size;
    }

    public int getDamage()
    {
        return damage;
    }
}
