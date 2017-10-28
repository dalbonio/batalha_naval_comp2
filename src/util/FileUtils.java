package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils
{
    public String[] getVehiclesFromFile( String filename ) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader( new FileReader( filename ) );
        String[] vehiclesArray = null;

        try
        {
            StringBuilder stringBuilder = new StringBuilder();
            String line = bufferedReader.readLine();

            while ( line != null )
            {
                stringBuilder.append( line );
                stringBuilder.append( " " );

                line = bufferedReader.readLine();
            }

            String vehicleStr = stringBuilder.toString().trim();
            char[] vehicleCharArray = vehicleStr.toCharArray();

            for(int i = 0; i < vehicleStr.length(); i++)
            {
                if( Character.isLetter( vehicleStr.charAt( i ) ) )
                {
                    vehicleCharArray[i] = (char)( vehicleCharArray[i] - 'A' + '0');
                }
            }

            vehiclesArray = String.valueOf( vehicleCharArray ).split( " " );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            bufferedReader.close();
        }

        return vehiclesArray;
    }
}
