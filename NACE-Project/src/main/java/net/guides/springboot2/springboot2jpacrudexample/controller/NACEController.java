package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;
import net.guides.springboot2.springboot2jpacrudexample.model.Nace;
import net.guides.springboot2.springboot2jpacrudexample.repository.NACERepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class NACEController {
	@Autowired
	private NACERepository naceRepository;

	@GetMapping("/allOrders")
	public List<Nace> getAllEmployees() {
		return naceRepository.findAll();
	}

	@GetMapping("/orders/{id}")
	public ResponseEntity<Nace> getEmployeeById(@PathVariable(value = "id") int orderId)
			throws ResourceNotFoundException {
		Nace nace = naceRepository.findById(orderId).orElseThrow(() -> new ResourceNotFoundException("Orders not found for this id :: " + orderId));
		return ResponseEntity.ok().body(nace);
	}

	@PostMapping("/saveOrders")
	public Nace createNaceOrders(@Valid @RequestBody Nace nace) {
		return naceRepository.save(nace);
	}


}
