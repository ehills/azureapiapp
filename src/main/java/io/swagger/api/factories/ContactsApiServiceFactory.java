package io.swagger.api.factories;

import io.swagger.api.ContactsApiService;
import io.swagger.api.impl.ContactsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-21T04:44:27.437Z")
public class ContactsApiServiceFactory {

   private final static ContactsApiService service = new ContactsApiServiceImpl();

   public static ContactsApiService getContactsApi()
   {
      return service;
   }
}
