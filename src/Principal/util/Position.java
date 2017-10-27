package Principal.util;

import java.util.Objects;

public class Position< X, Y >
{

    private X x;
    private Y y;

    public Position( X x, Y y )
    {
        this.x = x;
        this.y = y;
    }

    public void setX( X x )
    {
        this.x = x;
    }

    public void setY( Y y )
    {
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
    public boolean equals(Object o)
    {
        if ( ! ( o instanceof Position ) ) return false;

        Position pairObject = ( Position ) o;

        return this.x.equals( pairObject.getX() ) && this.y.equals( pairObject.getY() );
    }

}
