import java.util.TreeSet;

public interface IDepartement <Departement >{
    public void ajouterDepartement(Departement  t);
    public boolean rechercherDepartement(String nom);
    public boolean rechercherDepartement(Departement  t);
    public void supprimerDepartement(Departement  t);
    public void displayDepartement();
    public TreeSet<Departement > trierDepartementById();
}



