package org.injinity.wateringplantservice

class PlantMapper{
    fun plantDtoToEntity(dto: PlantDto, entity: PlantEntity){
        dto.name?.let { entity.name = it }
        dto.location?.let { entity.location = it }
        dto.photo?.let { entity.photo = it }
        dto.watered?.let { entity.watered = it }
        dto.wateredDate?.let { entity.wateredDate = it }
    }
}