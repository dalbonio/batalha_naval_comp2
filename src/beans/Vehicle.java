package Principal.beans;

import Principal.Principal;

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
        setSize( size );
        setDamage( damage );
    }

    public int getSize()
    {
        return size;
    }

    private void setSize(int size)
    {
        this.size = size;
    }

    public int getDamage()
    {
        return damage;
    }

    private void setDamage(int damage)
    {
        this.damage = damage;
    }
}
