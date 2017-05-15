import java.util.*; 

public class ActionController {
    Robot robot = new Robot();
    private List<Sample> allSamples;
    private boolean started = true;
    private Queue<String> actionQueue = new LinkedList<>();
    
    public ActionController(List<Sample> allSamples) {
        this.setAllSamples(allSamples);
    }
    
    public Queue<String> calculateNextActions(Robot robot) {
        if (this.robot.getSamples().size() == 0) {
            if (!this.robot.getLocation().equals("DIAGNOSIS")) {
                this.actionQueue = new LinkedList<>();
                goToDiagnosis();
        
            } 
        } else {
            for (Sample sample : this.robot.getSamples().getSamples()) {
                
            }
        }
        
        return this.actionQueue;
    }

    public List<Sample> getAllSamples() {
        return this.allSamples;
    }

    public void setAllSamples(List<Sample> allSamples) {
        this.allSamples = allSamples;
    }
    
    private void goToDiagnosis() {
        this.actionQueue.add("GOTO DIAGNOSIS");      
    }
    
    private void goToLab() {
        this.actionQueue.add("GOTO LABORATORY");   
    }
    
    private void goToMolecules() {
        this.actionQueue.add("GOTO MOLECULES");        
    }
    
    private static String connect(String command) {
        
        return "CONNECT " + command;
    }
}
