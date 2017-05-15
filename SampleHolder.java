import java.util.*;

public class SampleHolder {
        private Sample[] samples = new Sample[3];
        
        public SampleHolder() {
            this.samples = this.samples;
        }

        public Sample[] getSamples() {
            return this.samples;
        }

        private Sample[] setSamples(Sample[] samples) {
            this.samples = samples;
            return this.samples;
        }
        
        public Sample[] sortSamples() {
            int min = 0;
            int max = 0;
            int mid = 0;
            int i = 0;
            Integer[] order = new Integer[3];
            Sample[] copySamples = new Sample[3];
            System.arraycopy(this.samples, 0, copySamples, 0, this.samples.length );
            
            for (Sample sample : this.samples) {
               int totalCost = sample.totalCost();
               if (min == 0 && max == 0 && mid == 0) {
                 min = totalCost;
                 max = totalCost;
                 mid = totalCost;
               } else if (totalCost < min) {
                   min = totalCost;
                   order[2] = i;
               } else if (totalCost > max && totalCost <= 10) {
                   max = totalCost;
                   order[0] = i;
               } else {
                   mid = totalCost;
                   order[1] = i;
               }
               i++;
            }
            
            for (int j = 0; j <= 2; j++) {
                setSample(copySamples[order[j]], j); 
            }
            
            return this.samples;
        }
        
        public Sample getSample() {
            return this.samples[0];
        }
        
        public Sample getSample(int index) {
            return this.samples[index];
        }
        
        public Sample[] setSample(Sample sample, int index) {
            this.samples[index] = sample;
            return this.samples;
        }
        
        public Sample[] swapSamples(int firstIdx, int secondIdx) {
            Sample temp = this.samples[secondIdx];
            this.samples[secondIdx] = this.samples[firstIdx];
            this.samples[firstIdx] = temp;
            return this.samples;
        }
        
        public int size() {
            return this.getSamples().length;
        }
}
