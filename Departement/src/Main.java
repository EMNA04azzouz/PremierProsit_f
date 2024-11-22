public class Main {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        DepartementHashSet dh = new DepartementHashSet();
        Departement d1 = new Departement(1,"xx",5);
        Departement d2 = new Departement(2,"yy",5);
        Departement d3 = new Departement(3,"zz",5);
        System.out.println("Avec le treeSet");
        ts.ajouterDepartement(d1);
        ts.ajouterDepartement(d2);
        ts.ajouterDepartement(d3);
        ts.displayDepartement();
        System.out.println("Avec le hashSet");
        dh.ajouterDepartement(d1);
        dh.ajouterDepartement(d2);
        dh.ajouterDepartement(d3);
        dh.displayDepartement();
        System.out.println("recherche par nom");
        System.out.println("Avec le TreeSet " + ts.rechercherDepartement("yy"));
        System.out.println("Avec le HashSet" + dh.rechercherDepartement("yy"));
        System.out.println("Recherche par Objet ");
        System.out.println("Avec le TreeSet " + ts.rechercherDepartement(new Departement()));
        System.out.println("Avec le HashSet" + dh.rechercherDepartement(new Departement()));
    }
}