package DTO;

import Entity.Posicion;

import java.time.LocalDate;

public class HistorialJugadorDTO {
    private Integer id_equipo;
    private Posicion posicion;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Integer id_jugador;


    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Integer getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(Integer id_equipo) {
        this.id_equipo = id_equipo;
    }

    public Integer getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(Integer id_jugador) {
        this.id_jugador = id_jugador;
    }

    @Override
    public String toString() {
        return "HistorialJugador{" +
                "cuit_equipo=" + id_equipo +
                ", posicion=" + posicion +
                ", fechaInicio=" + fecha_inicio +
                ", fechaFin=" + fecha_fin +
                ", dni_jugador=" + id_jugador +
                '}';
    }

}
