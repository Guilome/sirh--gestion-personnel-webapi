/**
 * 
 */
package dev.sgp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sgp.entite.Departements;

/**
 * @author GOBERT Guillaume
 *
 */
public interface DepartementRepository extends JpaRepository<Departements, Integer> {

}
