package tyma.app.mockservice.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import tyma.app.mockservice.dto.UserDTO
import tyma.app.mockservice.dto.toUser
import tyma.app.mockservice.dto.toUserDTO
import tyma.app.mockservice.repository.UserRepository
import java.net.URI

@RestController
class UsersController(val userRepo: UserRepository) {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/{userId}")
    fun getUser(@PathVariable userId: String): UserDTO {
        return userRepo.findOne(userId).toUserDTO()
    }

    @PostMapping(("/users"))
    fun createUser(@RequestBody userDTO: UserDTO, builder: UriComponentsBuilder): ResponseEntity<Unit> {
        val createdURI = builder.path("/{userId}").buildAndExpand(userRepo.save(userDTO.toUser()).id).toUriString()
        return ResponseEntity.created(URI(createdURI)).build()
    }
}