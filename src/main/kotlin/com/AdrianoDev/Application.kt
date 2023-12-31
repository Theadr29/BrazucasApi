package com.AdrianoDev

import com.AdrianoDev.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = "PORT".toInt(), host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSockets()
    configureMonitoring()
    configureSerialization()
    configureRouting()
}
