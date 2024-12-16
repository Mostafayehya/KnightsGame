package KnightGame

import org.example.KnightGame.Knight
import org.example.KnightGame.startGame
import org.junit.jupiter.api.Test
import kotlin.reflect.KParameter
import kotlin.test.assertEquals

class GameKtTest{

  @Test
  fun singleKnightGame(){
   val knights = mutableListOf<Knight>(Knight("k2",100))
   startGame(knights, mutableListOf())
  }

    @Test
    fun knightk6shouldWin(){
        val knights = mutableListOf(
            Knight("k1",100),
            Knight("k2",100),
            Knight("k3",100),
            Knight("k4",100),
            Knight("k5",100),
            Knight("k6",100),
            )

        val deadKnights = mutableListOf<Knight>(
            Knight("k1",0),
            Knight("k2",0),
            Knight("k3",0),
            Knight("k4",0),
            Knight("k5",0),
            )
        assertEquals("k6", startGame(knights, deadKnights).name)
    }

 }
