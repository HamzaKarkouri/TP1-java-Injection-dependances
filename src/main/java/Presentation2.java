import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception{

        /*
        Injection des dépendances par instantiation dynamiques */

    Scanner scanner=new Scanner(new File("src/main/config.txt"));
    String daoClassName=scanner.nextLine();
    Class cDao=Class.forName(daoClassName);
IDao dao=(IDao) cDao.newInstance();
System.out.println(dao.getDate());

String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println("Résultat=>"+metier.calcul());
    }
}
