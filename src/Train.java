public class Train implements AbstractTrain  {
    private int numerTrain;
    private String way;
    private int distanceCity;
    private Enum statys;
    private int amountLiter;
    private double rateFor100km;
    private Enum position;

    public Train(int numerTrain, String way, int distanceCity, Enum statys, int amountLiter, double rateFor100km, Enum position) {
        this.numerTrain = numerTrain;
        this.way = way;
        this.distanceCity = distanceCity;
        this.statys = statys;
        this.amountLiter = amountLiter;
        this.rateFor100km = rateFor100km;
        this.position = position;
    }

    public int getNumerTrain() {
        return numerTrain;
    }

    public void setNumerTrain(int numerTrain) {
        this.numerTrain = numerTrain;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public int getDistanceCity() {
        return distanceCity;
    }

    public void setDistanceCity(int distanceCity) {
        this.distanceCity = distanceCity;
    }

    public Enum getStatys() {
        return statys;
    }

    public void setStatys(Enum statys) {
        this.statys = statys;
    }

    public int getAmountLiter() {
        return amountLiter;
    }

    public void setAmountLiter(int amountLiter) {
        this.amountLiter = amountLiter;
    }

    public double getRateFor100km() {
        return rateFor100km;
    }

    public void setRateFor100km(double rateFor100km) {
        this.rateFor100km = rateFor100km;
    }

    public Enum getPosition() {
        return position;
    }

    public void setPosition(Enum position) {
        this.position = position;
    }

    @Override
    public void refill(int a) {
        amountLiter = amountLiter + a;
    }

    @Override
    public void departun() {
            if (distanceCity > (amountLiter * rateFor100km)) {
                ThrowExeptionHandl.throwExeptionHandl();
            }else {
                System.out.println("Отправление разрешено");
            }
    }

    @Override
    public void changeStays() {


    }

    @Override
    public void unloiding() {
        if (statys.equals(Statys.INAWAY)){
            ThrowExeptionHandl.throwExeptionWay();
        } else if (statys.equals(Statys.EMPTY)) {
            ThrowExeption.errorloiding();
        } else if (statys.equals(Statys.FUEL)) {
            position=Position.ISEMPTY;
            statys=Statys.EMPTY;
            System.out.println("поезд номер "+getNumerTrain()+" "+getPosition().toString());
        }

    }
    public void loading(){
        if (statys.equals(Statys.INAWAY)){
            ThrowExeptionHandl.throwExeptionWay();
        } else if (statys.equals(Statys.EMPTY)) {
            position=Position.ISFUEL;
            statys=Statys.FUEL;
            System.out.println("поезд номер "+getNumerTrain()+" "+getPosition().toString());
        } else if (statys.equals(Statys.FUEL)) {
            ThrowExeptionHandl.throwExeptionunloiding();
        }

    }

    @Override
    public String toString() {
        return "Train{" +
                "numerTrain=" + numerTrain +
                ", way='" + way + '\'' +
                ", distanceCity=" + distanceCity +
                ", statys=" + statys +
                ", amountLiter=" + amountLiter +
                ", rateFor100km=" + rateFor100km +
                ", position=" + position +
                '}';
    }
}
