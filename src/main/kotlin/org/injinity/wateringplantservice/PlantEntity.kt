package org.injinity.wateringplantservice

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Date

@Entity
@Table(name="PLANTS")
data class PlantEntity(
        @Id
        val id: Int,
        val name: String,
        val location: String,
        val photo: String,
        val waterred: Boolean,
        val waterredDate: Date
)
