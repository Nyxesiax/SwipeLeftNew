package com.example.swipeleft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Videos {

    GAMEOFTHRONES("dcFIvnj8_UI", "Game of Thrones", new String[]{"Drama", "Fantasy"}, "4.4", "2011", "In Essos ist Daenerys Targaryen als Erbin der vor Jahren abgesetzten Königsfamilie von Westeros bestrebt, wieder an die Macht zu gelangen. Die komplexe Handlung umfasst zahlreiche Figuren und thematisiert unter anderem Politik und Machtkämpfe, Gesellschaftsverhältnisse, Kriege und Religionen."),
    BREAKINGBAD("ceqOTZnhgY8", "Breaking Bad", new String[]{"Drama"}, "4.7", "2008", "Breaking Bad (sinngemäß „vom rechten Weg abkommen“, „eine kriminelle Laufbahn einschlagen“) ist eine US-amerikanische Krimi-Drama-Fernsehserie von Vince Gilligan. Sie zeigt die Wandlung eines an Lungenkrebs erkrankten biederen Chemielehrers zu einem rücksichtslosen Kriminellen."),
    SHERLOCK("ofG0IIFe5rc", "Sherlock", new String[]{"Abenteuer", "Krimi", "Drama"}, "5.0", "2010", "Handlung. Sherlock Holmes ist ein beratender Privatdetektiv mit bemerkenswerten kognitiven Fähigkeiten, der zusammen mit dem ehemaligen Militärarzt Dr. John Watson eine WG in der Londoner Baker Street 221B gründet."),
    THEMANDALORIAN("V2ZxSJy_BOQ", "The Mandalorian", new String[]{"Abenteuer", "Sci-Fi"}, "4.7", "2019", "Die Serie folgt einem mandalorianischen Kopfgeldjäger und Einzelkämpfer, der sich nach dem Fall des Galaktischen Imperiums durch die äußeren Bereiche der Galaxis kämpft, weit weg vom Einfluss der Neuen Republik."),
    CHERNOBYL("dsWF6vC8zpY", "Chernobyl", new String[]{"Drama"}, "4.9", "2019", "\"Chernobyl\", eine Koproduktion von HBO und Sky, erzählt die Geschichte des ukrainischen Super-GAUs aus dem Jahre 1986 und die seiner Opfer und Helden. Die Mitarbeiter des Kernkraftwerks Tschernobyl, nahe der besiedelten Stadt Pripyat, wissen nicht, welches Ausmaß der nukleare Unfall einnehmen wird."),
    TRUEDETECTIVE("oZkToJgabOA", "True Detective", new String[]{"Krimi", "Drama", "Thriller"}, "4.4", "2014", "True Detective ist eine Krimiserie, in der mithilfe von Zeitsprüngen und verschiedenen Blickwinkeln eine 17 Jahre zurückliegende Mordserie aufgeklärt werden soll. Die beiden Ermittler der ersten Staffel, die Jagd auf den Serienmörder machen, werden von Matthew McConaughey und Woody Harrelson gespielt."),
    STRANGERTHINGS("jJU_1ZSi-To", "Stranger Things", new String[]{"Drama", "Fantasy", "Thriller"}, "4.7", "2016", "Die Serie spielt in den 1980er Jahren in dem fiktiven Ort Hawkins in Indiana. Im Mittelpunkt stehen vier befreundete Jungen und das mysteriöse, plötzlich aufgetauchte Mädchen Elfi, das über psychokinetische Fähigkeiten verfügt."),
    THEWALKINGDEAD("sfAc2U20uyg", "The Walking Dead", new String[]{"Drama", "Horror"}, "4.5", "2010", "Die AMC-Serie dreht sich um eine Gruppe von Menschen, die sich plötzlich in einer postapokalyptischen Welt wiederfinden, die von Zombies übersät ist. Überleben heißt nun das oberste Gebot der Stunde – auch für den Sheriff Rick Grimes, der nach einem schief gelaufenem Einsatz im Krankenhaus wieder zu sich komm"),
    BANDOFBROTHERS("kyDkHvi9yeI", "Band Of Brothers", new String[]{"Drama", "Krieg"}, "4.3", "2001", "Die Miniserie ist an das gleichnamige Buch des Historikers Stephen Ambrose angelehnt und schildert die Ereignisse des Zweiten Weltkriegs zwischen 1942 und 1945 aus Sicht der Soldaten der Easy Company, 2. Bataillon, 506. US-Fallschirmjägerregiment der 101. US-Luftlandedivision der US-Streitkräfte."),
    DEXTER("YQeUmSD1c3g", "Dexter", new String[]{"Drama", "Thriller"}, "4.9", "2006", "Dexter ist eine US-amerikanische Krimi- bzw. Dramaserie mit Elementen des schwarzen Humors. Michael C. Hall spielt den Serienmörder Dexter Morgan, der beim Miami-Metro Police Department als Forensiker in der Blutspurenanalyse arbeitet und in seiner Freizeit Selbstjustiz übt."),
    VIKINGS("t9EV3DJPHow", "Vikings", new String[]{"Abenteuer", "Drama", "Historie"}, "4.6", "2013", "Die Wikinger vereinen sich zu einer großen Flotte und schwören Rache an Ragnars Tod. König Aelle wird von den Söhnen Ragnars gefangen genommen und durch die Blutadler-Methode hingerichtet. Ragnars Söhne besiegen die Arme von Aethelwulf in Wessex, doch Aethelwulf kann fliehen."),
    DASDAMENGAMBIT("gijHVZ5YW4g", "Das Damengambit", new String[]{"Drama"}, "4.9", "2020", "Beth hat ein unglaubliches Talent und spielt bereits im Alter von 16 Jahren bei den U.S. Open gegen die Profis des Schachs. Doch je weiter Beth (Anya Taylor-Joy) auf der Karriereleiter emporsteigt, desto mehr flüchtet sie sich in die Isolation und ihre Sucht."),
    WEDNESDAY("3i6eGvEA5JA", "Wednesday", new String[]{"Komödie", "Fantasy", "Thriller"}, "4.8", "2022", "Wednesday Addams wird, nachdem sie wegen eines Anschlags mit Piranhas auf Mitschüler der Highschool verwiesen wurde, gegen ihren Willen von ihren Eltern auf die Nevermore Academy geschickt, ein Internat für monströse Außenseiter, das auch von ihren Eltern besucht wurde."),
    HOWIMETYOURMOTHER("cjJLEYMzpjc", "How I Met Your Mother", new String[]{"Komödie"}, "3.9", "2005", "In der Sitcom \"How I Met Your Mother\" des US-Senders CBS erzählt Hauptfigur Ted Mosby seinen Kindern im Jahr 2030 ausführlich, wie er ihre Mutter kennengerlernt hat. Dabei schweift er oft in Geschichten ab, die er mit seinen besten Freunden Marshall Eriksen, Robin Scherbatsky, Barney Stinson und Lily Aldrin erlebt hat."),
    BROOKLYNNINENINE("sEOuJ4z5aTc", "Brooklyn-Nine-Nine", new String[]{"Komödie", "Krimi"}, "4.8", "2013", "Dreh- und Angelpunkt der Comedyserie ist das fiktive 99. Revier des New Yorker Police Departments (NYPD) in Brooklyn. Hier sorgen die Detectives Jake Peralta, gespielt von Comedian und \"The Lonely Island\"-Frontmann Andy Samberg, Rosa Diaz (Stephanie Beatriz) und Charles Boyle (Joe Lo Truglio) für Ruhe und Ordnung."),
    NARCOS("4kpIwP_ruWw", "Narcos", new String[]{"Biopic", "Krimi", "Drama", "Thriller"}, "4.2", "2015", "Die Serie behandelt den Aufstieg von Pablo Escobar und dem kolumbianischen Medellín-Kartell zu einem der mächtigsten Drogenkartelle der Welt in den 1970er- und 80er-Jahren.");

    private final String[] genres;
    private String videoId;
    private String videoTitle;
    private String bewertung;
    private String jahr;
    private String beschreibung;

    Videos(String videoId, String videoTitle, String[] genres, String bewertung, String jahr, String beschreibung){
        this.videoId = videoId;
        this.videoTitle = videoTitle;
        this.genres = genres;
        this.bewertung = bewertung;
        this.jahr = jahr;
        this.beschreibung = beschreibung;
    }

    private static final List<Videos> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Videos randomLetter()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public String getVideoId() {
        return videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public String[] getGenres(){return genres;}

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getBewertung() {
        return bewertung;
    }

    public void setBewertung(String bewertung) {
        this.bewertung = bewertung;
    }

    public String getJahr() {
        return jahr;
    }

    public void setJahr(String jahr) {
        this.jahr = jahr;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}
