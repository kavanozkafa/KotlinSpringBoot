package com.example.kotlinspringboot.controller

import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class Controller() {

    companion object : KLogging()
    @GetMapping("/hello")
    fun retrieveGreeting(): String {
        return "hello"
    }
}