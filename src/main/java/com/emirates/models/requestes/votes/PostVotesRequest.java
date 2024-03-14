package com.emirates.models.requestes.votes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostVotesRequest{

	@JsonProperty("sub_id")
	private String subId;

	@JsonProperty("image_id")
	private String imageId;

	@JsonProperty("value")
	private int value;


}