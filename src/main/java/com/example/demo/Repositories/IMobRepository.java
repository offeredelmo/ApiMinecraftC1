package com.example.demo.Repositories;

import com.example.demo.Entities.Mob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMobRepository extends JpaRepository<Mob, Long> {
    List<Mob> findAll();
    Mob findAllById(int id);
    Mob save(Mob mod);
    @Override
    void delete(Mob mob);

    Mob findById(int id);
}
