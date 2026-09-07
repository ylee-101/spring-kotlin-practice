package com.test.ylee.KotlinSpringPractice

import com.test.ylee.KotlinSpringPractice.TestResponse
import org.springframework.stereotype.Service


@Service
class TestService() {

    val mockList: List<TestResponse> = listOf(
        TestResponse(1, "아아", 1800),
        TestResponse(2, "뜨아", 1600),
        TestResponse(3, "라떼", 2000),
        TestResponse(4, "초코", 2500),
        TestResponse(5, "아티", 2200)
    )
    
    fun getHello(): String {
        return "Hello ylee"
    }

    fun getTestList(): List<TestResponse> {
        return mockList
    }

    fun getTestByIndex(idx: Int): TestResponse? {
        return mockList.getOrNull(idx)
    }
}