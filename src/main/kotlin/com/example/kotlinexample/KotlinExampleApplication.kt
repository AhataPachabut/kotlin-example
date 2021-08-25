package com.example.kotlinexample

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinExampleApplication

fun main(args: Array<String>) {
	runApplication<KotlinExampleApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}
