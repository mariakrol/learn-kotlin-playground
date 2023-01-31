package com.makrol.teamcity.utilities.helpers

import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlin.reflect.full.isSubtypeOf
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.starProjectedType
import kotlin.reflect.jvm.isAccessible

inline fun <reified TPropertyType, reified TAnnotationType> KClass<out Any>.getAnnotatedProperties(): List<KProperty1<out Any, *>> {
    return this
        .getProperties<TPropertyType>()
        .filter { it.annotations.any { annotation -> annotation is TAnnotationType } }
}

inline fun <reified TPropertyType> Any.getPropertyValues(assignableType: KClass<out Any>): List<TPropertyType> {
    return assignableType
        .getProperties<TPropertyType>()
        .map { it.getPropertyValue(this) }
}

inline fun <reified TPropertyType> KClass<out Any>.getProperties(): List<KProperty1<out Any, *>> {
    return this.memberProperties
        .filter { it.returnType.isSubtypeOf(TPropertyType::class.starProjectedType) }
}

inline fun <reified TPropertyType> KProperty1<out Any, *>.getPropertyValue(propertyHolder: Any): TPropertyType {
    this.let {
        it.isAccessible = true
        return it.getter.call(propertyHolder) as TPropertyType
    }
}