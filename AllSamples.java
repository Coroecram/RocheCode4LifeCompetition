import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AllSamples {
    private List<Sample> samples = new ArrayList<Sample>();
    
    public AllSamples() {
       
    }
    
    public void addSample(Sample sample) {
        this.samples.add(sample);
    }
    
    public List<Sample> sorted() {
        Collections.sort(this.samples, new Comparator<Sample>() {
            @Override
            public int compare(Sample sample2, Sample sample1){

                return  sample1.totalCost() - sample2.totalCost();
            }
            
        });
        
        return this.samples;
    }
}
