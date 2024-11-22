import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class TreeSet  implements IDepartement {
    Set<Departement> dep;
    public DepartementTreeSet() {
        dep = new TreeSet<Departement>();
    }

    public void ajouterDepartement(Departement t)
    {
        dep.add(t);
    }
    public boolean rechercherDepartement(String nom)
    {
        for(Departement d : dep){
            if(d.getNomDep().equals(nom))
                return true;
        }
        return false;
    }
    public boolean rechercherDepartement(Departement t)
    {
        return dep.contains(t);
    }
    public void supprimerDepartement(Departement t)
    {
        dep.remove(t);
    }
    public void displayDepartement()
    {
        for(Departement d : dep){
            System.out.println(d.toString());
        }
    }

}
