package com.ashish.kotlindemo

import org.springframework.data.repository.CrudRepository

interface AircraftRepository :CrudRepository<Aircraft.Aircraft,String>