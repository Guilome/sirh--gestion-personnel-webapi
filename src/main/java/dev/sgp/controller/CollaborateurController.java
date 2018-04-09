/**
 * 
 */
package dev.sgp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import dev.sgp.entite.Collaborateurs;
import dev.sgp.repository.CollaborateurRepository;

/**
 * @author GOBERT Guillaume
 *
 */
public class CollaborateurController {

	@Autowired
	CollaborateurRepository collaborateurRepo;

	@GetMapping
	public List<Collaborateurs> CollaborateursList() {
		return this.collaborateurRepo.findAll();
	}

	@GetMapping
	public List<Collaborateurs> CollaborateursByDepartement(Integer idDepartement) {
		return this.collaborateurRepo.findCollaborateursByDepartement(idDepartement);
	}

	public Collaborateurs GetCollaborateur(String matricule) {
		return this.collaborateurRepo.findCollaborateurByMatricule(matricule);
	}
}
