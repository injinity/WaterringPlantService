package org.injinity.wateringplantservice

import jakarta.persistence.*
import java.sql.Date

@Entity
@Table(name="PLANTS")
data class PlantEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        var name: String,
        var location: String,
        var photo: String,
        var waterred: Boolean,
        var waterredDate: Date
)
