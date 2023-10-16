public class IMetierImpl implements IMetier {
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
