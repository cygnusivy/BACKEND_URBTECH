package com.urbtech.domain;

import com.urbtech.domain.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataProvider {

    public UserModel userModelData(){
        return new UserModel(){{
            setId(1L);
            setEmail("email@email.com");
            setSenha("123456789");
            setNome("Nome Usuário");
            setDataAberturaConta(LocalDate.now());
            setImgUrl("url.com");
            setDescricao("Descrição usuário");
            setNascimento(LocalDate.of(2000, 01, 01));
            setSite("site.com");
            setLocalizacao("Localização usuário");
            setNomeUsuario("usuario123");
        }};
    }

    public PostModel postModelData(){
        return new PostModel(){{
            setId(1L);
            setDescricao("Descrição postagem");
            setImgUrl("url.com");
            setQtdCurtidas(150L);
            setIdUsuario(2L);
        }};
    }

    public ComunidadeModel comunidadeModelData(){
        return new ComunidadeModel(){{
            setId(1L);
            setDataCriacaoComunidade(LocalDateTime.now());
            setNomeComunidade("Comunidade");
            setQtdUsuarios(250L);
            setQtdLimiteUsuarios(250L);
        }};
    }

    public ComentarioModel comentarioModelData(){
        return new ComentarioModel(){{
            setId(1L);
            setComentario("Comentário");
            setIdUsuarioComentario(2L);
            setIdPost(3L);
            setHorarioPublicacao(LocalDateTime.now());
        }};
    }

    public LoginModel loginModelData(){
        return new LoginModel(){{
            setId(1L);
            setIndLoginSucesso("S");
            setEmail("email@email.com");
            setDescricaoLogin("Login Sucesso");
            setLoginDate(LocalDate.now());
        }};
    }

    public CurtidaModel curtidaModelData(){
        return new CurtidaModel(){{
            setId(1L);
            setIdPost(2L);
            setIdUsuarioCurtida(3L);
        }};
    }

    public UsuarioComunidadeModel usuarioComunidadeModelData(){
        return new UsuarioComunidadeModel(){{
            setId(1L);
            setIdComunidade(2L);
            setIdUsuario(3L);
        }};
    }
}