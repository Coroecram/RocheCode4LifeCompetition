import java.util.*;

public class MoleculeHolder {
    
    private HashMap<Character, Integer> molecules;
    private static int totalMolecules = 0;
    
    {
        this.molecules = new HashMap<Character, Integer>();
        this.molecules.put('A', 0);
        this.molecules.put('B', 0);
        this.molecules.put('C', 0);
        this.molecules.put('D', 0);
        this.molecules.put('E', 0);
    }

    public MoleculeHolder() {
        
    }
    
    public int getMolecule(char molecule) {
        
        return this.molecules.get(molecule);
    }
    
    public int addMolecule(char molecule) {
        if (this.molecules.get(molecule).equals(null)) {
            return -1;
        } else if (totalMolecules >= 10) {
            System.err.println("You are already holding 10 molecules.");
            return -1;
        }
            totalMolecules++;
            return this.molecules.put(molecule, this.molecules.get(molecule)+1);
    }
    
    public int useMolecule(char molecule) {
        if (this.molecules.get(molecule) - 1 >= 0) {
            totalMolecules--;
            return this.molecules.put(molecule, this.molecules.get(molecule)-1);
        } else {
            System.err.println("There are no more " + molecule + " molecules to use.");
            return -1;
        }
    }
    
    public MoleculeHolder dup(){
        MoleculeHolder duplicated = new MoleculeHolder();
        for (Character moleculeKey : this.molecules.keySet()) {
            duplicated.molecules.put(moleculeKey, this.molecules.get(moleculeKey));
        }
        
        return duplicated;
    }
    
}
