package com.emirates.models.responses.categories.getcategories;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class GetCategoriesResponse {

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;


}