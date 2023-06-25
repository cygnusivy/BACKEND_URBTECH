package com.urbtech.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsTests {

    private DataProvider dataProvider = new DataProvider();

    @Test
    public void testAssertionUser(){
        assertAll(
                () -> assertEquals(1L, dataProvider.userModelData().getId()),
                () -> assertEquals("Nome Usuário", dataProvider.userModelData().getNome()),
                () -> assertEquals("usuario123", dataProvider.userModelData().getNomeUsuario()),
                () -> assertEquals("email@email.com", dataProvider.userModelData().getEmail()),
                () -> assertEquals("123456789", dataProvider.userModelData().getSenha()),
                () -> assertEquals("url.com", dataProvider.userModelData().getImgUrl()),
                () -> assertEquals("site.com", dataProvider.userModelData().getSite()),
                () -> assertEquals("Descrição usuário", dataProvider.userModelData().getDescricao()),
                () -> assertEquals(LocalDate.now(), dataProvider.userModelData().getDataAberturaConta()),
                () -> assertEquals(LocalDate.of(2000, 01, 01), dataProvider.userModelData().getNascimento()),
                () -> assertEquals("Localização usuário", dataProvider.userModelData().getLocalizacao())
        );
    }

    @Test
    public void testAssertionsPostModel(){
        assertAll(
                () -> assertEquals(1L, dataProvider.postModelData().getId()),
                () -> assertEquals("Descrição postagem", dataProvider.postModelData().getDescricao()),
                () -> assertEquals(150L, dataProvider.postModelData().getQtdCurtidas()),
                () -> assertEquals(2L, dataProvider.postModelData().getIdUsuario())
        );
    }

    @Test
    public void testAssertionsComentario(){
        assertAll(
                () -> assertEquals(1L, dataProvider.comentarioModelData().getId()),
                () -> assertEquals(2L, dataProvider.comentarioModelData().getIdUsuarioComentario()),
                () -> assertEquals(3L, dataProvider.comentarioModelData().getIdPost()),
                () -> assertEquals("Comentário", dataProvider.comentarioModelData().getComentario()),
                () -> assertEquals(LocalDateTime.now(), dataProvider.comentarioModelData().getHorarioPublicacao())
        );
    }

    @Test
    public void testAssertionComunidade(){
        assertAll(
                () -> assertEquals(1L, dataProvider.comunidadeModelData().getId()),
                () -> assertEquals(LocalDateTime.now(), dataProvider.comunidadeModelData().getDataCriacaoComunidade()),
                () -> assertEquals("Comunidade", dataProvider.comunidadeModelData().getNomeComunidade()),
                () -> assertEquals(250L, dataProvider.comunidadeModelData().getQtdUsuarios()),
                () -> assertEquals(250L, dataProvider.comunidadeModelData().getQtdLimiteUsuarios())
        );
    }

    @Test
    public void testAssertionLoginModel(){
        assertAll(
                () -> assertEquals(1L, dataProvider.loginModelData().getId()),
                () -> assertEquals("email@email.com", dataProvider.loginModelData().getEmail()),
                () -> assertEquals("Login Sucesso", dataProvider.loginModelData().getDescricaoLogin()),
                () -> assertEquals("S", dataProvider.loginModelData().getIndLoginSucesso()),
                () -> assertEquals(LocalDate.now(), dataProvider.loginModelData().getLoginDate())
        );
    }

    @Test
    public void testAssertionsCurtidaModel(){
        assertAll(
                () -> assertEquals(1L, dataProvider.curtidaModelData().getId()),
                () -> assertEquals(2L, dataProvider.curtidaModelData().getIdPost()),
                () -> assertEquals(3L, dataProvider.curtidaModelData().getIdUsuarioCurtida())
        );
    }

    @Test
    public void testAssertionUsuarioComunidadeModel(){
        assertAll(
                () -> assertEquals(1L, dataProvider.usuarioComunidadeModelData().getId()),
                () -> assertEquals(2L, dataProvider.usuarioComunidadeModelData().getIdComunidade()),
                () -> assertEquals(3L, dataProvider.usuarioComunidadeModelData().getIdUsuario())
        );
    }
}