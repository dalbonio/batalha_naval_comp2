package services;

import beans.Player;
import beans.Shot;

import java.util.List;

public class PlayerServiceImpl implements PlayerService
{
    @Override
    public boolean lastShotHit( Player player )
    {
        List< Shot >shotList = player.getListShots();
        Shot lastShot = shotList.get( shotList.size() - 1 );

        return lastShot.isStrike();
    }
}
