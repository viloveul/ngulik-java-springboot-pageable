package com.example.viloveul.ngulik;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Fajrul Akbar Zuhdi 2021-07-21
 */
@Repository
public interface ArtikelRepository extends JpaRepository<Artikel, Long> {
}
