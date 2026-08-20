package com.nazaburo.cmpwebdeploysample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform