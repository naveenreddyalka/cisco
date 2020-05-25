package com.exercise.cisco.domain.models.response;

import com.exercise.cisco.domain.constants.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class URLInfoResponse extends BaseResponse{

	@JsonIgnore
	private static final long serialVersionUID = -9055359157207400449L;
	
	private Status urlStatus;
}
