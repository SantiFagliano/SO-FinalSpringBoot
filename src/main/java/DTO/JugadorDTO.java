package DTO;

import Entity.Posicion;

import java.time.LocalDate;

public class JugadorDTO extends PersonaDTO {
    private LocalDate fecha_nacimiento;
    private LocalDate fecha_retiro;
    private LocalDate fecha_debut;
    private Integer partidos_jugados;
    private Integer goles;
    private Integer peso;
    private Integer altura;
    private Posicion posicion;

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public LocalDate getFecha_debut() {
        return fecha_debut;
    }

    public void setFecha_debut(LocalDate fecha_debut) {
        this.fecha_debut = fecha_debut;
    }

    public Integer getPartidos_jugados() {
        return partidos_jugados;
    }

    public void setPartidos_jugados(Integer partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }

    public Integer getGoles() {
        return goles;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public LocalDate getFecha_retiro() {
        return fecha_retiro;
    }

    public void setFecha_retiro(LocalDate fecha_retiro) {
        this.fecha_retiro = fecha_retiro;
    }

    @Override
    public String toString() {
        return super.toString() + "Jugador{" +
                "fechaNacimiento=" + fecha_nacimiento +
                ", fechaRetiro=" + fecha_retiro +
                ", fechaDebut=" + fecha_debut +
                ", partidosJugados=" + partidos_jugados +
                ", goles=" + goles +
                ", peso=" + peso +
                ", altura=" + altura +
                ", posicion=" + posicion +
                '}';
    }
}
