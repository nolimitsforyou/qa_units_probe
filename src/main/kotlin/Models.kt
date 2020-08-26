class User(
    firstName: String,
    lastName: String,
) {
    private val name = firstName
    private val family = lastName
    var profession: String? = null

    fun sayYourName(){
        println("$name $family")
    }

    fun sayYourProfession(){
        if (profession != null) {
            println(profession)
        } else {
            println("I have no profession")
        }
    }
}