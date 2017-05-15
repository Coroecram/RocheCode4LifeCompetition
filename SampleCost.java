public class SampleCost {
    
    private int costA = 0;
    private int costB = 0;
    private int costC = 0;
    private int costD = 0;
    private int costE = 0;

    public SampleCost() {
    
    }

    public int getCostA() {
        return this.costA;
    }

    private void setCostA(int costA) {
        this.costA = costA;
    }

    public int getCostB() {
        return this.costB;
    }

    private void setCostB(int costB) {
        this.costB = costB;
    }

    public int getCostC() {
        return this.costC;
    }

    private void setCostC(int costC) {
        this.costC = costC;
    }

    public int getCostD() {
        return this.costD;
    }

    private void setCostD(int costD) {
        this.costD = costD;
    }

    public int getCostE() {
        return this.costE;
    }

    private void setCostE(int costE) {
        this.costE = costE;
    }
    
    private void addCostA(int costA) {
        this.costA += costA;
    }
    
    private void addCostB(int costB) {
        this.costB += costB;
    }
    
    private void addCostC(int costC) {
        this.costC += costC;
    }
    
    private void addCostD(int costD) {
        this.costD += costD;
    }
    
    private void addCostE(int costE) {
        this.costE += costE;
    }
    
    private void subtractCostA(int costA) {
        this.costA -= costA;
    }

    private void subtractCostB(int costB) {
        this.costB -= costB;
    }

    private void subtractCostC(int costC) {
        this.costC -= costC;
    }

    private void subtractCostD(int costD) {
        this.costD -= costD;
    }

    private void subtractCostE(int costE) {
        this.costE -= costE;
    }
    
    public int totalCost() {
        return this.getCostA() + this.getCostB() + this.getCostC() + this.getCostD() + this.getCostE();
    }

}