public class TestListen {
   public static void main(String[] args) {
       Teilnehmer[] teilnehmer = TestData.getTeilnehmerFeld();

       /* *** Aufgabe 2c *** */
        Liste[] ll = new Liste[3];
        ll[0] = new Liste();
        ll[1] = new SortierteListe();
        ll[2] = new ListenFeld();

        for (Teilnehmer t : teilnehmer) {
            for (Liste liste : ll) {
                liste.insert(t);
            }
        }
        
        for (Liste liste : ll) {
            liste.print();
        }
       

   }
}
