package org.ks.kotlin.samples.base.syntax

import org.junit.Test
import org.ks.kotlinfluentassertions.core.should

public class CommandTest {

    Test
    fun hasWorkflowDto() {
        val w = WorkflowDto(1L, listOf<ModuleDto>(), listOf<ConnectionDto>())
        val command = CreateWorkflowCommand(w)

        command.dto.should().be(w)
    }

    Test
    fun dataClassCanBeCopied() {
        val w = WorkflowDto(1L, listOf<ModuleDto>(), listOf<ConnectionDto>())

        println(w)

        val w2 = w.copy(w.id, w.modules, w.connections)

        println(w2)

        w.should().be(w2)
        w.equals(w2).should().be(true)
        w.equals(w2).should().beTruthy()
    }

    Test
    fun dataClassCanBeUsedToMultiDeclarations() {
        val w = WorkflowDto(1L, listOf<ModuleDto>(), listOf<ConnectionDto>())

        val (id, modules, connections) = w

        id.should().be(1L)
        modules.count().should().be(0)
        connections.count().should().be(0)

        val (id2) = w
        id2.should().be(1L)
    }

    Test
    fun extensionPrintsToConsole() {
        val w = WorkflowDto(1L, listOf<ModuleDto>(), listOf<ConnectionDto>())

        CreateWorkflowCommand(w)
            .printToConsole()
    }
}
