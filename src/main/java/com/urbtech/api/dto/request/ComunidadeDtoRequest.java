package com.urbtech.api.dto.request;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record ComunidadeDtoRequest(
        String nomeComunidade

){
}