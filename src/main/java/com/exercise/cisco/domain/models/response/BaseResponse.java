package com.exercise.cisco.domain.models.response;

import java.io.Serializable;
import java.util.Date;

import com.exercise.cisco.domain.constants.Status;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse implements Serializable {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Date requestDateTime;
	private Date responseDateTime = new Date();
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Status status;

}
