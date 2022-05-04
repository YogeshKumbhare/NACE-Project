package net.guides.springboot2.springboot2jpacrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.model.Nace;

import java.util.Optional;

@Repository
public interface NACERepository extends JpaRepository<Nace, Integer>{
}
