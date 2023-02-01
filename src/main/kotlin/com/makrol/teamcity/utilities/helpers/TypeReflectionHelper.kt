package com.makrol.teamcity.utilities.helpers

import kotlin.reflect.full.isSupertypeOf
import kotlin.reflect.full.starProjectedType

inline fun <reified TObjectType> constructByParameterlessCtor(): TObjectType {
    val primaryConstructor = TObjectType::class.constructors.firstOrNull { it.parameters.isEmpty() }

    return primaryConstructor?.call() ?: throw IllegalArgumentException(
        "Cannot create object of type ${TObjectType::class} , no parameterless constructor found"
    )
}

inline fun <reified TObject, reified TParameter> createObjectWithParameter(parameter: TParameter): TObject {
    val singleParamCtor = TObject::class.constructors
        .filter { it.parameters.size == 1 }
        .firstOrNull { it.parameters.first().type.isSupertypeOf(TParameter::class.starProjectedType) }

    return singleParamCtor?.call(parameter)
        ?: throw RuntimeException("Cannot create object ${TObject::class}")
}