package org.ks.kotlin.samples.base.syntax


trait Routable {
    val routingKey: String
}

trait DtoHolder<out T> {
    val dto: T
//    var mutableDto: T
}

abstract class Command<T>(override var dto: T) : Routable, DtoHolder<T> {
}

open class CreateWorkflowCommand(var workflow: WorkflowDto? = null): Command<WorkflowDto>(workflow!!) {
    override val routingKey: String
        get() = "workflow.command"
}

class CreateDefaultWorkflowCommand(): CreateWorkflowCommand(WorkflowDto(-1L, listOf(), listOf())) {
}

internal fun CreateWorkflowCommand.printToConsole(): Unit {
    println(this)
}

data class WorkflowDto(var id: Long,
                       var modules: Iterable<ModuleDto>,
                       var connections: Iterable<ConnectionDto>)

data class ModuleDto {}

data class ConnectionDto {}