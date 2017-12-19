package batalha_naval.self_made_components.beans;

public class Vehicle
{
    protected int size;
    
    protected int type;
    
    public Vehicle()
    {
        //nothing
    }

    public Vehicle( int size, int type )
    {
        this.size = size;
        this.type = type;
    }

    public int getSize()
    {
        return size;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals( Object obj ) 
    {
        if( obj instanceof Vehicle )
        {
            return ( (Vehicle)obj ).getType() == this.type;
        }
        return false;
    }
    
    
    
    
}
