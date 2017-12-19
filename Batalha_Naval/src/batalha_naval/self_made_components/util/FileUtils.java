package batalha_naval.self_made_components.util;

import batalha_naval.self_made_components.exceptions.EmptyFileException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class FileUtils
{
    public static boolean isFileValid( List<String> fileLines ) throws EmptyFileException
    {        
        if( fileLines.isEmpty() )
        {
            throw new EmptyFileException();
        }
        
        List<Integer> invalidPositions = new ArrayList<>();
        
        System.out.println( fileLines );
        //
        Pattern pattern = Pattern.compile( Constants.FILE_REGEX );
        Matcher matcher;      
        
        for(int i = 0; i < fileLines.size(); i++)
        {
            matcher = pattern.matcher( fileLines.get(i) ); 
            
            if( !matcher.matches() || fileLines.get(i).isEmpty() )
            {
                invalidPositions.add( i + 1 );
            }            
        }

        if( !invalidPositions.isEmpty() )
        {
             JOptionPane.showMessageDialog( null, "As seguintes linhas são inválidas: " + invalidPositions );
        }       
        
        return true;
    }
}
