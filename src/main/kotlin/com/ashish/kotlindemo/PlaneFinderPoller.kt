package com.ashish.kotlindemo

import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.stereotype.Component

@Component
@EnableScheduling
class PlaneFinderPoller(private val repository: AircraftRepository) {
}