package io.swagger.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.ContactsApiServiceFactory;
import io.swagger.model.Contact;

@Path("/contacts")

@io.swagger.annotations.Api(description = "the contacts API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-21T04:44:27.437Z")
public class ContactsApi {
	private final ContactsApiService delegate = ContactsApiServiceFactory.getContactsApi();

	@GET
	@Produces({ "application/json", "text/json" })
	@io.swagger.annotations.ApiOperation(value = "", notes = "", response = Contact.class, responseContainer = "List", tags = {
			"Contact", })
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Contact.class, responseContainer = "List") })
	public Response contactsGet(@Context SecurityContext securityContext) throws NotFoundException {
		return delegate.contactsGet(securityContext);
	}

	@GET
	@Path("/{id}")
	@Produces({ "application/json", "text/json" })
	@io.swagger.annotations.ApiOperation(value = "", notes = "", response = Contact.class, responseContainer = "List", tags = {
			"Contact" })
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Contact.class, responseContainer = "List") })
	public Response contactsGetById(@ApiParam(value = "", required = true) @PathParam("id") Integer id,
			@Context SecurityContext securityContext) throws NotFoundException {
		return delegate.contactsGetById(id, securityContext);
	}
}
