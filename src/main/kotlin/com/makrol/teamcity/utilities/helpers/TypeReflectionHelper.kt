package com.makrol.teamcity.utilities.helpers

inline fun <reified TObjectType> constructByParameterlessCtor(): TObjectType {
    val primaryConstructor = TObjectType::class.constructors.firstOrNull { it.parameters.isEmpty() }

    return primaryConstructor?.call() ?: throw IllegalArgumentException(
        "Cannot create object of type ${TObjectType::class} , no parameterless constructor found"
    )
}