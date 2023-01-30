package com.makrol.teamcity.utilities

inline fun <reified TObject> constructByParameterlessCtor(): TObject {
    val primaryConstructor = TObject::class.constructors.find { it.parameters.isEmpty() }
    return primaryConstructor?.call()
        ?: throw RuntimeException("Cannot create object ${TObject::class}")
}