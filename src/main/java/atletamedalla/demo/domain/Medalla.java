package atletamedalla.demo.domain;


import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Medalla {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String enumeracion;
    private String especialidad;
    private String competicion;

    @ManyToOne
    private Atleta atleta;




    public Medalla() {
    }


    public Medalla(String enumeracion, String especialidad, String competicion) {
        this.enumeracion = enumeracion;
        this.especialidad = especialidad;
        this.competicion = competicion;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnumeracion() {
        return enumeracion;
    }

    public void setEnumeracion(String enumeracion) {
                this.enumeracion = enumeracion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medalla medalla = (Medalla) o;

        if (id != null ? !id.equals(medalla.id) : medalla.id != null) return false;
        if (enumeracion != null ? !enumeracion.equals(medalla.enumeracion) : medalla.enumeracion != null) return false;
        if (especialidad != null ? !especialidad.equals(medalla.especialidad) : medalla.especialidad != null)
            return false;
        return competicion != null ? competicion.equals(medalla.competicion) : medalla.competicion == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (enumeracion != null ? enumeracion.hashCode() : 0);
        result = 31 * result + (especialidad != null ? especialidad.hashCode() : 0);
        result = 31 * result + (competicion != null ? competicion.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Medalla{" +
                "id=" + id +
                ", enumeracion='" + enumeracion + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", competicion='" + competicion + '\'' +
                '}';
    }
}
