package beans;

import java.util.ArrayList;
import java.util.List;

public class Player
{
    private List< Shot > listShots;

    public Player()
    {
        listShots = new ArrayList<>();
    }

    public List< Shot > getListShots()
    {
        return listShots;
    }

    public void setListShots(List< Shot > listShots)
    {
        this.listShots = listShots;
    }
}
