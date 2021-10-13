fun main (){

    println("Welcome to program that calculate the new annual salary depending on the performance of the employee")
        println("Please enter the current annual salary")
            val currentSalary = readLine()!!.toDouble()
                val performanceRate = readLine()!!.toInt()
                    var raiseOfSalary = 0.0
                    if(performanceRate == 1){
                        raiseOfSalary = (currentSalary * 6/100)

                    }else if (performanceRate == 2){
                        raiseOfSalary = (currentSalary * 4/100)

                    }else if (performanceRate == 3){
                        raiseOfSalary = (currentSalary * 1.5/100)

                    }else{
                        println("The entered performance rate number is wrong")

                    }

    val newSalary = currentSalary + raiseOfSalary
    println("The raise of your annual salary = $raiseOfSalary \nThe new annual salary = $newSalary")

}