package TryAndCatch;

public class TryAndCatchKroketten {
    public static void main(String[] args) {
        System.out.println("Juan hat Hunger");
        String essen = annaMariaKroketten();
        System.out.println("Juan isst " + essen);
    }

    private static String annaMariaKroketten() {
        System.out.println("Anna-Maria hol Kroketten");
        String essen;
        try {
            essen = kochMacheKroketten();
        } catch (RuntimeException e) {
            essen = "Ratatouille";
        }
        System.out.println("Anna-Maria gibt kroketten");
        return essen;
    }

    private static String kochMacheKroketten() { // hier throw Exception
        System.out.println("Koch kocht");
        throw new RuntimeException("Ein (PzKw VIII) Maus im sack"); // throw new Exception  = Exception bei dem der es aufgerufen hat

    }

}
