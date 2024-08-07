package org.injinity.wateringplantservice

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class PlantService (val plantRepository: PlantRepository) {
    val plantMapper: PlantMapper = PlantMapper()
    fun getPlantById(id: Long): PlantRequest{
        return plantMapper.plantEntityToRequest(plantRepository.findById(id).orElseThrow{ ResponseStatusException(HttpStatus.NOT_FOUND) })
    }

    fun getAllPlants(): List<PlantRequest>{
        return plantRepository.findAll().map { plantMapper.plantEntityToRequest(it) }
    }

    fun putPlant(request: PlantRequest){
        var plantEntity = plantRepository.findById(request.id).orElseThrow{ ResponseStatusException(HttpStatus.NOT_FOUND) }
        plantMapper.plantRequestToEntity(request, plantEntity)
        plantRepository.save(plantEntity)
    }

    fun postPlant(plant: PlantRequest) {
        var entity = plantMapper.plantRequestToEntity(plant)
        plantRepository.save(entity)
    }
}