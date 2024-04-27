package org.injinity.wateringplantservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WaterringPlantServiceApplication

fun main(args: Array<String>) {
	runApplication<WaterringPlantServiceApplication>(*args)
}
