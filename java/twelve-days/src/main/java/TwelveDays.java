import java.util.*;
class TwelveDays {

    ArrayList<String> days;
    ArrayList<String> gifts;

    TwelveDays(){
        days = new ArrayList<>();
        gifts = new ArrayList<>();
        allDays();
        allGifts();
    }

    public void allDays(){
        days.add("first");
        days.add("second");
        days.add("third");
        days.add("fourth");
        days.add("fifth");
        days.add("sixth");
        days.add("seventh");
        days.add("eighth");
        days.add("ninth");
        days.add("tenth");
        days.add("eleventh");
        days.add("twelfth");
    }

    public void allGifts(){
        gifts.add("a Partridge in a Pear Tree");
        gifts.add("two Turtle Doves");
        gifts.add("three French Hens");
        gifts.add("four Calling Birds");
        gifts.add("five Gold Rings");
        gifts.add("six Geese-a-Laying");
        gifts.add("seven Swans-a-Swimming");
        gifts.add("eight Maids-a-Milking");
        gifts.add("nine Ladies Dancing");
        gifts.add("ten Lords-a-Leaping");
        gifts.add("eleven Pipers Piping");
        gifts.add("twelve Drummers Drumming");
    }
    String verse(int verseNumber) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        StringBuilder resultVerse = new StringBuilder();
                resultVerse.append(String.format("On the %s day of Christmas my true love gave to me: ", days.get(verseNumber-1)));
        for(int i=verseNumber-1; i>=0; i--){
            if(i==0){
                if(verseNumber>1)
                    resultVerse.append("and "+gifts.get(i));
                else
                    resultVerse.append(gifts.get(i));
                resultVerse.append(".\n");
            }
            else{
                resultVerse.append(gifts.get(i));
                resultVerse.append(", ");
            }
        }
        
        return resultVerse.toString();
   
        
    }

    String verses(int startVerse, int endVerse) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        StringBuilder resultVerses = new StringBuilder();
        for(int i=startVerse; i<=endVerse; i++){
            if(i==endVerse)
                resultVerses.append(verse(i));
            else
                resultVerses.append(verse(i)+"\n");
            }
        
            return resultVerses.toString();
            
    }
    
    String sing() {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        return verses(1, 12);
        
    }
}
