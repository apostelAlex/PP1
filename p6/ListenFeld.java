public class ListenFeld extends SortierteListe{
    private static int N = 5;
    Liste[] ll = new Liste[N];
    public ListenFeld(){
        for (int i = 0; i < ll.length; i++) {
            ll[i] = new SortierteListe();
        }
    }
    public void print(){
        for (Liste liste : ll) {
            liste.print();
            System.out.println();
        }
    }
    public void insert(Teilnehmer t){
        int index = (t.getKey()-2010)/2;
        ll[index].insert(t);
    }
    
}
