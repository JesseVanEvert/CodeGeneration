/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Account;
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
@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    @ApiOperation(value = "Creates a new account", nickname = "createAccount", notes = "Creates a new account, if the logged in user is an employee", response = String.class, authorizations = {
        @Authorization(value = "cookieAuth")    }, tags={ "account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Account created", response = String.class),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 403, message = "Forbidden, you do not have the required rights"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Oops, something went wrong on the server. Sorry!") })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" },
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<String> createAccount(@ApiParam(value = "Account details" )  @Valid @RequestBody Account body);


    @ApiOperation(value = "Deletes the specified account", nickname = "deleteAccount", notes = "Deletes the specified account, if the logged in user is an employee AND the balance of the account is zero", authorizations = {
        @Authorization(value = "cookieAuth")    }, tags={ "account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account deleted"),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 403, message = "Forbidden, you do not have the required rights"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Oops, something went wrong on the server. Sorry!") })
    @RequestMapping(value = "/accounts/{iban}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAccount(@ApiParam(value = "The iban",required=true) @PathVariable("iban") String iban) throws ApiException;


    @ApiOperation(value = "Returns the specified account", nickname = "getAccountByIban", notes = "Returns the account, specified by the iban", response = Account.class, authorizations = {
        @Authorization(value = "cookieAuth")    }, tags={ "account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account found", response = Account.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Oops, something went wrong on the server. Sorry!") })
    @RequestMapping(value = "/accounts/{iban}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Account> getAccountByIban(@ApiParam(value = "The iban of the account you want to retrieve",required=true) @PathVariable("iban") String iban) throws ApiException;


    @ApiOperation(value = "Returns all accounts", nickname = "getAccounts", notes = "Returns a list of all accounts, if the logged in user is an employee", response = Account.class, responseContainer = "List", authorizations = {
        @Authorization(value = "cookieAuth")    }, tags={ "account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account(s) found", response = Account.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 403, message = "Forbidden, you do not have the required rights"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Oops, something went wrong on the server. Sorry!") })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Account>> getAccounts(@ApiParam(value = "The type of accounts that need to be considered to filter", allowableValues = "current, savings") @Valid @RequestParam(value = "type", required = false) String type) throws ApiException;


    @ApiOperation(value = "Toggles the status of the specified account", nickname = "toggleAccountStatus", notes = "Toggles the status of the specified account, active or frozen", authorizations = {
        @Authorization(value = "cookieAuth")    }, tags={ "account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status updated"),
        @ApiResponse(code = 400, message = "Invalid input"),
        @ApiResponse(code = 403, message = "Forbidden, you do not have the required rights"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Oops, something went wrong on the server. Sorry!") })
    @RequestMapping(value = "/accounts/{iban}",
        method = RequestMethod.PUT)
    ResponseEntity<Void> toggleAccountStatus(@ApiParam(value = "The iban",required=true) @PathVariable("iban") String iban);

}
