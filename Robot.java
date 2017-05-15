
public class Robot {

    private MoleculeHolder molecules;
    private 

    public Robot() {
        this.setMolecules(new MoleculeHolder());
        
    }

    private MoleculeHolder getMolecules() {
        return molecules;
    }

    private void setMolecules(MoleculeHolder molecules) {
        this.molecules = molecules;
    }
    
}
