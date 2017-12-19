package batalha_naval.self_made_components.util;

import batalha_naval.self_made_components.swing_components.BlockLabel;
import batalha_naval.self_made_components.exceptions.InvalidPositionException;
import batalha_naval.self_made_components.beans.Vehicle;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.naming.SizeLimitExceededException;

public class MapUtils
{
    public static int[][] createRandomMap()
    {
        Random random = new Random();

        int[][] map = new int[10][10];

        int randomX;
        int randomY;

        int index = 0;
        int vehicleSize = 2;

        int vehicleType = 1;

        boolean isPossible;

        while( index < 4 )
        {
            isPossible = true;

            randomX = random.nextInt( 10 - vehicleSize + 1 );
            randomY = random.nextInt( 10 );

            for(int i = randomX; i < randomX + vehicleSize; i++ )
            {
                if( map[randomY][i] != 0 )
                {
                    isPossible = false;
                    break;
                }
            }

            if( isPossible )
            {
                for(int i = randomX; i < randomX + vehicleSize; i++)
                {
                    map[randomY][i] = vehicleType;
                }             
                
                if( index > 0 )
                {
                    vehicleSize++;
                }

                index++;
                vehicleType++;
            }
        }

        return map;
    }

    public static int[][] generateMap( String[] vehicleArray )
    {
        Random random = new Random();
        
        Set<Integer>typeSet = new HashSet<>();

        int[][] map = new int[10][10];

        int vehicleType;
        
        boolean isSubmarine = true;
        
        Pattern pattern = Pattern.compile( Constants.FILE_REGEX );
        
        Matcher matcher;
        
        int counter = 0;
        
        for( int index = 0; index < vehicleArray.length; index++ )
        {           
            String string = vehicleArray[index];
            
            matcher = pattern.matcher( string );
            
            if( !matcher.matches() )
            {
                continue;
            }
            
            String[] separated = string.split(" ");

            int vehicleSize = Integer.parseInt(separated[0]);
            
            if( vehicleSize == 2 && isSubmarine )
            {
                vehicleType = 2;
                isSubmarine = false;
            }
            else if( vehicleSize == 2 && !isSubmarine )
            {
                vehicleType = 1;
            }
            else
            {
                vehicleType = vehicleSize;
            } 
            
            if( typeSet.contains( vehicleType ) )
            {
                continue;
            }            
            typeSet.add( vehicleType );                        

            int x = separated[1].charAt(0) - 'A';

            int y = Integer.parseInt(separated[1].substring(1)) - 1;

            if( isPositionValid( map, vehicleSize, x, y ) )
            {
                for(int i = y; i < y + vehicleSize; i++ )
                {
                    map[x][i] = vehicleType;
                }
            }          
        }

        return map;
    }

    public static boolean isPositionValid( int[][] map, int vehicleSize, int x, int y )
    {
        if( ( y + vehicleSize - 1 ) > map.length - 1 || x > map.length - 1 )
        {
            //throw new SizeLimitExceededException( "Wrong positioning" );
            return false;
        }

        for(int i = y; i < y + vehicleSize; i++)
        {
            if( map[x][i] != 0 )
            {
                return false;
            }
        }

        return true;
    }
    
    public static boolean isPositionValid( BlockLabel[][] map, Vehicle vehicle, int x, int y ) throws SizeLimitExceededException, InvalidPositionException
    {
        if( ( y + vehicle.getSize() - 1) > map.length - 1 || x > map.length - 1 )
        {
            throw new SizeLimitExceededException( "Wrong positioning" );
        }

        for(int i = y; i < y + vehicle.getSize(); i++)
        {
            if( map[x][i].getVehicle() != null )
            {
                throw new InvalidPositionException();
            }
        }
        
        return true;
    }


}
