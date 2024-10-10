 ```java

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


/**

 * Controller for handling login requests.

 */

@RestController

@RequestMapping("/api/login")

public class LoginController {


    /**

     * Handles the login request.

     * @param username Username to login with.

     * @param password Password for the given username.

     * @return ResponseEntity with a message indicating success or failure.

     */

    @PostMapping

    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {

        try {

            // Validate username and password

            // Placeholder for validation logic

            boolean isValid = validateUserCredentials(loginRequest.getUsername(), loginRequest.getPassword());


            if (isValid) {

                // Placeholder for successful login logic

                return ResponseEntity.ok("Login successful!");

            } else {

                return ResponseEntity.status(401).body("Invalid username or password.");

            }

        } catch (Exception e) {

            // Log the exception and return an error response

            // Placeholder for logging

            return ResponseEntity.status(500).body("Internal server error occurred.");

        }

    }


    /**

     * Validates user credentials.

     * @param username Username to validate.

     * @param password Password to validate.

     * @return boolean indicating if the credentials are valid.

     */

    private boolean validateUserCredentials(String username, String password) {

        // Placeholder for validation logic

        return true;

    }

}


/**

 * Request object to capture login request data.

 */

class LoginRequest {

    private String username;

    private String password;


    public String getUsername() {

        return username;

    }


    public void setUsername(String username) {

        this.username = username;

    }


    public String getPassword() {

        return password;

    }


    public void setPassword(String password) {

        this.password = password;

    }

}

```