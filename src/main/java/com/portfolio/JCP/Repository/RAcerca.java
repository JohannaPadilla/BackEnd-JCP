package com.portfolio.JCP.Repository;

import com.portfolio.JCP.Entity.Acerca;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAcerca extends JpaRepository<Acerca, Integer>{
    public Optional<Acerca> findByInfoA(String infoA);
    public boolean existsByInfoA(String infoA);
}
