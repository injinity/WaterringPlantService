package org.injinity.wateringplantservice

import java.sql.Date

data class PlantDto(
        var id: Long = 0,
        var name: String? = null,
        var location: String? = null,
        var photo: String? = null,
        var watered: Boolean? = null,
        var wateredDate: Date? = null
)