
public class Robot {

    private MoleculeHolder molecules;
    private SampleHolder samples;
    private String location = "";

    public Robot() {
        this.setMolecules(new MoleculeHolder());
        this.setSamples(new SampleHolder());
        
    }
    
    public MoleculeHolder getMolecules() {
        return this.molecules;
    }
    
    public SampleHolder getSamples() {
        return this.samples;
    }
    
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    private
    
    void setSamples(SampleHolder sampleHolder) {
        this.samples = sampleHolder;        
    }

    void setMolecules(MoleculeHolder molecules) {
        this.molecules = molecules;
    }
    
}
