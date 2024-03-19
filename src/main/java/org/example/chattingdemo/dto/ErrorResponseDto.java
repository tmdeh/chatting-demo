package org.example.chattingdemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponseDto {
  private int status;
  private String message;
  private String trace;

  public ErrorResponseDto(int status, String message, String code) {
    this.status = status;
    this.message = message;
    this.trace = code;
  }
}
