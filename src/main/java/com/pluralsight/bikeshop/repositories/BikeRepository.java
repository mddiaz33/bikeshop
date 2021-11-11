package com.pluralsight.bikeshop.repositories;

import com.pluralsight.bikeshop.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Long> {

}
