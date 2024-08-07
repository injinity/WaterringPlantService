package org.injinity.wateringplantservice

import java.sql.Date

data class PlantRequest(
        var id: Long = 0,
        var name: String? = null,
        var location: String? = null,
        var photo: String? = null,
        var wateredDate: Date? = null,
        var daysBetweenHydrate: Long? = null
)