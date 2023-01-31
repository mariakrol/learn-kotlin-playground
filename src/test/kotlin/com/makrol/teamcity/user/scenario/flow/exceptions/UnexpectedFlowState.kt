package com.makrol.teamcity.user.scenario.flow.exceptions

class UnexpectedFlowState : RuntimeException {
    constructor() : super()
    constructor(message: String) : super(message)
    constructor(message: String, innerException: Exception) : super(message, innerException)
}