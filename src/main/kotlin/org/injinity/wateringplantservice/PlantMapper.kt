package org.injinity.wateringplantservice

import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

class PlantMapper{
    @OptIn(ExperimentalEncodingApi::class)
    fun plantRequestToEntity(request: PlantRequest, entity: PlantEntity = PlantEntity()): PlantEntity{
        request.name?.let { entity.name = it }
        request.location?.let { entity.location = it }
        request.photo?.let { entity.photo = Base64.decode(it.substringAfter(","), 0) }
        request.wateredDate?.let { entity.wateredDate = it }
        request.daysBetweenHydrate?.let {entity.daysBetweenHydrate = it}
        return entity
    }

    @OptIn(ExperimentalEncodingApi::class)
    fun plantEntityToRequest(entity: PlantEntity, request: PlantRequest = PlantRequest()): PlantRequest{
        entity.id.let { request.id  = it }
        entity.name.let { request.name = it }
        entity.location.let { request.location = it }
        entity.photo.let { request.photo = Base64.encode(it, 0) }
        entity.wateredDate.let { request.wateredDate = it }
        entity.daysBetweenHydrate.let {request.daysBetweenHydrate = it}
        return request
    }
}