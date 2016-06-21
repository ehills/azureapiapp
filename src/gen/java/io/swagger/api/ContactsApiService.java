package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Contact;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-21T04:44:27.437Z")
public abstract class ContactsApiService {
      public abstract Response contactsGet(SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response contactsGetById(Integer id,SecurityContext securityContext)
      throws NotFoundException;
}
