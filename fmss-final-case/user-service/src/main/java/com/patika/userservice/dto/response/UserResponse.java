package com.patika.userservice.dto.response;

import com.patika.userservice.model.Role;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private Long id;

    private String name;

    private Role role;
    private String surname;

    private String mail;

}
