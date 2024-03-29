/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Deposit;
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
@Api(value = "deposits", description = "the deposits API")
public interface DepositsApi {

    @ApiOperation(value = "Creates an deposit", nickname = "createDeposit", notes = "Creates a new deposit moment", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={ "deposits", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Money succesfully deposited"),
        @ApiResponse(code = 400, message = "There occured an error") })
    @RequestMapping(value = "/deposits",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> createDeposit(@ApiParam(value = "Account details" ,required=true )  @Valid @RequestBody Deposit body);


    @ApiOperation(value = "Returns all deposits", nickname = "getDeposits", notes = "Returns a list of all deposits", response = Deposit.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={ "deposits", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the deposits list", response = Deposit.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "There occured an error") })
    @RequestMapping(value = "/deposits",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Deposit>> getDeposits();


    @ApiOperation(value = "Returns the deposits of the specified account", nickname = "getDepositsByIban", notes = "Returns the specified IBAN deposits", response = Deposit.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={ "deposits", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the account", response = Deposit.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid IBAN") })
    @RequestMapping(value = "/deposits/{iban}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Deposit>> getDepositsByIban(@DecimalMin("1")@ApiParam(value = "The account IBAN",required=true) @PathVariable("iban") String iban);

}
