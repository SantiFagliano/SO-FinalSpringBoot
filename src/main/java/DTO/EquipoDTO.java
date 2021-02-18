package DTO;

import java.time.LocalDate;

public class EquipoDTO implements Comparable<EquipoDTO> {
    private Integer cuit;
    private String nombre;
    private LocalDate fecha_fundacion;
    private String nombre_presidente;
    private String apellido_presidente;
    private Integer id_direccion;
    private Integer telefono;
    private String email;
    private String categoria_actual;
    private Integer id_dt;
    private LocalDate fecha_inicio_primera_division;
    private LocalDate fecha_fin_primera_division;

    @Override
    public String toString() {
        return "EquipoDTO{" +
                "cuit=" + cuit +
                ", nombre='" + nombre + '\'' +
                ", fecha_fundacion=" + fecha_fundacion +
                ", nombre_presidente='" + nombre_presidente + '\'' +
                ", apellido_presidente='" + apellido_presidente + '\'' +
                ", id_direccion=" + id_direccion +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                ", categoria_actual='" + categoria_actual + '\'' +
                ", dni_dt=" + id_dt +
                ", fecha_inicio_primera_division=" + fecha_inicio_primera_division +
                ", fecha_fin_primera_division=" + fecha_fin_primera_division +
                '}';
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

    public Integer getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Integer id_direccion) {
        this.id_direccion = id_direccion;
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

    public Integer getId_dt() {
        return id_dt;
    }

    public void setId_dt(Integer id_dt) {
        this.id_dt = id_dt;
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

    @Override
    public int compareTo(EquipoDTO o) {
        return this.nombre.compareTo(o.getNombre());
    }

}
