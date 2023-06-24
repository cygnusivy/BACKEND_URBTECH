package com.urbtech.domain.service;

import com.urbtech.api.dto.request.ComentarioDtoRequest;
import com.urbtech.api.dto.response.ComentarioResponse;
import com.urbtech.api.mapper.ComentarioMapper;
import com.urbtech.domain.model.ComentarioModel;
import com.urbtech.domain.model.UserModel;
import com.urbtech.domain.repository.ComentarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComentarioService {

    private ComentarioRepository comentarioRepository;

    private UserService userService;

    private ComentarioMapper comentarioMapper;

    @Transactional
    public ComentarioResponse comentar(ComentarioDtoRequest comentarioDtoRequest){
        this.userService.validaContaComIdUsuario(comentarioDtoRequest.idUsuarioComentario());

        UserModel userModelComentario = this.userService.buscaUsuarioPeloId(comentarioDtoRequest.idUsuarioComentario());

        ComentarioModel comentarioModel = comentarioMapper.dtoToModel(comentarioDtoRequest);
        comentarioModel.setHorarioPublicacao(LocalDateTime.now());

        this.comentarioRepository.save(comentarioModel);

        ComentarioResponse comentarioResponse = comentarioMapper.modelToRequest(comentarioModel);
        comentarioResponse.withNomeUsuarioComentario(userModelComentario.getNome());
        comentarioResponse.withImgUrlUsuarioComentario(userModelComentario.getImgUrl());

        return comentarioResponse;
    }

    public List<ComentarioResponse> comentarioResponseList(Long idPost){

        List<ComentarioModel> comentarioModelList = this.comentarioRepository.findAllByIdPost(idPost);
        List<ComentarioResponse> comentarioResponseList = new ArrayList<>();

        for (ComentarioModel comentarioModel : comentarioModelList){

            ComentarioResponse comentarioResponse = this.comentarioMapper.modelToRequest(comentarioModel);
            UserModel userComentario = this.userService.buscaUsuarioPeloId(comentarioResponse.idUsuarioComentario());

            comentarioResponse.withImgUrlUsuarioComentario(userComentario.getImgUrl());
            comentarioResponse.withNomeUsuarioComentario(userComentario.getNome());

            comentarioResponseList.add(comentarioResponse);
        }

        return comentarioResponseList;
    }

}