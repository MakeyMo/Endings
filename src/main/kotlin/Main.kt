import kotlin.random.Random

fun main() {

    var likes: Int = (0..1000).random()

    fun endingCheck(likes: Int): String {
        if (likes <= 10) {
            val lastChar = likes.toString().takeLast(1).toInt()
            if (lastChar == 0 || (lastChar in 5..9)) return "лайков"
            else if (lastChar == 1) return "лайк"
            else if (lastChar in 2..4) return "лайка"
        }
        else if (likes > 10) {
            val lastChar = likes.toString().takeLast(1).toInt()
            val twoLastChars = likes.toString().takeLast(2).toInt()
            if (twoLastChars == 0 || (twoLastChars in 11..20)) return "лайков"
            else if (lastChar == 0 || (lastChar in 5..9)) return "лайков"
            else if (lastChar == 1) return "лайк"
            else if (lastChar in 2..4) return "лайка"
        }
        return "облом"
    }

    fun likesCount(likes: Int): String {
        return "У вас $likes ${endingCheck(likes)}"
    }

    println(likesCount(likes))
}