package com.example

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.plugins.calllogging.*
import org.slf4j.event.Level

fun Application.configureRouting() {

    install(CallLogging) {
        level = Level.INFO
    }
    routing {
        get("/") {
            call.respondText("Hello, World!")
        }
    }
}