package com.naceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naceproject.model.Nace;

@Repository
public interface NACERepository extends JpaRepository<Nace, Integer>{
}
