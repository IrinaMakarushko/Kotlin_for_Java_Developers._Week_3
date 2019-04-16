package nicestring


fun String.isNice(): Boolean {
    if(this.isEmpty()){
        return false
    }
    val str = this.toLowerCase()
    val hasBuBaBe = hasBuBaBe(str)
    val hasAtLeastThreeVowels = hasAtLeast3Vowels(str)
    val hasDoubleLetters = hasDoubleLetters(str)
    return (!hasBuBaBe && hasAtLeastThreeVowels) ||
            (!hasBuBaBe && hasDoubleLetters) ||
            (hasAtLeastThreeVowels && hasDoubleLetters)

}

fun hasBuBaBe(str: String): Boolean{
    return str.contains("ba") ||
            str.contains("bu") ||
            str.contains("be")
}

fun hasAtLeast3Vowels(str: CharSequence): Boolean {
    val countVowels = str.count { letter ->
                letter.equals('a') ||
                letter.equals('e') ||
                letter.equals('i') ||
                letter.equals('o') ||
                letter.equals('u')
    }
    return countVowels >= 3
}

fun hasDoubleLetters(str: CharSequence): Boolean{
    var previousLetter = '1'
    for(letter in str){
        if(letter.equals(previousLetter)){
            return true
        }
        previousLetter = letter
    }
    return false
}