/**
 * 
 */
package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * @author eshinig
 *
 */
public class ReadDeckFile
{

    /**
     * @param args
     * @throws IOException 
     * @throws FileNotFoundException 
     */
    //read the list of deck
    public static void readCardNames(List<String> deskList,String deckFileName) throws FileNotFoundException, IOException
    {
        String line = null;

        int cardCategoryCounter = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("cards/names/"+deckFileName))) {

            while((line = br.readLine()) != null) 
            {
                if(line.startsWith("##Pokemon"))
                {
                    ++cardCategoryCounter;
                }
                if(line.startsWith("##Trainer"))
                {
                    ++cardCategoryCounter;
                }

                if(line.startsWith("##Energy"))
                {
                    ++cardCategoryCounter;
                }
                //* 2 Doduo GEN 55
                if(line.startsWith("* ") && line.contains(""))
                {
                    //2 Doduo GEN
                    //TODO Extract this number
                    line = line.substring(line.indexOf(" ")+1, line.lastIndexOf(" "));
                    //Doduo
                    line = line.substring(line.indexOf(" ")+1, line.lastIndexOf(" "));
                    /*
                     * Pokemon Cards
                     */
                    if(cardCategoryCounter == 1)
                        {
                        System.out.println(line);
                        deskList.add(line);
                        }
                  }
                }
            }
        }
    }
