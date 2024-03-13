package com.gcost4.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcost4.hrworker.entities.Worker;



public interface WorkerRepository extends JpaRepository<Worker, Long> {

}