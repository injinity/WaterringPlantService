package org.injinity.wateringplantservice

import jakarta.persistence.*
import java.sql.Date

@Entity
@Table(name="PLANTS", schema = "PUBLIC")
data class PlantEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        var name: String,
        var location: String,
        var photo: String,
        var watered: Boolean,
        @Column(name = "WATERED_DATE")
        var wateredDate: Date,
        @Column(name = "DAYS_BETWEEN_HYDRATE")
        var daysBetweenHydrate: Long
)
