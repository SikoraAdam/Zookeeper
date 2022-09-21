fun main() {
    println(
        """
            {
                "firstName": "John",
                "lastName": "Smith",
                "age": 35,
                "phoneNumbers": [
                    {
                        "type": "mobile",
                        "number": "123 567-7890"
                    }
                ]
            }
        """.trimIndent()
    )

    val sum = 54
    println()

    if (sum % 2 == 0)
        println(sum / 2)
    else
        println((sum + 1) / 2)
}