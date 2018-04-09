/**
 * 
 */
package dev.sgp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sgp.entite.Collaborateurs;

/**
 * @author GOBERT Guillaume
 *
 */
public interface CollaborateurRepository extends JpaRepository<Collaborateurs, Integer> {

	List<Collaborateurs> findCollaborateursByDepartement(Integer idDepartement);

	Collaborateurs findCollaborateurByMatricule(String matricule);
}
