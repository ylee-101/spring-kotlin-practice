package com.test.ylee.KotlinSpringPractice

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import com.test.ylee.KotlinSpringPractice.TestRequest
import com.test.ylee.KotlinSpringPractice.TestResponse
import com.test.ylee.KotlinSpringPractice.TestService



@RestController
class TestController(
    val testService : TestService
) {

    @GetMapping("/hello")
    fun hello(): String {
        return testService.getHello()
    }

    @GetMapping("/lists")
    fun getList(): List<TestResponse> {
        return testService.getTestList()
    }

    @PostMapping("/giveme")
    fun giveme(): String {
        return "GIVE ME THE MONEY"
    }

    @PostMapping("/lists")
    fun addTest(@RequestBody request: TestRequest): ResponseEntity<TestResponse> {
        val created = testService.addTest(request)
        return ResponseEntity.status(HttpStatus.CREATED).body(created)
    }
}