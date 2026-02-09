package Activitat2;

public class Matricula {

    private Alumne alumneMatricula;
    private Modul modulMatricula;
    private double nota;

    public Matricula() {
        this.alumneMatricula = new Alumne();
        this.modulMatricula = new Modul();
        this.nota = 0;
    }

    public Alumne getAlumneMatricula() {
        return alumneMatricula;
    }

    public Modul getModulMatricula() {
        return modulMatricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double novaNota) {
        nota = novaNota;
    }
}
