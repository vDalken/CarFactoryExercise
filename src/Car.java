class Car {
    String carType;
    int productionCost;
    boolean isEngineOk;
    public Car(boolean isEngineOk, String carType, int productionCost) {
        this.isEngineOk = isEngineOk;
        this.carType = carType;
        this.productionCost = productionCost;
    }

    @Override
    public String toString() {
        return "Car Type:'" + carType + '\'' +
                " /Production Cost: " + productionCost +
                " /Does it work properly?: " + isEngineOk;
    }
}
