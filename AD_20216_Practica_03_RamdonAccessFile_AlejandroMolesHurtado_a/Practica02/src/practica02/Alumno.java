
package practica02;


public class Alumno {
    private int Matricula;
    private Double Nota;
    private String Nombre;
   
    private char sexo;
    
    public Alumno(int Matricula, Double Nota, String Nombre, char sexo) {
        this.Matricula = Matricula;
        this.Nota = Nota;
        this.Nombre = Nombre;
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public Double getNota() {
        return Nota;
    }

    public void setNota(Double Nota) {
        this.Nota = Nota;
    }
    
}
