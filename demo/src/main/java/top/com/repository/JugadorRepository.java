package top.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import top.com.entidades.Jugador;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{
    
    List<Jugador> findTop10ByOrderByLevelDesc();

    List<Jugador> findTop10ByOrderByPowerDesc();
}
