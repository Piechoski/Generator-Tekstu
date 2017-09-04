package pl.akademiakodu.loremipsum2;


public class Generator implements loremipsum {
    public final String lorem =" Tornistry moich dzieci ważą tyle jakby były zrobione z betonu." +
            " Ilość książek, zeszytów ćwiczeń i dziwnego badziewia jest kosmiczna//. " +
            "Przypomniało mi to mój tornister//. Książki kupowałem używane." +
            " Najbardziej lubiałem te po ś.p//. Jaśku Trzasce. Jasiek był fajnym chłopakiem, tyle" +
            " że urodził się w rodzinie meneli. Książki po nim były może i nie do końca czytane" +
            " ale zawsze było w nich pełno ekspresji. Jasiek z pasją dorysowywał wszystkim chuje," +
            " nieważne kobieta, mężczyzna, koń. Pamiętam książkę do historii. Szarża szwoleżerów " +
            "na koniach potykających się niemal o swoje gigantyczne penisy, na nich szwoleżerowie," +
            " piękni z fantazyjnie zarzuconymi na udo maczugami. Kościuszko na rynku krakowskim" +
            " ślubuje. W tle kosynierzy (peniserzy?) z zadartymi na szpic penisami zamiast kos. " +
            "I ta męka artysty. Rysunek przedstawiajacy popiersie Józefa Bema. Strona aż" +
            " pulsowala początkową bezsilnością Janka. I rozwiązanie: nonszalancki penis " +
            "wyrastający prosto z czoła bohatera Polski i Węgier. Proste rozwiązanie" +
            " złożonego problemu. Haiku kreski." +
            " Jak tam Jasiek gdzieś sobie lewitujesz to pozdrawiam.";
    @Override
    public String generateParagraphs(int number) {
        StringBuilder fullString = new StringBuilder("");
        for (int i = 0; i < number; i++) {
            fullString.append(lorem);
        }
        return fullString.toString();
    }

    @Override
    public String generateSentences(int number) {
        StringBuilder sentenseString = new StringBuilder("");
        String sentences[] = lorem.split("//.");
        for (int i = 0;i< number;i++) {
            sentenseString.append(sentences[i] + "//.");
        }
        return sentenseString.toString();



    }

    @Override
    public String generateWords(int number) {
        StringBuilder wordString = new StringBuilder("");
        String word [] = lorem.split(" ");
        for (int i=0;i<number;i++){
          wordString.append(word[i]+" ")  ;

        }
        return wordString.toString();
    }

    @Override
    public String generateLoremIpsum() {
        return null;
    }

}


