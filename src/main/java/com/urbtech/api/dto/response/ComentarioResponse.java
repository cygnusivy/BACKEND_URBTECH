package com.urbtech.api.dto.response;

import lombok.Builder;
import lombok.With;

import java.time.LocalDateTime;

@Builder
@With
public record ComentarioResponse(
        Long id,

        Long idPost,

        Long idUsuarioComentario,

        String nomeUsuarioComentario,

        String imgUrlUsuarioComentario,

        String comentario,

        LocalDateTime horarioPublicacao

){
}