package tyma.app.mockservice.repository

import org.springframework.data.repository.CrudRepository
import tyma.app.mockservice.dto.User

interface UserRepository : CrudRepository<User, String>