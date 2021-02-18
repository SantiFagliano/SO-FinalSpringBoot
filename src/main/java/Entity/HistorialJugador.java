package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "historial_jugador")
public class HistorialJugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "posicion")
    @Enumerated(value = EnumType.STRING)
    private Posicion posicion;
    @Column(name = "fecha_inicio")
    private LocalDate fecha_inicio;
    @Column(name = "fecha_fin")
    private LocalDate fecha_fin;
    
    @OneToOne
    @JoinColumn(name = "id_jugador", referencedColumnName = "id")
    private Jugador jugador;
    @OneToOne
    @JoinColumn(name = "id_equipo", referencedColumnName = "id")
    private Equipo equipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "HistorialJugador{" +
                "id=" + id +
                ", posicion=" + posicion +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                ", jugador=" + jugador +
                ", equipo=" + equipo +
                '}';
    }
}
