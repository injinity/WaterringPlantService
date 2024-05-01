package org.injinity.wateringplantservice

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PlantRepository: JpaRepository<PlantEntity, Long> {


    fun findById(id: Int): PlantEntity
}