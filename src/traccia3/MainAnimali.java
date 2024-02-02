package traccia3;

public class MainAnimali {
    public static void main(String[] args) {
        Animale animale1 = new Leone("franco",5);
        Animale animale2 = new Elefante("giorgio",20);

        GestoreAnimale gestoreAnimale = new GestoreAnimale();

        gestoreAnimale.addAnimale(animale1);
        gestoreAnimale.addAnimale(animale2);

        gestoreAnimale.stampaElencoSuoni();
    }
}
