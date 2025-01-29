package com.spring_app.apirestful.RestController;

import com.spring_app.apirestful.Entidad.Alumno;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class AlumnoControlador {
    private List<Alumno> alumnos;

    public AlumnoControlador() {
        alumnos = new ArrayList<>();
        alumnos.add(new Alumno(1, "Wilmer", "Guayaquil", 29));
        alumnos.add(new Alumno(2, "Gabriel", "Tena", 30));
        alumnos.add(new Alumno(3, "Romina", "Guayaquil", 30));
    }

    //METODO GET
    @GetMapping("/api/alumnos")
    public  List<Alumno> listarilbros(){
        return alumnos;
    }


    //METODO GET pero por ID
    @GetMapping("/api/alumnos/{id}")
    public Alumno ListarAlumno(@PathVariable int id){
        for(Alumno alumno: alumnos){
           if (alumno.getId()==id){
               return alumno;
           }
        }
        return null;
    }

    //METODO POST
    @PostMapping("/alumnos")
    public Alumno crearAlumno(@RequestBody Alumno alumno){
        alumno.setId(alumnos.size()+1);
        alumnos.add(alumno);
        return alumno;
    }

    //METODO PUT
    @PutMapping("/alumnos/{id}")
    public Alumno actualizarAlumno(@PathVariable int id, @RequestBody Alumno alumno){
        for(Alumno alumnoExistente: alumnos){
            if(alumnoExistente.getId()==id){
                alumnoExistente.setNombre(alumno.getNombre());
                alumnoExistente.setNombre(alumno.getNombre());
                alumnoExistente.setCiudad(alumno.getCiudad());
                alumnoExistente.setEdad(alumno.getEdad());
                return alumnoExistente;
            }
        }
        return null;
    }

    @DeleteMapping("/alumnos/{id}")
    public void eliminarAlumno(@PathVariable int id){
        for(Alumno alumno:alumnos){
            if(alumno.getId()==id){
                alumnos.remove(alumno);
                break;
            }
        }
    }
}



