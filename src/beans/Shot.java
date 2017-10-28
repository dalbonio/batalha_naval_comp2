package beans;

import util.Position;

import java.util.Objects;

public class Shot
{
    private boolean strike;

    private Position<Integer, Integer> position;

    public ShotType getShot()
    {
        return shot;
    }

    public void setShot(ShotType shot)
    {
        this.shot = shot;
    }

    private ShotType shot;

    public Shot(boolean strike, Position<Integer, Integer> position)
    {
        this.strike = strike;
        this.position = position;
    }

    public boolean isStrike()
    {
        return strike;
    }

    public void setStrike(boolean strike)
    {
        this.strike = strike;
    }

    public Position<Integer, Integer> getPosition()
    {
        return position;
    }

    public void setPosition(Position<Integer, Integer> position)
    {
        this.position = position;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( this.strike, this.position );
    }

    @Override
    public boolean equals( Object obj )
    {
        if( !( obj instanceof Shot  ) )
        {
            return false;
        }

        Shot shotObject = ( Shot ) obj;

        Position shotObjectPosition = shotObject.getPosition();

        if( shotObjectPosition == null || this.position == null )
        {
            return false;
        }

        return this.position.equals( shotObjectPosition );
    }
}
