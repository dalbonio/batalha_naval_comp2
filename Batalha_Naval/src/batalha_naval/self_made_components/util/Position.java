package batalha_naval.self_made_components.util;

import java.util.Objects;

public class Position< X, Y >
{

    private final X x;
    private final Y y;

    public Position( X x, Y y )
    {
        this.x = x;
        this.y = y;
    }

    public X getX()
    {
        return x;
    }

    public Y getY()
    {
        return y;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( this.x, this.y );
    }

    @Override
    public boolean equals( Object obj )
    {
        if ( ! ( obj instanceof Position ) )
        {
            return false;
        }

        Position pairObject = ( Position ) obj;

        return this.x.equals( pairObject.getX() ) && this.y.equals( pairObject.getY() );
    }

}
