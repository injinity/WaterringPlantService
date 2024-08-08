package org.injinity.wateringplantservice

import jakarta.persistence.*
import java.sql.Date

@Entity
@Table(name="PLANTS", schema = "PUBLIC")
data class PlantEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        @Column(name = "NAME")
        var name: String,
        @Column(name = "LOCATION")
        var location: String,
        @Lob
        @Column(name = "PHOTO", columnDefinition = "BLOB", nullable = true)
        var photo: ByteArray? = null,
        @Column(name = "WATERED_DATE")
        var wateredDate: Date,
        @Column(name = "DAYS_BETWEEN_HYDRATE")
        var daysBetweenHydrate: Long
){
        constructor(): this(
                -1, "", "", null, Date(0), -1
        )
}
