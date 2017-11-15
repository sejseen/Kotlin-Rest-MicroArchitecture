package tyma.app.mockservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MockServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(MockServiceApplication::class.java, *args)
}
