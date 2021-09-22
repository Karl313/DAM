package Listado;

/**
 * @author CFGS
 */
public class Alumno {
    public static void main(String[] args) {
        
    }
    int id = 0;
    String nombre = "";
    String apellido = "";
    double nota = 0;
    private String Bañon;
    private String Frank;

    public Alumno(int id, String nombre, String apellido, int nota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    Alumno() {
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public int getNota() {

        return (int) nota;
    }

    public void setNota(int nota) {
        this.nota = nota;

        nota = (int) (Math.random() * 10);
    }

    public static double sacarNota() {
        double nota = Math.random() * 10;
        return nota;
    }

    public static int sacarId() {
        int id = 1;
        
        return id++;
    }

    void setApellido(String bañon) {
       
    }


}// fin de la clase
