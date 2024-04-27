package org.injinity.wateringplantservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("plant")
class PlantController(val plantService: PlantService) {

    @GetMapping("{id}")
    fun getPlantById(@PathVariable id: Long): PlantEntity {
        return plantService.getPlantById(id)
    }
}