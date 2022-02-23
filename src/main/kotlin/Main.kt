fun main(args: Array<String>) {
    val aUser=AppUser(
        "Firat",
        "now",
        false
    )

    //Profile Pic is given default.
    val user = User(
        "12345",
        "Ahmet"
    )
}

//cohesion: The degree to which things belong together (in a class)

//cohesive class
class Dog(
    val age: Int,
    val weight: Double,
    val height: Double,
    val name: String,
    val owner: User
) {
    fun makeSound(){
        println("BARK!")
    }
}