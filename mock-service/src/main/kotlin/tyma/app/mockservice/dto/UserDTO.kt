package tyma.app.mockservice.dto

data class UserDTO(val email: String = "", val name: String = "", val lastname: String = "")

fun UserDTO.toUser(): User {
    return User(email = email, name = name, lastname = lastname)
}