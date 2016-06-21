package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-21T04:44:27.437Z")
public class Contact {

	private Integer id = null;
	private String name = null;
	private String emailAddress = null;

	public Contact(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.emailAddress = email;
	}

	/**
	 **/
	public Contact id(Integer id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(value = "")
	@JsonProperty("Id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 **/
	public Contact name(String name) {
		this.name = name;
		return this;
	}

	@ApiModelProperty(value = "")
	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 **/
	public Contact emailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	@ApiModelProperty(value = "")
	@JsonProperty("EmailAddress")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Contact contact = (Contact) o;
		return Objects.equals(id, contact.id) && Objects.equals(name, contact.name)
				&& Objects.equals(emailAddress, contact.emailAddress);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, emailAddress);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Contact {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
