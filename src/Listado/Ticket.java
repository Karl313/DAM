package Listado;

import static Listado.Alumno.sacarId;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CFGS
 */
public class Ticket {

    int ID;
    String nombre = "";
    String apellido = "";
    double nota;

    public static void main(String[] args) {

        Alumno listado1 = new Alumno();
        listado1.setId(Alumno.sacarId());
        listado1.setApellido("Bañon");
        listado1.setNombre("Frank");
        listado1.setNota((int) Alumno.sacarNota());

        Alumno listado2 = new Alumno();
        listado2.setId(Alumno.sacarId());
        listado2.setApellido("Bermejo");
        listado2.setNombre("Carlos");
        listado2.setNota((int) Alumno.sacarNota());

        Alumno listado3 = new Alumno();
        listado3.setId(Alumno.sacarId());
        listado3.setApellido("Caceres");
        listado3.setNombre("Diego");
        listado3.setNota((int) Alumno.sacarNota());

        Alumno listado5 = new Alumno();
        listado5.setId(Alumno.sacarId());
        listado5.setApellido("Caja");
        listado5.setNombre("Victor");
        listado5.setNota((int) Alumno.sacarNota());

        Alumno listado6 = new Alumno();
        listado6.setId(Alumno.sacarId());
        listado6.setApellido("Carabut");
        listado6.setNombre("Constantin");
        listado6.setNota((int) Alumno.sacarNota());

        Alumno listado7 = new Alumno();
        listado7.setId(Alumno.sacarId());
        listado7.setApellido("De Pablo");
        listado7.setNombre("Victor Manuel");
        listado7.setNota((int) Alumno.sacarNota());

        Alumno listado8 = new Alumno();
        listado8.setId(Alumno.sacarId());
        listado8.setApellido("Gonzalez");
        listado8.setNombre("Jorge");
        listado8.setNota((int) Alumno.sacarNota());

        Alumno listado9 = new Alumno();
        listado9.setId(Alumno.sacarId());
        listado9.setApellido("Gutierrez");
        listado9.setNombre("Sergio");
        listado9.setNota((int) Alumno.sacarNota());

        var listado10 = new Alumno();
        listado10.setId(Alumno.sacarId());
        listado10.setApellido("Martin");
        listado10.setNombre("Miguel Angel");
        listado10.setNota((int) Alumno.sacarNota());

        Alumno listado11 = new Alumno();
        listado11.setId(Alumno.sacarId());
        listado11.setApellido("Plaza");
        listado11.setNombre("Alejandro");
        listado11.setNota((int) Alumno.sacarNota());

        Alumno listado12 = new Alumno();
        listado12.setId(Alumno.sacarId());
        listado12.setApellido("Rosa");
        listado12.setNombre("Eizan");
        listado12.setNota((int) Alumno.sacarNota());

        Alumno listado13 = new Alumno();
        listado13.setId(Alumno.sacarId());
        listado13.setApellido("Vidal");
        listado13.setNombre("Pedro Enrique");
        listado13.setNota((int) Alumno.sacarNota());

        String nombre = "Nombre";
        String Apellido = "Apellido";
        String id = "ID";
        String nota = "Nota";
        System.out.printf("%s\t %25s %25s %10s\n", "ID", "Apellido", "Nombre", "Nota ");
        System.out.println("----------------------------------------------------------------------------");
        //for(int i=0;i<13;i++);
        List<Alumno> lista = new ArrayList<>();
        
        for (int i = 0; i < lista.size(); i++) {
            
            System.out.println(lista.get(i));
        }

        System.out.printf("%d\t %25s %25s %15f", listado1.id, listado1.apellido, listado1.nombre, listado1.nota);

    }
}//fin del main

