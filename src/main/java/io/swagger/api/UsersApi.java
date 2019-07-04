/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Account;
import io.swagger.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-29T12:43:24.827Z[GMT]")
@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "Creates a new user", nickname = "createUser", notes = "Creates a new user, if the logged in user is an employee, and returns the userId", response = Integer.class, authorizations = {
        @Authorization(value = "cookieAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "User created", response = Integer.class),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 403, message = "Forbidden, you do not have the required rights"),
        @ApiResponse(code = 500, message = "Oops, something went wrong on the server. Sorry!") })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> createUser(@ApiParam(value = ""  )  @Valid @RequestBody User body);


    @ApiOperation(value = "Returns all accounts of the specified user", nickname = "getAccountsByUserId", notes = "Returns a list of accounts, belonging to the logged in user", response = Account.class, responseContainer = "List", authorizations = {
        @Authorization(value = "cookieAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the account(s)", response = Account.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 403, message = "Forbidden, you do not have the required rights"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Oops, something went wrong on the server. Sorry!") })
    @RequestMapping(value = "/users/{userId}/accounts",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Account>> getAccountsByUserId(@ApiParam(value = "The user Id",required=true) @PathVariable("userId") Integer userId) throws ApiException;


    @ApiOperation(value = "Returns specified user", nickname = "getUserById", notes = "Returns the specified user", response = User.class, authorizations = {
        @Authorization(value = "cookieAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User found", response = User.class),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 403, message = "Forbidden, you do not have the required rights"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Oops, something went wrong on the server. Sorry!") })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUserById(@Min(1)@ApiParam(value = "The user ID",required=true, allowableValues = "") @PathVariable("userId") Integer userId) throws ApiException;


    @ApiOperation(value = "Returns all users", nickname = "getUsers", notes = "Returns a list of all users", response = User.class, responseContainer = "List", authorizations = {
        @Authorization(value = "cookieAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User(s) found", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 403, message = "Forbidden, you do not have the required rights"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Oops, something went wrong on the server. Sorry!") })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> getUsers() throws ApiException;
}
