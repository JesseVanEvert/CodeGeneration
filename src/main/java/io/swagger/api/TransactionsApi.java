/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Transaction;
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
@Api(value = "transactions", description = "the transactions API")
public interface TransactionsApi {

    @ApiOperation(value = "Place a new transaction", nickname = "createTransaction", notes = "Creates a transaction of the specified amount between the specified accounts", response = Integer.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={ "transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "succes and returns transactionID", response = Integer.class),
        @ApiResponse(code = 400, message = "the operation is unsuccesfull") })
    @RequestMapping(value = "/transactions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> createTransaction(@ApiParam(value = ""  )  @Valid @RequestBody Transaction body);


    @ApiOperation(value = "Get transactions depending on the optional parameters; the abstinence of any parameters results in all transactions.", nickname = "getTransactions", notes = "", response = Transaction.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={ "transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "succes", response = Transaction.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Nee") })
    @RequestMapping(value = "/transactions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Transaction>> getTransactions(@ApiParam(value = "The id of a transaction") @Valid @RequestParam(value = "transactionID", required = false) Integer transactionID,@ApiParam(value = "The iban of the sending backaccount") @Valid @RequestParam(value = "from", required = false) String from,@ApiParam(value = "The iban of the receiving backaccount") @Valid @RequestParam(value = "to", required = false) String to,@ApiParam(value = "The userId of the user who performed the transaction") @Valid @RequestParam(value = "performedBy", required = false) Integer performedBy);

}
