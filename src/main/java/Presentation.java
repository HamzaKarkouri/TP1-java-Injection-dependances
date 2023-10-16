public class Presentation {
    public static void main(String[] args){

        /*
        Injection des dépendances par instantiation statiques */


        DaoImpl dao = new DaoImpl();
        IMetierImpl metier = new IMetierImpl();

        metier.setDao(dao);
        System.out.println("Résultat:"+metier.calcul());
    }
}
