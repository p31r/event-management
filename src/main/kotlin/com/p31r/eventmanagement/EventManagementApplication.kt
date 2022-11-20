package com.p31r.eventmanagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EventManagementApplication

fun main(args: Array<String>) {
    runApplication<EventManagementApplication>(*args)
}
