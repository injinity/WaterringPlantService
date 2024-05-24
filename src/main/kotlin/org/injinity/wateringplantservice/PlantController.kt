package org.injinity.wateringplantservice

import org.springframework.web.bind.annotation.*


@RestController
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE])
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

   @PutMapping("")
   fun patchPlant(@RequestBody updates: PlantDto){
       this.plantService.putPlant(updates)
   }
}