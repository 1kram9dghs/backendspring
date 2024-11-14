package com.akram.livres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akram.livres.entities.Image;

public interface ImageRepository extends JpaRepository<Image , Long>{

}
