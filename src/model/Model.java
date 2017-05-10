/**
 *
 */
package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import utility.ReadDeckFile;

/**
 * @author eshinig
 *
 */
public class Model
{
    private static List<Card> deckList = new ArrayList<>();
    private static Card[] deck_1 = new Card[20];
    private static Card[] deck_2 = new Card[19];
    List<String> deckList1 = new ArrayList<>();
    List<String> deckList2 = new ArrayList<>();;
    private static String deck1FileName = "deck1.ptcgo.txt";
    private static String deck2FileName = "deck2.ptcgo.txt";

    public Model()
    {
        try
        {
            ReadDeckFile.readCardNames(deckList1, deck1FileName);
            ReadDeckFile.readCardNames(deckList2, deck2FileName);
        } catch (IOException e)

        {
            System.err.println("File: " + deck1FileName + "cannot be opened");
            e.printStackTrace();
        }
        //... ClassLoader is where to get images from this .jar file.
        //ClassLoader cldr = this.getClass().getClassLoader();

        int n = 0;         // Which card.
        int xPos = 0;      // Where it should be placed initially.
        int yPos = 0;

        for (int i = 0; i < deckList1.size(); ++i)
        {
            String imagePath = "cards/Deck1/" + deckList1.get(i) + ".png";
            System.out.println(imagePath);
            //URL imageURL = cldr.getResource(imagePath);
            ImageIcon img = new ImageIcon(imagePath);

            //... Create a card and add it to the deck.
            Card card = new Card(img);
            card.moveTo(xPos, yPos);
            deck_1[n] = card;
            //... Update local vars for next card.
            xPos += 1;
            yPos += i;
            n++;
        }
        n=0;
        xPos = 550;      // Where it should be placed initially.
        yPos = 550;
        for (int i = 0; i < deckList2.size(); ++i)
        {
            String imagePath = "cards/Deck2/" + deckList2.get(i) + ".png";
            System.out.println(imagePath);
            //URL imageURL = cldr.getResource(imagePath);
            ImageIcon img = new ImageIcon(imagePath);

            //... Create a card and add it to the deck.
            Card card = new Card(img);
            card.moveTo(xPos, yPos);
            deck_2[n] = card;
            //... Update local vars for next card.
            xPos += 1;
            yPos += 1;
            n++;
        }
    }

public static Card[] getDeck_1()
{
    return deck_1;
}

public static Card[] getDeck_2()
{
    return deck_2;
}

public List<String> getDeskList1()
{
    return deckList1;
}

public List<String> getDeskList2()
{
    return deckList2;
}
}
