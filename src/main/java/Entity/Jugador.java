package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "jugador")
@PrimaryKeyJoinColumn(name = "persona")
public class Jugador extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "fecha_nacimiento",nullable = false )
    private LocalDate fecha_nacimiento;
    @Column(name = "fecha_retiro")
    private LocalDate fecha_retiro;
    @Column(name = "fecha_debut")
    private LocalDate fecha_debut;
    @Column(name = "partidos_jugados")
    private Integer partidos_jugados;
    @Column(name = "goles")
    private Integer goles;
    @Column(name = "peso")
    private Integer peso;
    @Column(name = "altura")
    private Integer altura;
    @Column(name = "posicion")
    @Enumerated(value = EnumType.STRING)
    private Posicion posicion;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public LocalDate getFecha_retiro() {
        return fecha_retiro;
    }

    public void setFecha_retiro(LocalDate fecha_retiro) {
        this.fecha_retiro = fecha_retiro;
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

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", fecha_retiro=" + fecha_retiro +
                ", fecha_debut=" + fecha_debut +
                ", partidos_jugados=" + partidos_jugados +
                ", goles=" + goles +
                ", peso=" + peso +
                ", altura=" + altura +
                ", posicion=" + posicion +
                '}';
    }
}
