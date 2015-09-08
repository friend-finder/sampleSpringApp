package com.ffg.controller;

import com.ffg.model.User;
import com.ffg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by connor on 9/8/15.
 */
@RestController
@RequestMapping("v1/user")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<User>> getAllTypes() {
        return new ResponseEntity<Iterable<User>>(userRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getById(@PathVariable long id) {
        return new ResponseEntity<User>(userRepository.findOne(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/email/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
        return new ResponseEntity<User>(userRepository.findByEmail(email), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<User>> getByName(@RequestParam(value = "firstName") String firstName,
                                          @RequestParam(value = "lastName") String lastName) {
        return new ResponseEntity<Iterable<User>>(userRepository.findByFirstNameAndLastName(firstName, lastName),
                HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<User>(userRepository.save(user), HttpStatus.OK);
    }
}
