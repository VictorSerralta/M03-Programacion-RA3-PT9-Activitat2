package Activitat2;

public class Alumne {
    private String nom;
    private String cognoms;
    private int edat;
    private String dni;

    public Alumne(){
        this.nom = "";
        this.cognoms = "";
        this.edat = 0;
        this.dni = "";
    }

    public String getNom(){
        return nom;
    }

    public String getCognoms(){
        return cognoms;
    }

    public int getEdat(){
        return edat;
    }

    public String getDni(){
        return dni;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setCognoms(String cognoms){
        this.cognoms = cognoms;
    }

    public void setEdat(int edat){
        this.edat = edat;
    }

    public void setDni(String dni){
        this.dni = dni;
    }
}
