package top.com.entidades;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "JugadorTop")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Jugador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String playerName;
    private int level;
    private int power;
    private String server; 

    @ManyToOne
    @JoinColumn(name = "guild_id")
    private Gremio guild;
}
