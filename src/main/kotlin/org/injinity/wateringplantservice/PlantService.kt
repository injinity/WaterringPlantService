package org.injinity.wateringplantservice

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class PlantService (val plantRepository: PlantRepository) {
    fun getPlantById(id: Long): PlantEntity{
        return plantRepository.findById(id).orElseThrow{ ResponseStatusException(HttpStatus.NOT_FOUND) }
    }
}