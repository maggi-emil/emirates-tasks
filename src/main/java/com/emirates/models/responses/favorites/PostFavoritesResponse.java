package com.emirates.models.responses.favorites;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Data
@With
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class PostFavoritesResponse{

	@JsonProperty("id")
	private int id;

	@JsonProperty("message")
	private String message;
}

