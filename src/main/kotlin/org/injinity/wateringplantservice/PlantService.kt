package org.injinity.wateringplantservice

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class PlantService (val plantRepository: PlantRepository) {
    val plantMapper: PlantMapper = PlantMapper()
    fun getPlantById(id: Long): PlantEntity{
        return plantRepository.findById(id).orElseThrow{ ResponseStatusException(HttpStatus.NOT_FOUND) }
    }

    fun getAllPlants(): List<PlantEntity>{
        return plantRepository.findAll()
    }

    fun putPlant(dto: PlantRequest){
        var plantEntity = plantRepository.findById(dto.id).orElseThrow{ ResponseStatusException(HttpStatus.NOT_FOUND) }
        plantMapper.plantDtoToEntity(dto, plantEntity)
        plantRepository.save(plantEntity)
    }
}