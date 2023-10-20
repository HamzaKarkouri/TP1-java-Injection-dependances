import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getDate() {

        double temp=Math.random()*40;
        return temp;
    }
}
