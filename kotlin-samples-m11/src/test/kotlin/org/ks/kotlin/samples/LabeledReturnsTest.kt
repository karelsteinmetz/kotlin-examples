package org.ks.kotlin.samples

import org.junit.Test
import org.ks.kotlinfluentassertions.core.should

public class LabeledReturnsTest {

    Test
    fun labelForMapExpressionIsImplicit() {
        val listOfInts = listOf(1, -10, 100, -1000)

        val listOfStrings = listOfInts.map { i ->
            if (i < 0)
                return@map -1
            //...
            i * 2
        }

        listOfStrings[0].should().be(2)
        listOfStrings[1].should().be(-1)
        listOfStrings[2].should().be(200)
        listOfStrings[3].should().be(-1)
    }

    Test
    fun canReturnOnOuterFunction() {
        class Vertex(var neighbors: Iterable<Vertex> = listOf()) {
        }

        val f =
                fun reachable(from: Vertex, to: Vertex): Boolean {
                    val visited = hashSetOf<Vertex>()
                    fun dfs(current: Vertex) {
                        // here we return from the outer function:
                        //if (current == to) return@reachable true
                        // And here -- from local function:
                        if (!visited.add(current)) return
                        for (v in current.neighbors)
                            dfs(v)
                    }

                    dfs(from)
                    return false // if dfs() did not return true already
                }

        f(Vertex(), Vertex())
                .should().beFalsy()

    }
}