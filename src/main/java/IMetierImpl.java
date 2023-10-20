import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier {
    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double tmp= dao.getDate();
        return tmp;
    }

    public void setDao(IDao dao){
        this.dao=dao;
    }
}
