package br.com.dev.asa.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dev.asa.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
