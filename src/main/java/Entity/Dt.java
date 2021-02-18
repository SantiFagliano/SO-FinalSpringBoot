package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "dt")
@PrimaryKeyJoinColumn(name = "persona")
public class Dt extends Persona {

    @Column(name = "club_dirigido")
    private String club_dirigido;

    @Column(name = "fecha_inicio_club")
    private LocalDate fecha_inicio_club;

    @Column(name = "fecha_fin_club")
    private LocalDate fecha_fin_club;

    public String getClub_dirigido() {
        return club_dirigido;
    }

    public void setClub_dirigido(String club_dirigido) {
        this.club_dirigido = club_dirigido;
    }

    public LocalDate getFecha_inicio_club() {
        return fecha_inicio_club;
    }

    public void setFecha_inicio_club(LocalDate fecha_inicio_club) {
        this.fecha_inicio_club = fecha_inicio_club;
    }

    public LocalDate getFecha_fin_club() {
        return fecha_fin_club;
    }

    public void setFecha_fin_club(LocalDate fecha_fin_club) {
        this.fecha_fin_club = fecha_fin_club;
    }

    @Override
    public String toString() {
        return "Dt{" +
                "club_dirigido='" + club_dirigido + '\'' +
                ", fecha_inicio_club=" + fecha_inicio_club +
                ", fecha_fin_club=" + fecha_fin_club +
                '}';
    }
}
