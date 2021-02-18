package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "equipo")
public class Equipo implements Comparable<Equipo> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "cuit", nullable = false)
    private Integer cuit;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "fecha_fundacion")
    private LocalDate fecha_fundacion;
    @Column(name = "nombre_presidente")
    private String nombre_presidente;
    @Column(name = "apellido_presidente")
    private String apellido_presidente;
    @Column(name = "telefono")
    private Integer telefono;
    @Column(name = "email")
    private String email;
    @Column(name = "categoria_actual")
    private String categoria_actual;
    @Column(name = "fecha_inicio_primera_division")
    private LocalDate fecha_inicio_primera_division;
    @Column(name = "fecha_fin_primera_division")
    private LocalDate fecha_fin_primera_division;

    @OneToOne
    @JoinColumn(name = "id_dt", referencedColumnName = "id")
    private Dt dt;
    @OneToOne
    @JoinColumn(name = "id_direccion", referencedColumnName = "id")
    private Direccion direccion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(LocalDate fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }

    public String getNombre_presidente() {
        return nombre_presidente;
    }

    public void setNombre_presidente(String nombre_presidente) {
        this.nombre_presidente = nombre_presidente;
    }

    public String getApellido_presidente() {
        return apellido_presidente;
    }

    public void setApellido_presidente(String apellido_presidente) {
        this.apellido_presidente = apellido_presidente;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoria_actual() {
        return categoria_actual;
    }

    public void setCategoria_actual(String categoria_actual) {
        this.categoria_actual = categoria_actual;
    }

    public LocalDate getFecha_inicio_primera_division() {
        return fecha_inicio_primera_division;
    }

    public void setFecha_inicio_primera_division(LocalDate fecha_inicio_primera_division) {
        this.fecha_inicio_primera_division = fecha_inicio_primera_division;
    }

    public LocalDate getFecha_fin_primera_division() {
        return fecha_fin_primera_division;
    }

    public void setFecha_fin_primera_division(LocalDate fecha_fin_primera_division) {
        this.fecha_fin_primera_division = fecha_fin_primera_division;
    }

    public Dt getDt() {
        return dt;
    }

    public void setDt(Dt dt) {
        this.dt = dt;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", cuit=" + cuit +
                ", nombre='" + nombre + '\'' +
                ", fecha_fundacion=" + fecha_fundacion +
                ", nombre_presidente='" + nombre_presidente + '\'' +
                ", apellido_presidente='" + apellido_presidente + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                ", categoria_actual='" + categoria_actual + '\'' +
                ", fecha_inicio_primera_division=" + fecha_inicio_primera_division +
                ", fecha_fin_primera_division=" + fecha_fin_primera_division +
                ", dt=" + dt +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public int compareTo(Equipo o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
