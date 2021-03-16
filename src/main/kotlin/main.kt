import kotlin.system.exitProcess

fun main(args: Array<String>) {
    println("Type \"BREAK\" to exit")
    while (true) {
        performLogic(getAnswer())
    }
}

fun getAnswer() : String {
    println("Please enter R/P/S (rock paper scissor)")
    return readLine().toString()
}

fun performLogic(userInput: String) {

    if (userInput == "BREAK") {
        println("Exiting")
        exitProcess(0)
    }

    val rand = (Math.random() * 3)

    var chosenVal = 0

    when {
        rand >= 2 -> {
            println("The computer chose scissors!")
            chosenVal = 3

        }
        rand >= 2 -> {
            println("The computer chose paper!")
            chosenVal = 2
        }
        rand >= 1 -> {
            println("The computer chose rock!")
            chosenVal = 1
        }
    }


    // processing win/lose conditions with shitty if statements
    // ez yandere dev coding

    // rock
    if (chosenVal == 1 && userInput == "S") {
        // rock v scissor
        uLose()
    } else if (chosenVal == 1 && userInput == "P") {
        // rock v paper
        uWin()
    } else if (chosenVal == 1 && userInput == "R") {
        // rock v rock
        uDraw()
        // scissors v
    } else if (chosenVal == 2 && userInput == "S") {
        // paper v scissor
        uWin()
    } else if (chosenVal == 2 && userInput == "P") {
        // paper v paper
        uDraw()
    } else if (chosenVal == 2 && userInput == "R") {
        // paper v rock
        uLose()
    } else if (chosenVal == 3 && userInput == "S") {
        // scissor v scissor
        uDraw()
    } else if (chosenVal == 3 && userInput == "P") {
        // scissor v paper
        uLose()
    } else if (chosenVal == 3 && userInput == "R") {
        // scissor v rock
        uWin()
    } else {
        println("Error")
    }
}

fun uLose() {
    println("You lose!")
}

fun uDraw() {
    println("Draw!")
}

fun uWin() {
    println("You win!")
}