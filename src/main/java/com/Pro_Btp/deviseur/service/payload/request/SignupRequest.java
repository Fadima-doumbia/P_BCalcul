package com.Pro_Btp.deviseur.service.payload.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SignupRequest {
   @NotBlank
   @Size(min = 3, max = 20)
   private String username;
   private String lastName;

   @NotBlank
   @Size(max = 50)
   @Email
   private String email;

   private String role;

   @NotBlank
   @Size(min = 6, max = 40)
   private String password;
}
