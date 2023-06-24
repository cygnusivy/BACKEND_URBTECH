package com.urbtech.api.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Setter;
import lombok.With;

import java.time.LocalDate;

@Builder
@With
public record LoginDtoResponse(
        String email,

        @JsonIgnore
        String senha,

        String indLoginSucesso,

        LocalDate loginDate,

        Long idUser

){
}