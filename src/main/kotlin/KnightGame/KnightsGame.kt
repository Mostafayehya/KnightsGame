import org.example.KnightGame.Knight
import kotlin.random.Random

fun main() {
    val knights = mutableListOf(
        Knight("K1"),
        Knight("K2"),
        Knight("K3"),
        Knight("K4"),
        Knight("K5"),
        Knight("K6")
    )
    val random = Random(System.currentTimeMillis())
    while (knights.size > 1) {
        val roundActions = mutableListOf<String>()

        for (i in knights.indices) {
            val victimIndex = (i + 1) % knights.size
            val victim = knights[victimIndex]

            val damage = random.nextInt(1, 7)
            victim.health -= damage
            roundActions.add("${knights[i]} hits ${victim.name} by $damage damage points")
        }

        for (action in roundActions) {
            println(action)
        }
        
        for (i in knights.size - 1 downTo 0) {
            if (knights[i].health < 1) {
                println("${knights[i].name} Dies")
                knights.removeAt(i)
            }
        }

        if (knights.size > 1) {
            println("-----")
        }
    }

    if (knights.size == 1) {
        println("${knights[0].name} wins the game")
    } else {
        println("No knight survived!")
    }
}
