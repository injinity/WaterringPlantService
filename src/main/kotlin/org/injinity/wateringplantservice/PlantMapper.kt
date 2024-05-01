package org.injinity.wateringplantservice

class PlantMapper{
    fun plantDtoToEntity(dto: PlantDto, entity: PlantEntity){
        dto.name?.let { entity.name = it }
        dto.location?.let { entity.location = it }
        dto.photo?.let { entity.photo = it }
        dto.waterred?.let { entity.waterred = it }
        dto.waterredDate?.let { entity.waterredDate = it }
    }
}