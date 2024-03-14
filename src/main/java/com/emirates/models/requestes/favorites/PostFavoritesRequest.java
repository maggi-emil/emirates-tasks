package com.emirates.models.requestes.favorites;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Data
@With
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class PostFavoritesRequest {

	@JsonProperty("sub_id")
	private String subId;

	@JsonProperty("image_id")
	private String imageId;


}