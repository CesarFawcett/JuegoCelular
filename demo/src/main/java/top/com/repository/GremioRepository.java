package top.com.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import top.com.entidades.Gremio;

public interface GremioRepository extends JpaRepository<Gremio, Long> {

    @Query("SELECT g FROM Guild g JOIN g.members m GROUP BY g ORDER BY SUM(m.power) DESC")
    List<Gremio> findTop10GuildsByTotalPower();
} 
