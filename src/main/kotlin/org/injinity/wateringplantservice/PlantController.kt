package org.injinity.wateringplantservice

import org.springframework.web.bind.annotation.*


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("plant")
class PlantController(val plantService: PlantService) {

    @GetMapping("{id}")
    fun getPlantById(@PathVariable id: Long): PlantEntity {
        return plantService.getPlantById(id)
    }
   @GetMapping("")
   fun getAllPlants(): List<PlantEntity> {
       return plantService.getAllPlants()
   }

   @PatchMapping("")
   fun patchPlant(@RequestBody updates: PlantDto){
       this.plantService.patchPlant(updates)
   }
}