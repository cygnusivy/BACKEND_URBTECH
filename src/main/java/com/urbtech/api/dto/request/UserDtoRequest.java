package com.urbtech.api.dto.request;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record UserDtoRequest(
        String nome,

        String imgUrl,

        String email,

        String senha,

        String senha2
){
}