package io.kotest.kotestexample

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ExampleUnitTest : FunSpec({
    test("foo") {
        1 + 2 shouldBe 3
    }
})
