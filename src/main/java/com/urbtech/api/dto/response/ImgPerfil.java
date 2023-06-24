package com.urbtech.api.dto.response;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record ImgPerfil(
        String urlFotoPerfil

){
}