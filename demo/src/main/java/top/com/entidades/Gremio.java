package top.com.entidades;

import java.util.List;

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
public class Gremio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String guildName;

    @OneToMany(mappedBy = "guild")
    private List<Jugador> members;
}
