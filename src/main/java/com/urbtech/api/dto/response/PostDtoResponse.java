package com.urbtech.api.dto.response;

import lombok.Builder;
import lombok.With;

import java.util.List;

@Builder
@With
public record PostDtoResponse(
        Long id,

        String nomeUsuario,

        String imgUrlUsuario,

        String imgUrl,

        String descricao,

        Long qtdCurtidas,

        List<ComentarioResponse> listaComentario

){
}