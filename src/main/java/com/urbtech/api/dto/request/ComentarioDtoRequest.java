package com.urbtech.api.dto.request;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record ComentarioDtoRequest(
        Long idPost,

        Long idUsuarioComentario,

        String comentario

){
}