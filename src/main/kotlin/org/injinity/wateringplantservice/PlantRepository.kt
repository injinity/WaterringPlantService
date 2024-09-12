package org.injinity.wateringplantservice

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PlantRepository: JpaRepository<PlantEntity, Long> {
    @Query(value = "select p.id, p.name, p.location, null as photo, p.watered_date, p.days_between_hydrate FROM plants p", nativeQuery = true)
    fun findAllWithoutImage(): List<PlantEntity>
}