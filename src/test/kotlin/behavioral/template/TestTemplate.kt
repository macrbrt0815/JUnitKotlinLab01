package behavioral.template

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestTemplate {
    @Test
    fun testTemplateCricketWorking() {
        val cricket: Game = Cricket()
        Assertions.assertNotNull(cricket.play())
    }

    @Test
    fun testTemplateFootballWorking() {
        val football: Game = Football()
        Assertions.assertNotNull(football.play())
    }

    @Test
    fun testCricketInitializeMessage(){
        val cricket = Cricket()
        Assertions.assertEquals("Cricket game initialized! Start playing", cricket.initialize())
    }

    @Test
    fun testCricketInitializeWrongMessage(){
        val cricket = Cricket()
        Assertions.assertNotEquals("Football game initialized! Start playing", cricket.initialize())
    }
}