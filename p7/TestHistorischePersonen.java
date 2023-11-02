// Alexandros Apostolidis
public class TestHistorischePersonen {
    public static void main(String[] args) {
        HistorischePerson[] persFeld = new HistorischePerson[persData.length];
        for (int i=0;i<persFeld.length;i++) {
            persFeld[i] = new HistorischePerson(persData[i]);
        }

        HistorischePerson.sort(persFeld);
        
        for (HistorischePerson hp : persFeld) {
            System.out.println(hp);
        }
        
    }

    /* *** Aufgabe 2a *** */
    // 1
    public static String[] persData = {
        "Alexander Fleming;Britischer Mediziner und Bakteriologe;18810806;19550311",
        "Albert Einstein;Theoretischer Physiker;18790314;19550418",
        "Alexander von Humboldt;Deutscher Forschungsreisender;17690914;18590506",
        "Charles Darwin;Britischer Naturforscher;18090212;18820419",
        "Friedrich Schiller;Deutscher Dichter und Philosoph;17591110;18050509",
        "Isaac Newton;Englischer Physiker, Astronom und Mathematiker;16430104;17270331",
        "James Cook;Britischer Seefahrer und Entdecker;17281107;17790214",
        "Johann Sebastian Bach;Deutscher Komponist und Musiker;16850331;17500728",
        "Leonardo Da Vinci;Italienischer Maler, Bildhauer und Architekt;14520415;15190502",
        "Mahadma Gandhi;Indischer Rechtsanwalt, Asket und Pazifist;18691002;19480130",
        "Maria Theresia von Österreich;Österreichische Kaiserin;17170513;17801129",
        "Marie Curie;Physikerin und Chemikerin;18671107;19340704",
        "Martin Luther King;US-amerikanischer Bürgrrechtler;19290115;19680404",
        "Nelson Mandela;Südafrikanischer Staatsmann;19180718;20131205",
        "Robert Koch;Deutscher Nediziner und Mikrobiologe;18431211;19100527",
        "Aristoteles Onassis;griechisch-argentinischer Reeder;19060115;19750515",
        "Napoleon Bonaparte;französischer General, Diktator und Kaiser der Franzosen;17690815;18210505",
        "Joseph Stalin;sowjetischer kommunistischer Politiker und Diktator der Sowjetunion;18781218;19530305"
    };
}


