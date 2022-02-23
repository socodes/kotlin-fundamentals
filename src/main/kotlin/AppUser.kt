class AppUser(
    //Class constructor
    val name: String,
    val joinDate: String,
    val proVersion: Boolean
) {
}

data class User(
    val uid: String,
    val name: String,
    val profilePicUrl: String = "satellite_beam"
)

//Data class adds several automatically generated functions to the class:
// equals(), hashCode(), toString(), copy()