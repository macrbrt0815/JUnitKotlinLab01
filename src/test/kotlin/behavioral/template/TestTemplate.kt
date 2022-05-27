package behavioral.template

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestTemplate {
    private val cricket: Game = Cricket()
    private val football: Game = Football()

    @Test
    fun testTemplateCricketNotNull() {
        assertNotNull(cricket.play())
    }

    @Test
    fun testTemplateFootballNotNull() {
        assertNotNull(football.play())
    }

    @Test
    fun testCricketInitializeMessage(){
        assertEquals("Cricket game initialized! Start playing", cricket.initialize())
    }

    @Test
    fun testCricketInitializeWrongMessage(){
        assertNotEquals("Football game initialized! Start playing", cricket.initialize())
    }

    @Test
    fun testCricketGameStarted(){
        assertEquals("Cricket game started!", cricket.startPlay())
    }

    @Test
    fun testCricketGameStartedWrongMessage(){
        assertNotEquals("Football game started!", cricket.startPlay())
    }

    @Test
    fun testFootballGameStarted(){
        assertEquals("Football game started!", football.startPlay())
    }

    @Test
    fun testFootballGameStartedWrongMessage(){
        assertNotEquals("Cricket game started!", football.startPlay())
    }
    @Test
    fun testFootballInitializeMessage(){
        assertEquals("Football game initialized! Start playing", football.initialize())
    }

    @Test
    fun testFootballInitializeWrongMessage(){
        assertNotEquals("Cricket game initialized! Start playing", football.initialize())
    }
}