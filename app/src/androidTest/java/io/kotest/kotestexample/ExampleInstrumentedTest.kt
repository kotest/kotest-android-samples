package io.kotest.kotestexample

import androidx.test.core.app.launchActivity
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.android.synthetic.main.activity_main.*

class ExampleInstrumentedTest : FunSpec({
    
    test("Hello, Tests!") {
        val scenario = launchActivity<MainActivity>()
        scenario.onActivity { 
            it.tv.text shouldBe "Dummy!"
        }
    }
    
})
