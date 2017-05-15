public class Sample {

    private int sampleId;
    private int carriedBy;
    private int rank;
    private int expertise;
    private int health;
    private int costA;
    private int costB;
    private int costC;
    private int costD;
    private int costE;
    

    public Sample(int id, int carriedBy, int rank, int expertise, int health, int A, int B, int C, int D, int E) {
        this.setSampleId(id);
        this.setCarriedBy(carriedBy);
        this.setRank(rank);
        this.setExpertise(expertise);
        this.setHealth(health);
        this.setCostA(A);
        this.setCostB(B);
        this.setCostC(C);
        this.setCostD(D);
        this.setCostE(E);
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExpertise() {
        return this.expertise;
    }

    public void setExpertise(int expertise) {
        this.expertise = expertise;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getCarriedBy() {
        return this.carriedBy;
    }

    public void setCarriedBy(int carriedBy) {
        this.carriedBy = carriedBy;
    }

    public int getSampleId() {
        return this.sampleId;
    }

    public void setSampleId(int sampleId) {
        this.sampleId = sampleId;
    }

    public int getCostA() {
        return this.costA;
    }

    public void setCostA(int costA) {
        this.costA = costA;
    }

    public int getCostB() {
        return this.costB;
    }

    public void setCostB(int costB) {
        this.costB = costB;
    }

    public int getCostC() {
        return this.costC;
    }

    public void setCostC(int costC) {
        this.costC = costC;
    }

    public int getCostD() {
        return this.costD;
    }

    public void setCostD(int costD) {
        this.costD = costD;
    }

    public int getCostE() {
        return this.costE;
    }

    public void setCostE(int costE) {
        this.costE = costE;
    }
    
    public int totalCost() {
        return this.getCostA() + this.getCostB() + this.getCostC() + this.getCostD() + this.getCostE();        
    }

}
