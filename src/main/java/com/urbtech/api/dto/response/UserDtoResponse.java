package com.urbtech.api.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.With;

import java.time.LocalDate;

@Builder
@With
public record UserDtoResponse(
        Long id,

        String nome,

        String email,

        String imgUrl,

        String descricao,

        String localizacao,

        String site,
        LocalDate nascimento

){
}